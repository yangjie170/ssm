<%--
  Created by IntelliJ IDEA.
  User: 杨波
  Date: 2020/6/24
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询所有</h3>


    <c:forEach items="${list}" var="user">
                <h1>${user.age}</h1><br>
        <h2>${user.name}</h2>
    </c:forEach>

</body>
</html>
