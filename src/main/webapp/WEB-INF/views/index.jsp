


<%--
  Created by IntelliJ IDEA.
  User: Fuad
  Date: 19-May-22
  Time: 08:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <h1>Hello ${name}</h1>--%>
    <%--@elvariable id="userDto" type=""--%>
    <form:form action = "${pageContext.request.contextPath}/add" method = "POST"  modelAttribute="userDto" enctype="multipart/form-data">

        <form:input  path="name"/>
        <br />
        <form:input  path="email"/>
        <br />
        <form:input  path="password"/>
        <br />
        <input name="profileImage" type="file" accept="image/jpeg, image/png"/>
        <br />
        <input type = "submit" value = "Submit" />
    </form:form>

</body>
</html>
