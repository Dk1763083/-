<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
	<head>
	   <style type="text/css">
         body{ background-image:url("../image/2.jpg");background-repeat:repeat }
		 
		 span{ font-size:30px; color:red; font-weight:bolder;margin-left:200px }
      .f{ width:150px; height:70px}
	  
	  .d{ text-align:center; word-spacing:20px;width:70%}
      img{ border:none }
	  
      </style>

  </head>
  <body>&nbsp;  
    
	<!-- Title -->
     <img src="../image/zgc_px.jpg" align="middle" class="f"/>
     <span>欢迎访问我的购物网站</span>
     <hr/>
   
   <!--  Menu Bar  -->
   <center>
   <div class="d">
     <a href="/shoppingcar/ProductAction/ProductAction_QueryAllPro"><img src="../image/index.gif"/></a>
     <a href="/shoppingcar/UserAction/UserAction_UserManage?username=${username}"><img src="../image/reg.gif"/></a>
     <a href="/shoppingcar/ProductAction/ProductAction_ShopCar"><img src="../image/cart.gif"/></a>
     <a href="/shoppingcar/UserAction/UserAction_SafeQuit"><img src="../image/exit.gif"/></a>
   </div> 
  </center>
  
	
     <form action="" method="post">
  	 <table border="1" bordercolor="blue" cellspacing="0" align="center" width="80%">
  		<tbody id="tbody">
  			<tr bgcolor="lightblue" align="center">
  				<td><b>商品编号</b></td>
  				<td><b>商品名称</b></td>
				<td><b>图片</b></td>
  				<td><b>商品单价</b></td>
  				<td><b>数量</b></td>
  				<td><b>总价</b></td>
  				<td><b>删除</b></td>
  			</tr>
  			<c:forEach items="${ListP}" var="p">
  			<tr align="center">
  	          <td>${p.id}</td>
  	          <td>${p.productName}</td>
		       <td><img src="..${p.picpath}"/></td>
  	           <td>${p.price}</td>
			   <td><input type=button value="-" onclick="window.location.href='/shoppingcar/ProductAction/ProductAction_Reduce?id=${p.id}'">${pis[p.id]}<input type=button  value="+" onclick="window.location.href='/shoppingcar/ProductAction/ProductAction_Add?id=${p.id}'"></td>
			   <td>${p.price*pis[p.id]}</td>
  	          <td><a href="/shoppingcar/ProductAction/ProductAction_DropProduct?id=${p.id}">删除</a></td>
  	        </tr>
  	        </c:forEach>
  		</tbody>
  	</table>
  	</form>
  </body>
</html>