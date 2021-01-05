<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Saving</title>
</head>
<body>
<h3>Enter some info</h3>

<form action="ProcessInfo" method="post">
<label>first name: </label>
<input type="text" name="fName" value="${cust.fName}" >
<label>last name: </label>
<input type="text" name="lName" value="${cust.lName}">
<label>street: </label>
<input type="text" name="street" value="${cust.street}">
<label>city: </label>
<input type="text" name="city" value="${cust.city}">
<label>state: </label>
<input type="text" name="state" value="${cust.state}">
<label>zip code: </label>
<input type="text" name="zipcode" value="${cust.zipcode}">
<label>email: </label>
<input type="text" name="email" value="${cust.email}">
<label>password: </label>
<input type="password" name="password" value="${cust.password}">
<label>phone: </label>
<input type="text" name="phone" value="${cust.phone}">
<input type="submit" value="send">
</form>
</body>
</html>