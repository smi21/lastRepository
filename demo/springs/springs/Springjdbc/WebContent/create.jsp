<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body bgcolor="pink">
<h2>create account</h2>

<form action="create" method="post">

Id:<input type="text" name="id" value="<%=session.getAttribute("id")%>" readonly></br>
Initial amount:<input type="text" name="am"></br>
<input type="submit" value="create"> 

</form>
</body>
</html>