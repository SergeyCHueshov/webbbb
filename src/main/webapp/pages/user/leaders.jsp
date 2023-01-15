<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 15.01.2023
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Leaders</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>firstname</th>
        <th>secondname</th>
        <th>age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.firstname}</td>
            <td>${user.secondname}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
