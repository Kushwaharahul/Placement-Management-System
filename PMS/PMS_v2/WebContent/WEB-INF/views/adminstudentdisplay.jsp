<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</style>
<meta charset="UTF-8">
<title>StudentInfo</title>
</head>
<body>
<h4>
		<form:form method="post" modelAttribute="student" action="/PMS/admin/studentmodify" >
		
		Student id: <form:input path="id" value="${student.id}"  /><br>
		Student email: <form:input path="email" value="${student.email}"  /><br>
		Student name: <form:input path="name" value="${student.name}"  /><br>
		Student password: <form:input path="password" value="${student.password}"  /><br>
		Student PhoneNumber: <form:input path="phoneNumber" value="${student.phoneNumber}"  /><br>
		Student sscPercentage: <form:input path="sscPercentage" value="${student.sscPercentage}"  /><br>
		Student hscPercentage: <form:input path="hscPercentage" value="${student.hscPercentage}"  /><br>
		Student graduationPercentage: <form:input path="graduationPercentage" value="${student.graduationPercentage}"  /><br>
		
		<input type="submit" class="btn btn-success" value="Modifie"/>&nbsp; &nbsp; &nbsp;
		<input type="reset" class="btn btn-primary" value="cancel"/>
		</form:form>
</h4>
</body>
</html>