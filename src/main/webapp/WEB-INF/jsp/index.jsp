<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>

<html>
<head>
    <%--HEAD content--%>
    <jsp:include page=".head.jsp"/>
</head>
<body>
    <%--MENU content--%>
    <jsp:include page=".menu.jsp"/>

<div class="container" id="homeDiv">
            <span style="color: green;">
            <c:if test="${blad == 'DELETE'}">
                <c:out value="${'Account deleted correctly'}"></c:out>
            </c:if>
            </span>
    <div class="jumbotron text-center">
        <h1>Welcome to WebShopApp</h1>
    </div>
</div>

    <%--JS content--%>
    <jsp:include page=".script.jsp"/>
</body>
</html>