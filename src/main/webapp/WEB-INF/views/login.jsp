<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"  %>

<%@ page session="false" %>

<html>
<head>
	<title>Login</title>
	<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"/>
</head>
<body>


<form:form method="POST" commandName="user" action="check-user" class="login-box">
  <fieldset class="myclass">
    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    <form:label path="password">Password</form:label>
    <form:input path="password"/>     
  </fieldset>
  
  <footer> 
      <form:checkbox path="admin"/>
      <form:label path="admin">Admin</form:label>
      <input type="submit" class="btnLogin" value="Login">
  </footer>
</form:form>


</body>
</html>






