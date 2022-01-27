<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>0
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>companyLoginForm</title>

    <!-- Bootstrap -->
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<style>
	form{
	width:600px;
	height:550px;
	//border-style:solid;
	//border-width:1px;
	}
	body{
	background-image:images\reg.jpg;
	//background:"background.jpg";
	
	}
	label{
	font-size:17px;
	}
	input[type='text']:hover,input[type='passowrd']:hover{
background:lightblue;

}
	</style>
	</head>
<body background="/PMS/images/company.jpg">
<div class="container">
<div class="row">
<div class="col-md-10 col-md-offset-2">
	<h1> ${smsg} </h1>
		<h1>Company Login Form</h1>
	<form:form role="form" method="post" modelAttribute="company">
		<div class="form-group">
		<label for="name">Email</label>
			<form:input path="email" class="form-control"  placeholder="enter your email" />
		</div>
		<div class="form-group">
			<label for="password">password</label>
			<form:password path="password" class="form-control" size="15" placeholder="enter your password" />
		</div>
		
		<input type="submit" class="btn btn-primary btn btn-lg" value="submit"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" class="btn btn-danger btn btn-lg" value="cancel"/>
		<br/>
		<br/>
		<a href="/PMS/company/register" class="btn btn-primary btn btn-lg" >New Comapany?Register</a>
		
	</form:form>

</div>
</body>
</html>