<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Set property</title>
</head>
<body>
<jsp:useBean id="user" class="learnBeans.User" scope="session"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Gene"/>
<jsp:setProperty property="lastName" name="user" value="Chung"/>
Values have been set
</body>
</html>