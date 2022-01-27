<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>StudentRegistration</title>

    <!-- Bootstrap -->
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<style>
	form{
	width:600px;
	height:600px;
	//border-style:solid;
	//border-width:1px;
	}
	body{
	background-image:images\reg.jpg;
	//background:"background.jpg";
	
	}
	</style>
	</head>
<body >
<div class="container">

<div class="row">
<div class="col-md-2">
<h3><a href="/PMS/studenthome" class="glyphicon glyphicon-circle-arrow-left">backtologin</a></h3>
</div>
<div class="col-md-10 ">
		 <h4> ${changemsg} </h4> 
		<h1>Student Password Change</h1>
	<form:form role="form" method="post" modelAttribute="student">
		<div class="form-group">
		<label for="rollnumber">Roll Number</label>
			<form:input path="id" class="form-control" placeholder="enter your roll number" />
			 <p style={color:red}>${rollmsg}</p> 
		</div>
		<div class="form-group">
		<label for="pass1">Enter Old Password</label>
			<form:password path="password" class="form-control" placeholder="enter your old password" />
			<p> ${passmsg} </p>
		</div>
		<div class="form-group">
		<label for="pass2">Enter New Password</label>
			<input type="password" class="form-control" name="newpass" placeholder="enter your new password" required/>
		</div>
		<div>
		<label for="pass2">Confirm Password</label>
			<input type="password" class="form-control" name="confirmpass" placeholder="confirm your password" required/>
			<p> ${confirmmsg} </p>
		</div>
		<br/>
		<input type="submit" class="btn btn-success btn btn-lg" value="submit"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" class="btn btn-danger btn btn-lg" value="cancel"/>		
		
	</form:form>
	</div>
	</div>

</div>
</body>
</html>