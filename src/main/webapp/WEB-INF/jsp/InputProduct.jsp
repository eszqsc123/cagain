<%--
  Created by IntelliJ IDEA.
  User: air
  Date: 15/03/2018
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add Product</title>
        <script>
            function afterLoad() {
                $("submitButton").onclick = askForSure();
            }

            /**
             * 自定义的js的id选择器
             * @param di
             */
            function $(param) {
                return document.getElementById(id);
            }

            function askForSure() {
                confirm("Are you sure?");
            }
        </script>
    </head>
    <body onload="afterLoad();">
        <form method="post" action="save-product">
            User Name: <input name="uname" placeholder="Please enter your user name"/><br/>
            Password: <input name="passwd" placeholder="Please enter your password"/><br/>
            <input id="submitButton" type="submit"/>
        </form>
    </body>
</html>
