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
    	function fun1(btn){
    		if(btn.value!=${User.password}){
    			var a=document.getElementById("f1");
				a.innerText="密码错误";
    		}else{
    			var a=document.getElementById("f1");
				a.innerText="";
    		}
    	}
    	function fun2(btn){
    		if(btn.value==""||btn.value.length<6){
    			var a=document.getElementById("f2");
				a.innerText="密码不能为空且大于等于6位";
    		}else{
    			var b=document.getElementById("f2");
				b.innerText="";
    		}
    	}
   		function fun3(a){
   			var b=document.getElementById("pass1");
    		if(a.value!=b.value){
    			var c=document.getElementById("f3");
				c.innerText="密码不一致";
    		}else{
    			var c=document.getElementById("f3");
				b.innerText="";
    		}
    	}
    	function fun4(){
    		var a=document.getElementById("oldPass");
    		var b=document.getElementById("pwd1");
    		var c=document.getElementById("pwd2");
    		if(a.value!=${User.password}){
    			alert("密码错误");
    			return false;
    		}else{
				if(b.value==""||b.value.length<6){
					alert("密码不能为空且大于6位");
					return false;
				}else{
					if(c.value!=b.value){
						alert("密码不一致");
						return false;
					}else{
						return true;
					}
				}
    		}
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

   <form  method="post" action="/shoppingcar/UserAction/UserAction_UpdateUserPwd" onsubmit="return fun4()" >
   <input name="username" type="text" hidden="hidden" value="${username}"/>
<table cellpadding=3 cellspacing=1 align=center class=tableborder1>
  
  <tr bgcolor="lightblue">
    <td height=25 colspan=2 align="center" valign="middle" ><font color="#ffffff"><b>输入您的原有密码,新密码</b></font></td>
  </tr>
  <tr>
    <td valign="middle" class="tablebody1">请输入您的旧密码</td>
    <td valign="middle" class="tablebody1"><input id="oldPass" name="oldPass" type="text" onblur="fun1(this)" maxlength="8"/><font id="f1" size="2" color="red"></font></td>
  </tr>
  <tr>
    <td valign="middle" class="tablebody1">请输入您的新密码</td>
    <td valign="middle" class="tablebody1"><input id="pwd1" name="newpassword" type="password" onblur="fun2(this)" maxlength="8"> &nbsp; <font id="f2" size="2" color="red"></font></td>
  </tr>
    <tr>
    <td valign="middle" class="tablebody1">请再次输入您的新密码</td>
    <td valign="middle" class="tablebody1"><input id="pwd2" name="password" type="password" onblur="fun3(this)" maxlength="8"> &nbsp; <font id="f3" size="2" color="red"></font></td>
  </tr>
  <tr>
    <td class="tablebody2" valign="middle" colspan=2 align=center><input type="submit" value="修改"></td>
  </tr>
</table>
</form>
   &nbsp;<br/>
   </body>
   </html>