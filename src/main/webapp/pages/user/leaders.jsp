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


<p>
    <a href="https://ru.wikipedia.org/wiki/Ленин,_Владимир_Ильич"><img src="data:image/jpeg;base64,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"
                                                                       alt="Ленин" style="width:30%;">
    </a>
    <a href="https://ru.wikipedia.org/wiki/Сталин,_Иосиф_Виссарионович"><img src="data:image/jpeg;base64,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"
                                                                             alt="Сталин" style="width:30%;">
    </a>
    <a href="https://ru.wikipedia.org/wiki/Хрущёв,_Никита_Сергеевич"><img src="data:image/jpeg;base64,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"
                                                                          alt="Хрущев" style="width:30%;">
    </a>
    <a href="https://ru.wikipedia.org/wiki/Брежнев,_Леонид_Ильич"><img src="data:image/jpeg;base64,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"
                                                                       alt="Брежнев" style="width:30%;"> </a>
</p>
</body>

</html>
