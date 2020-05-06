<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>COVID-19 E-PASS</title>
</head>
<link rel="stylesheet" type="text/css" href="style.css">
<style>
body {
  background-image: url("./covid1.jpg");
  background-position: center;
  background-repeat: no-repeat; 
  background-size: cover;
}
</style>
<body>

	<div class="header">
		<h2>Apply for E-Pass</h2>
	</div>
	
<form method="post" action="GeneratePass">
	<div class="input-group">
	<h3 align=center>Fill this form to apply for E-Pass</h3>
		<label>Enter Candidate Name -:</label> 
		<input type="text" name="name"><br>
	</div>
	<div class="input-group">
		<label>Enter Address -:</label>  
		<input type="text" name="add"><br>
	</div>
	<div class="input-group">
		<label>Enter Mobile Number -: </label> 
		<input type="text" name="mob"><br>
	</div>
	<div class="input-group">
		<label>Enter Source City -:</label> 
		<input type="text" name="scity"><br>
	</div>
	<div class="input-group">
		<label>Enter Destination City -: </label>
		<input type="text" name="dcity"><br>
	</div>
	<div class="input-group">
		<label>Enter Aadhar Card Number -: </label>
		<input type="text" name="aadhar"><br>
	</div>
	<div class="input-group">
		<label>Vehicle Registration Number -: </label> 
		<input type="text" name="v_regis"><br>
	</div>
	<div class="input-group">
		<input type="submit" value="Apply" class="btn">
	</div>
	<div class="input-group">
		<input type="Reset" value="Reset" class="btn">
	</div>
</form>

</body>
</html>