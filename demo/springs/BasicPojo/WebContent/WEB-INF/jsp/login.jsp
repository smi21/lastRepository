<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>some title</title>
<style type="text/css">
.error{
	color:red;
}
</style>
</head>
<body>

  <h2>Login Form</h2>
  <form:form method="post" action="login.htm" commandName="pojo"> 
  
  
 <!--   <spring:bind path="name">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<label>Name</label>
		<form:input path="name" type="text" id="name" />
		<form:errors path="name" cssClass="error"/>
	</div>
    </spring:bind>
    
    <spring:bind path="password">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<label>Name</label>
		<form:input path="password" type="text" id="password" />
		<form:errors path="password" cssClass="error"/>
	</div>
    </spring:bind> -->
 
     <table>
  
      <tr>
        <th>Name</th>
        
        <td>
          <form:input path="name"/> 
          <form:errors path="name" cssClass="error"/>
         </td>
      </tr>
      
      <tr>
        <th>password</th>
        <td>
            <form:input path="password" /> 
            <form:errors path="password" cssClass="error"/>
         </td>
      </tr>
      <tr>
        <td><button type="submit">Submit</button></td>
      </tr>
    </table>
    <!--  <input type="submit" value="Submit"/>-->
  </form:form>
</body>
</html>