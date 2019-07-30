<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 2019-07-29
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form>
    <h2>Caculator</h2>
    <input type="text" name="firstmunber" placeholder="${firstmunber}" >
    <input type="text" name="secondnumber" placeholder="${secondnumber}">
    <input type="submit" name="pheptinh" value="Addition(+)">
    <input type="submit" name="pheptinh" value="Subtraction(-)">
    <input type="submit" name="pheptinh" value="Multiplication(X)">
    <input type="submit" name="pheptinh" value="Division(/)">

    <p>Result:${result}</p>

</form>
</body>
</html>
