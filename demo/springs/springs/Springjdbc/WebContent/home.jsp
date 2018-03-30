<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<form action="home" method="post">
<h3>welcome to home page</h3>
<h3>you logged in as  <% out.print(session.getAttribute("name"));%></h3>
<%out.print(session.getAttribute("d")); %>

<br>
<a href="create.jsp">Create your account</a></br>
<a href="deposite.jsp">Deposit</a></br>
<a href="withdraw.jsp">Withdraw</a></br>
<a href="check.jsp">Check balance</a></br>
<a href="logoutservlet">Logout</a></br>

</form>
</body>
</html>