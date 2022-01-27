<%@page import="com.app.pojos.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home Page</title>

    <!-- Bootstrap -->
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<style>
		/*header h2{
				//border-style:solid;
				border-width:1px;
		background-color:gold;
		height:550px;}
		footer p{text-align:center}*/
		
		a{
		height:50px;
		font-style:italic;
		}
		footer{
		border-style:solid;
		//width:1200px;
		height:40px;
		
		background-color:lawngreen;
		border-width:1px;
		}
		body{
		//background-color:silver;
		}
		#main{
				//border-style:solid;
				height:460px;
				border-width:1px;
				background-color:lavendar;
		}
		body{
		//border-style:solid;
		//background-color:;	
				border-width:1px;
		}
	
	
i{
 font-family: "Times New Roman", Times, serif;
 font-size:19px;
		}
		h1{
		//background-color:silver;
		//width:1290px;
		color:orange;
		}
		#nav{
		//background-color:pink;
		border-style:solid;
		border-width:1px;
		border-color:gold;
		}
		#main{
		border-style:solid;
		border-width:1px;
		border-height:250px;
		//border-width:200px;
		border-color:blue;
		}
	</style>
 </head>
  <body class="container" background="/PMS/images/company.jpg">
  <div class="container">
  <div class="row">
  <div class="col-md-8 col-md-offset-2">
	<h1>Welcome <%out.print(((Student)session.getAttribute("student")).getName());%> to PMS Student Home Page</h1> 
		</div>	
		</div>
			<div class="row"id="nav">
							<div class="col-md-4 ">
								<a href="/PMS/student/registerstudent" class="btn btn-success"><i>Register</i></a>
							</div>
							<div class="col-md-1 col-md-offset-3">
								<a href="/PMS/student/studentchangepassword" class="btn btn-success"><i>Change Password</i></a>
							</div>
							<div class="col-xs-1 col-md-offset-3 ">
								<a href="/PMS/student/login" class="btn btn-danger"><i>Logout</i></a>&nbsp;&nbsp;
								
								
							</div>
			</div> 
			<section id="body" class="container">
			<div class="row">
			<div class="col-md-8 col-md-offset-4">
			<h2>Notification Area</h2>
			</div>
			</div>
			<section id="main" class="col-md-8 col-md-offset-1">
			<!--your notification code goes here--><p style="color:red">${msg2}</p>
			</section>
			</section>
    </div>
  </body>
</html>
