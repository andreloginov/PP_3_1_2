<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Maksim
  Date: 24.12.2022
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add employee</title>
  </head>
<body>

<h2>Employee info</h2>
<br>

<form:form action="saveEmployee" modelAttribute="employee">

  <form:hidden path="id"/>

  Name: <form:input path="name"/>
  <br><br>
  Surname: <form:input path="surName"/>
  <br><br>
  Department: <form:input path="department"/>
  <br><br>
  Salary: <form:input path="salary"/>
  <br><br>
  <input type="submit" value="Add">
</form:form>

</body>
</html>
