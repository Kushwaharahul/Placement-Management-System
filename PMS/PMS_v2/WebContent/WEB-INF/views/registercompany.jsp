<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CompanyRegistrationForm</title>

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
h1{
color:cyan;
}
	</style>
	</head>
<body background="/PMS/images/city.jpg">
<div class="container">

<div class="row">
<div class="col-md-2">
<h3><a href="/PMS/company/login/" class="glyphicon glyphicon-circle-arrow-left">backtologin</a></h3>
</div>
<div class="col-md-10 ">
<h1>Company Registration Form</h1>
		<h2> ${rmsg} </h2>
	<form:form role="form" method="post" modelAttribute="company" >
		<div class="form-group">
		<label for="name">Name</label>
			<form:input path="name" class="form-control" placeholder="enter Company name" />
		</div>
		<div class="form-group">
			<label for="email">Email</label>
			<form:input path="email" class="form-control" placeholder="enter your email" />
		</div>
		<div class="form-group">
			<label for="password">password</label>
			<form:password path="password" class="form-control" size="15" placeholder="enter your password" />
		</div>
		
		<div class="form-group">
			<label for="phone">Mobile Number</label>
			<form:input path="phoneNumber" class="form-control"  placeholder="Enter Your mobile number" />
			
		</div>
		<div class="form-group">
			<table class="table table-striped table-bordered table-hover table-condensed">
			<caption><strong>Enter qualifying criteria for selecting students</strong></caption>
			<thead>
				<tr>
					<th>Qualification</th>
					<th>marks(%)</th>
				</tr>
			</thead>
			<tbody>
				<tr class="active">
					<td>SSC(10<sup>th</sup>)</td>
					<td><form:input path="sscPercentage"  /></td>
				</tr>
				<tr class="active">
					<td>HSC(12<sup>th</sup>)</td>
					<td><form:input path="hscPercentage" /></td>
				</tr>
				<tr class="active">
					<td>GraduationPercentage</td>
					<td><form:input path="graduationPercentage"  /></td>
				</tr>
			</tbody>	
			</table>
		</div>
		<div class="form-group">
			<label for="package">package(in lpa)</label>
			<form:input path="package_" class="form-control" placeholder="enter package details" />
		</div>
		<div class="form-group">
			<label for="profile">select profile</label>
			<form:select path="profile" class="form-control" >
					  <form:option value="CPP" label="CPP" />
					  <form:option value="JAVA" label="JAVA" />
					  <form:option value=".NET" label=".NET" />
					  <form:option value="MYSQL" label="MYSQL" />
			</form:select>
		</div>
		<div class="form-group">
			<label for="Description">Description</label>
			<form:textarea path="description" class="form-control" id="description" rows="5" cols="30" />
		</div>
		
		<input type="submit" class="btn btn-primary btn btn-lg" value="submit"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" class="btn btn-danger btn btn-lg" value="cancel"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
	</form:form>

</div>
</body>
</html>