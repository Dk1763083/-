<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
  <head>
    <style type="text/css">
      .c1{ text-align:right ;margin-right:50px }
      .c2{ text-align:right ;margin-right:50px ; color:blue; font-size:150% }
      body{ background-image:url("../image/2.jpg");background-repeat:repeat }
	  span{ font-size:30px; color:red; font-weight:bolder;margin-left:200px }
      .f{ width:150px; height:70px}
	  .d{ text-align:center; word-spacing:20px;width:70%}
      img{ border:none }
	  .queryButton{ background-color:yellow;
          background-image:url("../image/button12.gif") ;
          width:60px;height:30px; border:none
         }
    </style>
  </head>
  <body>&nbsp;   
  <!-- Title -->
     <img src="../image/zgc_px.jpg" align="middle" class="f"/>
     <span>欢迎访问我的购物网站</span>
     <hr/>
     <c:if test="${username==null}">
  		 <div class="c2"><a href="/shoppingcar/jsp/LoginView.jsp">请登录</a></div>
  	</c:if>
  	 <c:if test="${username!=null}">
  		 <div class="c2">欢迎${username}&nbsp; <a href="/shoppingcar/User/UserAction_SafeQuit"> <img src="../image/exit.gif"/></a></div>
  	</c:if>
   <!--  Menu Bar  -->
   <center>
   <div class="d">
     <a href="/shoppingcar/ProductAction/ProductAction_QueryAllPro"><img src="../image/index.gif"/></a>
     <a href="/shoppingcar/UserAction/UserAction_UserManage?username=${username}"><img src="../image/reg.gif"/></a>
     <a href="/shoppingcar/ProductAction/ProductAction_ShopCar"><img src="../image/cart.gif"/></a>
   </div> 
  </center>
   <table border="1" bordercolor="blue" cellspacing=0 align="center" width="70%">
     <tr align="center" bgcolor="lightblue">
       <td><b>Id</b></td>
        <td><b>Name</b></td>
		<td><b>图片</b></td>
         <td><b>Price</b></td>
        <td><b><img src="../image/car_new.gif"/></b></td>
     </tr>
     <c:forEach items="${ListP}" var="p">
        <tr align="center">
          <td>${p.id}</td>
          <td>${p.productName}</td>
		  <td><img src="..${p.picpath}"/></td>
          <td>${p.price}</td> 
          <td align="center"><a href="/shoppingcar/ProductAction/ProductAction_AddProduct?id=${p.id}"><img src="../image/car_new.gif"/></a></td>
        </tr>
        </c:forEach>
   </table>
   <p>&nbsp;</p>
   <!-- 分页 --> 
   <center>
   <c:if test="${index>1}">
     <a href="/shoppingcar/ProductAction/ProductAction_QueryAllPro?index=${index-1}">上一页</a>
	&nbsp;
	</c:if>
    共<font color="red">${count}</font> 页
    这是第 <font color="red">${index}</font> 页
    &nbsp; 
    <c:if test="${index<count}">
    <a href="/shoppingcar/ProductAction/ProductAction_QueryAllPro?index=${index+1}">下一页</a>
    &nbsp; 
    </c:if>
</center>
  </body>
</html>