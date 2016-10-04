CREATE TABLE order_entry(ordenes XMLType);

INSERT INTO order_entry VALUES ('<Orders></Orders>');

CREATE OR REPLACE PROCEDURE crearOrden
  (p_order_id VARCHAR2,
  p_cust_name VARCHAR2,
  p_product_name VARCHAR2,
  p_unit_price VARCHAR2,
  p_quantity VARCHAR2)
IS
BEGIN
  update order_entry
  set ordenes = appendchildxml(ordenes,
  '/Orders',
  '<Order>
    <order_id>p_order_id</order_id>
    <cust_name>p_cust_name</cust_name>
    <Order_Items>
      <Item>
        <product_name>p_product_name</product_name>
        <unit_price>p_unit_price</unit_price>
        <quantity>p_quantity</quantity>
      </Item>
    </Order_Items>
   </Order>');
END;
/

CREATE OR REPLACE PROCEDURE leerOrden
  (p_order_id IN VARCHAR2,
  p_order OUT VARCHAR2)
IS
  v_order XMLType;
BEGIN
  SELECT extract(ordenes, '/Orders/Order[order_id='p_order_id']')
  INTO v_order
  FROM order_entry;
  p_order := v_order.getStringVal();
END;
/

CREATE OR REPLACE PROCEDURE modificarOrden
  (p_order_id VARCHAR2,
  p_product_name VARCHAR2)
IS
BEGIN
  UPDATE order_entry SET ordenes = updatexml(ordenes,
  '/Orders/Order[order_id='p_order_id']/Order_Items/Item/product_name/text()',
  p_product_name);
END;
/

CREATE OR REPLACE PROCEDURE eliminarOrden
  (p_order_id VARCHAR2)
IS
BEGIN
  UPDATE order_entry SET ordenes = deletexml(ordenes,
  '/Orders/Order[order_id='p_order_id']');
END;
/
