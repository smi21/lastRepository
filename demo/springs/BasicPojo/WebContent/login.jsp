<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>some title</title>
<style type="text/css">
.error {
	color:red;
}
</style>
</head>
<body>
  <h2>Login Form</h2>
  <form:form method="Get" action="login.htm"  commandName="pojo"> 
    <table>
      <tr>
        <th>Name</th>
        <td>
          <form:input path="name"/> 
          <form:errors path="name" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>password</th>
        <td>
            <form:input path="password" /> 
            <form:errors path="password" cssClass="error" />
         </td>
      </tr>
      <tr>
        <td><button type="submit">Submit</button></td>
      </tr>
    </table>
  </form:form>
</body>
</html>