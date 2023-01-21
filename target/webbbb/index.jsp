<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new user</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Age</th>

    </tr>
    </thead>

    <tbody>
    <form action="/user/create" method="post">
        <tr>
            <td><input type="text" name="firstname" placeholder="Enter Name"></td>
            <td><input type="text" name="secondname" placeholder="Enter Surname"></td>
            <td><input type="text" name="age" placeholder="Enter Age"></td>
            <td><input type="submit" value="Enroll"></td>
        </tr>
    </form>
    </tbody>
</table>
</body>
</html>
