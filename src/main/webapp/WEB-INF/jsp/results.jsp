<%--
  Created by IntelliJ IDEA.
  User: Dominik
  Date: 5/5/2018
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Results</title>
</head>
<body>
    <c:if test="${good == 'GOOD'}">
        <c:out value="${'Account created'}"></c:out>
    </c:if>
    Congratulations! You are old enough to sign up for this site.
</body>
</html>
