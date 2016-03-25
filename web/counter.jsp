<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSP page</title>
</head>
<body>
    <%! int count = 0; %>
    ${title1}
    <br />
    <table style="border: 1px solid gray">
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.name}</td>
                <td>
                    ${user.age}
                    <c:if test="${user.age < 18}"> - minor</c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br /><%=request.getAttribute("title2")%> <%=count++%>
    <br /><a href="index.html">Go to page with 3 containers.</a>
</body>
</html>
