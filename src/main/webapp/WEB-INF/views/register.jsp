<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info</title>


</head>



<body>



<h3>Please fill the form to register!</h3>

<form name ="regForm" action="adduser"  onsubmit="return validateForm()" method="post">

<!-- One "tab" for each step in the form: -->
<div class="tab">First Name:
<!--  <input type = "text" name = "firstName">-->
  <p><input type = "text" name = "firstName" placeholder="First name..." oninput="firstName" required ></p>
 
</div>


<div class="tab">Last Name:
 <p><input type = "text" name = "lastName" placeholder="Last name..." oninput="this.className = ''" required ></p>
</div>


<div class="tab">Email:
  <p><input type = "text" name = "email" placeholder="E-mail..." oninput="this.className = ''" required></p>
  </div>
  <div class="tab">Phone:
  <p><input type = "text" name = "phone" placeholder="Phone..." oninput="this.className = ''" required></p>
</div>



<div class="tab">Password:
  
<p><input type ="PASSWORD" name = “password” placeholder=“Password...“ required></p>
  

<!-- An element to toggle between password visibility -->
<input type="checkbox" onclick="myFunction()">Show Password
  
</div>
<input type = "submit" value = "Register">


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