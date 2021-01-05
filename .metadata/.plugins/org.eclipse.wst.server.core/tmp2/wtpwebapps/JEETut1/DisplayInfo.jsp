<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!-- String Functions -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
 
<!-- Formatting Tags -->
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<h3>something to type</h3>
<label>First name:</label>
${cust.fName} <br>

<label>last name:</label>
${cust.lName} <br>

<label>street:</label>
${cust.street} <br>

<label>city:</label>
${cust.city} <br>

<label>state:</label>
${cust.state} <br>

<label>zipcode:</label>
${cust.zipcode} <br>

<label>email:</label>
${cust.email} <br>


<label>phone:</label>
${cust.phone} <br>
</body>
</html>