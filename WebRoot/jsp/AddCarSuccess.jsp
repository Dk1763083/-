<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
  <head>
    <style type="text/css">
      body{ background-image:url("../image/2.jpg");background-repeat:repeat }
    </style>
  </head>
  <body>&nbsp;  
   <center>
     <img src="../image/success.gif"/>
      <h1> 已成功将${productName}商品添加至购物车</h1>
     <h1><a href="/shoppingcar/ProductAction/ProductAction_QueryAllPro">继续购物</a>&nbsp;&nbsp;
         <a href="/shoppingcar/ProductAction/ProductAction_ShopCar">去购物车结算</a>
     </h1>
   </center>
 </body>
</html>