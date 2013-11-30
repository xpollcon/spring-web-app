<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <script type="text/javascript" src="static/scripts/jquery-2.0.3.js"></script>
        <script type="text/javascript" src="static/scripts/simple-form.js"></script>
        <link rel="stylesheet" type="text/css" href="static/style/style.css">
    </head>
    <body>
        <form>
            <div><input id="fullName" type="text"/></div>
            <div><input id="phoneNo" type="text"/></div>
            <div>
            <select id="gender">
                <option value="MALE">Male</option>
                <option value="FEMALE">Female</option>
            </select>
            <div>
            <button id="send" type="button">Send</button>
        </form>

        <p>Phone Book</p>
        <div id="phone-book">
        </dev>
    </body>
</html>