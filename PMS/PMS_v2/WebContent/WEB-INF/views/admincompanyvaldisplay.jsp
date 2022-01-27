<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta charset="UTF-8">
<title>started</title>
</head>
<body>
<h1></h1>
<form:form method="post" modelAttribute="company" action="/PMS/admin/companystatus" >
		
		Company id: <form:input path="id" value="${company.id}"  /><br>
		Company email: <form:input path="email" value="${company.email}"  /><br>
		Company name: <form:input path="name" value="${company.name}"  /><br>
		Company password: <form:input path="password" value="${company.password}"  /><br>
		Company PhoneNumber: <form:input path="phoneNumber" value="${company.phoneNumber}"  /><br>
		Company sscPercentage: <form:input path="sscPercentage" value="${company.sscPercentage}"  /><br>
		Company hscPercentage: <form:input path="hscPercentage" value="${company.hscPercentage}"  /><br>
		Company graduationPercentage: <form:input path="graduationPercentage" value="${company.graduationPercentage}"  /><br>
		Company profile: <form:input path="profile" value="${company.profile}"  /><br>
		Company description: <form:textarea path="description" class="form-control" id="description" rows="5" cols="30" />
		<input type="submit" class="btn btn-success" name="action" value="Validate"/>&nbsp; &nbsp; &nbsp;
		<input type="submit" class="btn btn-success" name="action" value="Delete"/>&nbsp; &nbsp; &nbsp;
		<input type="reset" class="btn btn-primary" value="cancel"/>
		</form:form>
</body>
</html>