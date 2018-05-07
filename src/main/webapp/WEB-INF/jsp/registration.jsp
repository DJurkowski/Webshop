<%--
  Created by IntelliJ IDEA.
  User: Dominik
  Date: 5/7/2018
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <jsp:include page=".head.jsp"/>
</head>
<body>

<form:form modelAttribute="user" action="registration" method="post">
    <table>
        <tr>
            <td>Nickname:</td>
            <td><form:input path="nick"/></td>
            <td class="Errors"><form:errors path="nick" cssClass="error"/></td>
        </tr>
        <tr>
            <td>FirstName:</td>
            <td><form:input path="firstName"/></td>
            <td class="Errors"><form:errors path="firstName" cssClass="error"/></td>
        </tr>
        <tr>
            <td>SecondName:</td>
            <td><form:input path="secondName"/></td>
            <td class="Errors"><form:errors path="secondName" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Age:</td>
            <td><form:input path="age"/></td>
            <td class="Errors"><form:errors path="age"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
            <td class="Errors"><form:errors path="email" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><form:input path="phone"/></td>
            <td class="Errors"><form:errors path="phone" cssClass="error"/></td>
        </tr>
        <tr>
            <td>State:</td>
            <td><form:select path="state">
                <form:option value="Dolnośląskie">Dolnośląskie</form:option>
                <form:option value="Kujawsko-Pomorskie">Kujawsko-Pomorskie</form:option>
                <form:option value="Lubelskie">Lubelskie</form:option>
                <form:option value="Lubuskie">Lubuskie</form:option>
                <form:option value="Łódzkie">Łódzkie</form:option>
                <form:option value="Małopolskie">Małopolskie</form:option>
                <form:option value="Mazowieckie"> Mazowieckie</form:option>
                <form:option value="Opolskie">Opolskie</form:option>
                <form:option value="Podkarpackie">Podkarpackie</form:option>
                <form:option value="Podlaskie">Podlaskie</form:option>
                <form:option value="Pomorskie">Pomorskie</form:option>
                <form:option value="Śląskie">Śląskie</form:option>
                <form:option value="Świętokrzyskie">Świętokrzyskie</form:option>
                <form:option value="Warmińsko-Mazurskie">Warmińsko-Mazurskie</form:option>
                <form:option value="Wielkopolskie">Wielkopolskie</form:option>
                <form:option value="Zachodnio-Pomorskie">Zachodnio-Pomorskie</form:option>
            </form:select>
            </td>
            <td class="Errors"><form:errors path="state" cssClass="error"/></td>
        </tr>
        <tr>
            <td>City:</td>
            <td><form:input path="city"/></td>
            <td class="Errors"><form:errors path="city" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Postal Code:</td>
            <td><form:input path="postalCode"/></td>
            <td class="Errors"><form:errors path="postalCode"  cssClass="error"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit" value="Save">Submit</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
