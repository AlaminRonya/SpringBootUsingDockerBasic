<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 6/9/2022
  Time: 1:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="fileUpload" type=""--%>
<form:form method = "POST" modelAttribute = "fileUpload"
           enctype = "multipart/form-data">
    Please select a file to upload :
    <input type = "file" name = "file" />
    <input type = "submit" value = "upload" />
</form:form>

</body>
</html>
