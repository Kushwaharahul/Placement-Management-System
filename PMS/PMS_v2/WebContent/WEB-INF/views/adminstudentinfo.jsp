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
<title>Admin</title>
</head>
<body>
<form:form method="post" modelAttribute="student">

	Student id:<form:input path="id" class="form-control" required="required" />
	<input type="submit" class="btn btn-success" value="Submit"/>&nbsp; &nbsp; &nbsp;
	<input type="reset" class="btn btn-primary" value="cancel"/>

</form:form>
</body>
</html>