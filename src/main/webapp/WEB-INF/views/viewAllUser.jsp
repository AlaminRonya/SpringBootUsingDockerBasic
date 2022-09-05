<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 5/31/2022
  Time: 11:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="user" items="${users}">
        <h1>${user.name}</h1>
        <h1>${user.email}</h1>
        <h1>${user.password}</h1>
    </c:forEach>

</body>
</html>
