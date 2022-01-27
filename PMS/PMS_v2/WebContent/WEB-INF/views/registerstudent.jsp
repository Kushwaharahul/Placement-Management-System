<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3></h3>
	<form:form method="post" modelAttribute="student">
		<table style="background-color: lime; margin: auto;">
			<tr>
				<td>name</td>
				<td><form:input path="name" />
			</tr>
			<tr>
				<td>email</td>
				<td><form:input path="email" />
			</tr>
			<tr>
				<td>Mob.No.</td>
				<td><form:input path="phoneNumber" />
			</tr>
			<tr>
				<td>ssc</td>
				<td><form:input path="sscPercentage" />
			</tr>
			<tr>
				<td>hsc</td>
				<td><form:input path="hscPercentage" />
			</tr>
			<tr>
				<td>grad</td>
				<td><form:input path="graduationPercentage" />
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Cancel" /></td>
			</tr>

		</table>

	<p>${msg}</p>
	</form:form>
<h5><a href="/PMS/studenthome">Back to homepage</a></h5>
</body>
</html>