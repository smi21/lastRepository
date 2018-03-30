<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=pink>
<h1>welcome</h1>
<h1>${successMsg}</h1>
<form action="register.do" method="post">
Employee Id:<input type="text" name="id" />
Employee Name:<input type="text" name="name" />
Employee dept:<input type="text" name="dept" />
employee Location:	<input type="text" name="loc" />
             <input type="submit" value="register" />			
</form>

</body>
</html>