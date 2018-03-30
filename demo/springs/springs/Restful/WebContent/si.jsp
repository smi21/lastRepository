<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>enter details</h2>
<form action="si" method="post">
Prinipal amount<input type="text" name="pa"></br>
Time:<input type="text" name="time"></br>
<select name="dropdown">
  <option value="ICICi">icici</option>
  <option value="canara">canara</option>
  <option value="SBI">sbi</option>
		</select>
<input type="submit" value="submit">
</form>

</body>
</html>