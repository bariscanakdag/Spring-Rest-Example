<%--
  Created by IntelliJ IDEA.
  User: p1352
  Date: 4/17/2019
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Rest API</title>
</head>
<body>

<h3>Spring Rest Demo</h3>
<hr>
<a href="${pageContext.request.contextPath}/test/hello">Get Test</a>
<hr>
<a href="/api/students">Get Students</a>
</body>
</html>
