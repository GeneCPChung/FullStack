<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Set Property</title>
</head>
<body>
<jsp:useBean id="user" class="beans.User" scope="session"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Gene"/>
<jsp:setProperty property="lastName" name="user" value="Chung"/>
Values have been set
</body>
</html>