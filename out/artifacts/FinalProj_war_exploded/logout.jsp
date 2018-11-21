<%--
  Created by IntelliJ IDEA.
  User: Iklasov Duman
  Date: 24.10.2018
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session = request.getSession();
    String email = "";
    if(session.getAttribute("username") == null){
        response.sendRedirect("index.jsp");
    }else{
        email = session.getAttribute("username").toString();
    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
