<%--
  Created by IntelliJ IDEA.
  User: CYC
  Date: 2020/4/1
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hhhh</title>
</head>
<body>
    ${msg}
    <form action="/hhh" method="get">
        id:<input type="text" name="id"><br>
        姓名：<input type="text" name="username"> <br>
        性别：<input type="text" name="gender"> <br>
        <input type="submit" value="提交">
    </form>
    ${id}
</body>
</html>
