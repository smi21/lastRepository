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

  <h2>Register Here</h2>
  <form:form method="post" action="register" commandName="registerdto"> 
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
        <th>Email</th>
        <td>
            <form:input path="email" /> 
            <form:errors path="email" cssClass="error"/>
         </td>
      </tr>
       <tr>
        <th>Age</th>
        <td>
            <form:input path="age" /> 
            <form:errors path="age" cssClass="error"/>
         </td>
      </tr>
       <tr>
        <th>Date of Birth</th>
        <td>
            <form:input path="dob" /> 
            <form:errors path="dob" cssClass="error"/>
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
        <td><button type="submit">Click here to submit form</button></td>
      </tr>
    </table>
    <!--  <input type="submit" value="Submit"/>-->
  </form:form>
</body>
</html>