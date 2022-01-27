<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>started</title>
</head>
<body>
<h3>
<c:forEach var="temp" items="${sessionScope.com}" >
    Company Id: <c:out value="${temp.id}"/> Company Name: <c:out value="${temp.name}"/> <br>
</c:forEach>
</h3>

<form:form method="post" modelAttribute="company">

	Company id:<form:input path="id" class="form-control" required="required" />
	<input type="submit" class="btn btn-success" value="Submit"/>&nbsp; &nbsp; &nbsp;
	<input type="reset" class="btn btn-primary" value="cancel"/>

</form:form>
</body>
</html>