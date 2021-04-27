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
    	function fun1(){
    	var a=document.getElementById("pass1");
    	var b=document.getElementById("pass2");
    	if(a.value==b.value){
    		var c=document.getElementById("f1");
    		c.innerText="";
    	}else{
    		var c=document.getElementById("f1");
    		c.innerText="两次密码不一致";
    	}
    	}
  		function fun2(a){
			if(a.value!=""){
				var b=document.getElementById("f2");
				b.innerText="";
			}else{
				var b=document.getElementById("f2");
				b.innerText="用户名不能为空";
			}
    	}
   		function fun3(a){
			if(a.value!=""&&a.value.length>=6){
				var b=document.getElementById("f3");
				b.innerText="";
			}else{
				var b=document.getElementById("f3");
				b.innerText="密码不能为空或小于6位";
			}
    	}
    	function fun4(){
			var a=document.getElementById("username");
			var b=document.getElementById("pass1");
			var c=document.getElementById("pass2");
			var d=document.getElementById("zip");
			if(a.value==""){
				alert("请输入用户名");
				return false;
			}else{
				if(b.value==""||b.value.length<6){
					alert("请输入密码且不小于6位");
					return false;
				}else{
					if(b.value!=c.value){
						alert("密码不一致");
						return false;
					}else{
						if(d.value==""){d.value=0;}
						return true;
					}
				}
			}
    	}
    	function fun5(){
    	if(${flage==true}){
    		alert("该用户名被占用")
    	}
    	}
    </script>
  </head>
  <body onload="fun5()">&nbsp;  
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
  
   
 <form  method="post" action="/shoppingcar/UserAction/UserAction_Regist" onsubmit="return fun4()">
  <table cellpadding="3" cellspacing="1" align="center" class="tableborder1" id="table1">
    <tr>
      <td valign="middle" colspan="2" align="center" height="25"  bgcolor="lightblue">
        <font color="#ffffff"><b>新用户注册</b></font></td>
    </tr>

    
    <tr>
      <td width="40%" class="tablebody1"><b>用户名</b>：<br>
        注册用户名长度限制为0－16字节</td>
      <td width="60%" class="tablebody1">
        <input id="username" type="text" name="user.username" maxlength="16" size="32" value="" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000" onblur="fun2(this)"><font id="f2" size="2" color="red"></font>
        <font color="#FF0000">*</font>
      </td>
    </tr>
    <tr>
      <td width="40%" class="tablebody1"><b>密码(至少6位，至多8位)</b>：<br>
	请输入密码，区分大小写。</td>
      <td width="60%" class="tablebody1">
	<input id="pass1" type="password" name="pass1" maxlength="8" size="32" value="" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000" onblur="fun3(this)"><font id="f3" size="2" color="red"></font>
	<font color="#FF0000">*</font></td>
    </tr>
     <tr>
      <td width="40%" class="tablebody1"><b>请再次输入密码</b>：</td>
      <td width="60%" class="tablebody1">
	<input id="pass2" type="password" name="user.password" maxlength="8" size="32" value="" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000" onblur="fun1()"><font id="f1" size="2" color="red"></font>
	<font color="#FF0000">*</font></td>
    </tr>
     <tr>
	<td class="tablebody1"><b>真实姓名</b>：</td>
        <td class="tablebody1">
          <input type="text" name="user.name" maxlength="32" size="64" value="" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000"></td>
    </tr>
    <tr>
	<td class="tablebody1"><b>联系地址1</b>：</td>
        <td class="tablebody1">
          <input type="text" name="user.address" maxlength="32" size="64" value="" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000"></td>
    </tr>
    <tr>
	<td class="tablebody1"><b>邮编</b>：</td>
        <td class="tablebody1">
          <input id="zip" type="text" name="user.zip" maxlength="8" size="32" value="" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
        </td>
    </tr>
    <tr>
	<td class="tablebody2" valign="middle" colspan="2" align="center">
          <input type="submit" value="注 册">&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="清 除"></td>
    </tr>
  </table>
</form>
   &nbsp;<br/>
   </body>
   </html>