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

    <c:forEach></c:forEach>
</body>
</html>
