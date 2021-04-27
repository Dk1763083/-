<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
  <head>
    <style type="text/css">
      body{  background-image:url("../image/2.jpg");background-repeat:repeat }
	  span{ font-size:30px; color:red; font-weight:bolder;margin-left:200px }
      .f{ width:150px; height:70px}
	  .d{ text-align:center; word-spacing:20px;width:70%}
      img{ border:none }
      td.TableBody1{background-color: #FFFFFF;line-height : normal ;}
      td.TableBody2{background-color: #E4F3FF;line-height : normal ;}
      .tableBorder1{width:97%;border: 1px; background-color: #AFB2C4;}
    </style>
    <script type="text/javascript">
	function fun(){
		var a=document.getElementById("code");
		a.src="/shoppingcar/securityCode/securityCode_securityCode?date="+new Date().getTime();  
	}
    </script>
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
   </div> 
  </center>
  
  <!-- 正文  -->
   
   <form  method="post" action="/shoppingcar/UserAction/UserAction_Login">
<table cellpadding=3 cellspacing=1 align=center class=tableborder1>
  
  <tr bgcolor="lightblue">
    <td height=25 colspan=2 align="center" valign="middle" ><font color="#ffffff"><b>输入您的用户名、密码登录</b></font></td>
  </tr>
  <tr>
    <td valign="middle" class="tablebody1">请输入您的用户名</td>
    <td valign="middle" class="tablebody1"><input name="username" type="text"/>
      &nbsp; <a href="/shoppingcar/jsp/CreateUserView.jsp">没有注册？</a> </td>
  </tr>
  <tr>
    <td valign="middle" class="tablebody1">请输入您的密码</td>
    <td valign="middle" class="tablebody1"><input name="password" type="password"> &nbsp; </td>
  </tr>
   <tr>
    <td valign="middle" class="tablebody1">请输入验证码</td>
    <td valign="middle" class="tablebody1"><input name="code" type="text"> &nbsp;<img id="code" src="/shoppingcar/securityCode/securityCode_securityCode"/><a href="#" onclick="fun()">看不清换一张</a></td>
  </tr>
  <tr>
    <td class="tablebody2" valign="middle" colspan=2 align=center><input type="submit" value="登 录"></td>
  </tr>
</table>
</form>
   &nbsp;<br/>
   </body>
   </html>