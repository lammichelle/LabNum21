<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Data</title>
<link href = "css/style.css" rel="stylesheet">
</head>
<body>


<h1> Hello, ${personName}</h1>


<h2>Our Menu </h2>

<table>
  <tr>
    <th>Coffee </th>
    <th>Price</th>
    <th>Caffeine Strength</th>
  </tr>
  <tr>
  	<td>1.</td>
    <td>Latte</td>
    <td>$3.50</td>
    <td>Medium</td>
  </tr>
  <tr>
  <td>2.</td>
    <td>Cappuccino</td>
    <td>$4.00</td>
    <td>Strong</td>
    
  </tr>
  
  
  <tr>
  <td>3.</td>
    <td>Green Tea Frappuccino</td>
    <td>$4.30</td>
    <td>Weak</td>
    
  </tr>
  
  <tr>
  <td>4.</td>
    <td>Nitro Cold Brew</td>
    <td>$2.90</td>
    <td>Strong</td>
    
  </tr>
</table>

<h3>Select from the following:</h3>
<form action="">
  <input type="radio" name="coffee" value="Latte"> Latte<br>
  <input type="radio" name="coffee" value="Cappuccino"> Cappuccino<br>
  <input type="radio" name="coffee" value="Green Tea Frappuccino"> Green Tea Frappuccino<br>
  <input type="radio" name="coffee" value="Nitro Cold Brew"> Nitro Cold Brew<br>
</form>



${test}
<a href="/additem"> <input type = "submit" value = "Place your order!" style = "color: green"> </a>


</body>
</html>