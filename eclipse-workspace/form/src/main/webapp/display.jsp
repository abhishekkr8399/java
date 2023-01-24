<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Data</title>
</head>
<body>
<form action="display.jsp" method="get">
<p>First Name:<%=request.getParameter("fname")%><br>
<p>Last Name:<%=request.getParameter("lname")%><br>
</form>
</body>
</html>