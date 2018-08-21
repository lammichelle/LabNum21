<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info</title>
<link href = "css/style.css" rel="stylesheet">
</head>



<body>



<h3>Please fill the form to register!</h3>

<form name ="regForm" action="addnewuser"  onsubmit="return validateInfo()" method="post">

<!-- One "tab" for each step in the form: -->
<div class="tab">First Name:
<!--  <input type = "text" name = "firstName">-->
  <p><input id = "firstName" type = "text" name = "firstName" placeholder = "First Name"></p>
 
</div>


<div class="tab">Last Name:
 <p><input id = "lastName" type = "text" name = "lastName" placeholder = "Last Name" ></p>
</div>


<div class="tab">Email:
  <p><input id = "email" type = "text" name = "email" placeholder = "Email" required ></p>
  </div>
  <div class="tab">Phone:
  <p><input id = "phone" type = "tel" name = "phone" placeholder="123-456-7890"
           pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required/></p>
</div>

<label>Password:
  <p><input name="password" id="password" type="PASSWORD" onkeyup = 'check();' /></p>
</label>
<br>
<label>Confirm password:
  <p><input type="password" name="confirmPassword" id="confirmPassword"  onkeyup='check();' /> 
  <span id='message'></span></p>
</label>



<!-- An element to toggle between password visibility -->
<input type="checkbox" onclick="myFunction()"  onchange = 'check_pass();'/>Show Password
  
</div>
<input type = "submit" value = "Register"></a>


<!-- Circles which indicates the steps of the form: -->
<div style="text-align:center;margin-top:40px;">
  <span class="step"></span>
  <span class="step"></span>
  <span class="step"></span>
  <span class="step"></span>
</div>

</form>


<script src = "js/script.js"></script>
</body>
</html>