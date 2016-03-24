<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSP page</title>
</head>
<body>
    <%! int count = 0; %>
    ${title1}
    <br />
    <%=request.getAttribute("title2")%>
    <%=count++%>

    <table style="border: 1px solid gray">
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.name}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
