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
	  
      td.TableBody1{background-color: #FFFFFF;line-height : normal ;}
      td.TableBody2{background-color: #E4F3FF;line-height : normal ;}
      .tableBorder1{width:97%;border: 1px; background-color: #AFB2C4;}
    </style>
    <script type="text/javascript">
   	function fun(){
	var a=document.getElementById("zip");
		if(a.value==""){a.value=0;}
    return true;
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
     <a href="/shoppingcar/UserAction/UserAction_SafeQuit"><img src="../image/exit.gif"/></a>
   </div> 
  </center>
   
   
 <form  method="post" action="/shoppingcar/UserAction/UserAction_UpdateUser" onsubmit="return fun()">
  <table cellpadding="3" cellspacing="1" align="center" class="tableborder1" id="table1">
    <tr>
      <td valign="middle" colspan="2" align="center" height="25" bgcolor="lightblue">
        <font color="#ffffff"><b>用户信息修改</b></font></td>
    </tr>
    <tr>
      <td width="40%" class="tablebody1"><b>用户名</b>：</td>
      <td width="60%" class="tablebody1">
        <input type="text" name="user.username" maxlength="16" size="32" value="${User.username}" 
              style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000"  readonly>
      </td>
    </tr>
     <tr>
	<td class="tablebody1"><b>真实姓名</b>：</td>
        <td class="tablebody1">
          <input type="text" name="user.name" maxlength="32" size="64" value="${User.name}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000"></td>
    </tr>
    <tr>
	<td class="tablebody1"><b>联系地址</b>：</td>
        <td class="tablebody1">
          <input type="text" name="user.address" maxlength="32" size="64" value="${User.address}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000"></td>
    </tr>
    <tr>
	<td class="tablebody1"><b>邮编</b>：</td>
        <td class="tablebody1">
          <input id="zip" type="text" name="user.zip" maxlength="8" size="32" value="${User.zip}" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
        </td>
    </tr>
    <tr>
	<td class="tablebody2" valign="middle" colspan="2" align="center">
          <input type="submit" value="修改"></td>
    </tr>
  </table>
</form>
   &nbsp;<br/>
   </body>
   </html>