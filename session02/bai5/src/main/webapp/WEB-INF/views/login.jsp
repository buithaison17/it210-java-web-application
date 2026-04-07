<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 07/04/2026
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div>
    <c:if test="${error.length() > 0}">
        <p style="color: red">${error}</p>
    </c:if>
</div>
</body>
</html>
