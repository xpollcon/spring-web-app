<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
</head>
    <body>
        <p>Phone Book</p>
        <form:form modelAttribute="person">
        <form:input path="fullName"/><br/>
        <form:input path="phoneNo"/><br/>
        <form:select path="gender">
            <form:option value="MALE">Male</form:option>
            <form:option value="FEMALE">Female</form:option>
        </form:select><br/>
        <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>