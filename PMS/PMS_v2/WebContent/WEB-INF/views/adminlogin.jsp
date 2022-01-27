<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Grid Sizes</title>

    <!-- Bootstrap -->
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<style>
		header h1{
				border-style:solid;
				border-width:1px;
		background-color:Royalblue;
		height:100px}
		footer p{text-align:center}
		#sidebar{
		border-style:solid;
		border-width:1px;
		background-color:silver;
		height:460px;
		
		}
		button{
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
		#main{
				border-style:solid;
				height:460px;
				border-width:1px;
				background-color:lavendar;
		}
		body{
		border-style:solid;
		background-color:palegoldenrod;	
				border-width:1px;
		}
		p{
 font-family: "Times New Roman", Times, serif;
 font-size:19px;
		}
		img {
    border: 1px solid #ddd;
    border-radius: 4px;
    padding: 5px;
	width:700px;
	height:300px;
}
i{
 font-family: "Times New Roman", Times, serif;
 font-size:19px;
		}
	</style>
 </head>
  <body class="container">
	<header class="container-fluid">
	<h1>Welcome to CDAC Placement Management System</h1>
	<h5>${msgl}</h5>
	</header>
	<section id="body" class="container-fluid">
	
		<section id="main" class="col-md-8 col-md-offset-2">
		<h2 align="center" style="color:blue"><u>Admin Login form</u></h2>
		<form:form class="form-horizontal"  method="post" modelAttribute="administrator" >
			<br />
			<br />
		<div class="form-group has-error">
			<label for="name" class="col-sm-2 control-label"><i>Username :</i> </label>
			<div class="col-sm-8">
				<form:input path="name" class="form-control" />
			</div>
		</div>
		<br />
		<div class="form-group has-warning">
			<label for="Email" class="col-sm-2 control-label"><i>Password : </i></label>
			<div class="col-sm-8">
				<form:password path="password" class="form-control" />
				
			</div>
			<br />
			<br />
			<br />
			<div class="col-sm-10 col-sm-offset-2">
			<input type="submit" class="btn btn-success" value="Submit"/>&nbsp; &nbsp; &nbsp;
			<input type="reset" class="btn btn-primary" value="cancel"/>
		</div>
			</form:form>
		</section>
		
		
		
		</section>
 	</section>
	<footer  class="col-md-10 col-md-offset-1">
	<p>&copy; All Rights Reserved-pms(CDAC)pms@cdac.com</p>
	</footer>
     <!-- jQuery (necessary for Bootstrap's JavaScript plugins)-->
    <script src="../jQuery/jquery-1.11.1.min.js"></script> 
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
  </body>
</html>
