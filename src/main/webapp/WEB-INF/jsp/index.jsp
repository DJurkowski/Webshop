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
            <span class="Goods">
            <c:if test="${good == 'GOOD'}">
                <c:out value="${'Account are created correctly'}"></c:out>
            </c:if>
            </span>
            <span class="Goods">
                 <c:if test="${logout == 'GOOD'}">
                    <c:out value="${'You are offline'}"></c:out>
                </c:if>
            </span>
    <div class="jumbotron text-center">
        <h1>Welcome to WebShopApp</h1>
    </div>
</div>
<%--&lt;%&ndash; FOOTER content&ndash;%&gt;--%>
<%--<jsp:include page=".footer.jsp"/>--%>

<%--JS content--%>
<jsp:include page=".script.jsp"/>
</body>
</html>