<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="NewFile.jsp" method="post">
<p>First Name:<%=request.getParameter("fname")%><br>
<p>last Name:<%=request.getParameter("lname")%><br>
</form>
</body>
</html>