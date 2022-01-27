<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>started</title>
</head>
<body>
<form:form method="post" modelAttribute="company" action="/PMS/admin/companymodify" >
		
		Student id: <form:input path="id" value="${company.id}"  /><br>
		Student email: <form:input path="email" value="${company.email}"  /><br>
		Student name: <form:input path="name" value="${company.name}"  /><br>
		Student password: <form:input path="password" value="${company.password}"  /><br>
		Student PhoneNumber: <form:input path="phoneNumber" value="${company.phoneNumber}"  /><br>
		Student sscPercentage: <form:input path="sscPercentage" value="${company.sscPercentage}"  /><br>
		Student hscPercentage: <form:input path="hscPercentage" value="${company.hscPercentage}"  /><br>
		Student graduationPercentage: <form:input path="graduationPercentage" value="${company.graduationPercentage}"  /><br>
		Student graduationPercentage: <form:input path="graduationPercentage" value="${company.description}"  /><br>
		Student graduationPercentage: <form:input path="graduationPercentage" value="${company.status}"  /><br>
		Student graduationPercentage: <form:input path="graduationPercentage" value="${company.profile}"  /><br>
		Student graduationPercentage: <form:input path="graduationPercentage" value="${company.package_}"  /><br>
		<input type="submit" class="btn btn-success" value="Modifie"/>&nbsp; &nbsp; &nbsp;
		<input type="reset" class="btn btn-primary" value="cancel"/>
		</form:form>
</body>
</html>