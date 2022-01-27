<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>PMS Home</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<style>
		header h1{
				border-style:solid;
				border-width:1px;
		background-color:skyblue;
		height:100px}
		footer p{text-align:center}
		#sidebar{
		border-style:solid;
		border-width:1px;
		background-color:orange;
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
		
		background-color:olive;
		border-width:1px;
		}
		#main{
				border-style:solid;
				height:460px;
				border-width:1px;
		}
		body{
		border-style:solid;
		background-color:paleturquoise;	
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
	</style>
 </head>
  <body class="container">
	<header class="container-fluid">

	<br />
		<div>	
			<h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome to CDAC Placement Management System</h1>
		</div>
	</header>
	<section id="body" class="container-fluid">
		<section id="main" class="col-md-8">
			
			<img src="/PMS/images/training.jpg">
			
			<br />
			<br />
			<p>To Sustain the industry the industry boom, the synery among the instituion of academy & industry has become inevtiable. To realize the vision,
			the college has incorporated the placement cell to mould the young engineers in to knowledge workers.
			The placement cell gives a silver lining to student career prospects.
			</p>
		</section>
		
		<section id="sidebar" class="col-md-4">
			<br />
			<br />
		
		<div>
		<!-- here we have to give Student address link-->
			 <a href="student/login"><button class="btn btn-primary btn-block"><p>Student Login</p></button> </a>
		</div>
		<br />
		<br />
		<div>
		<!-- here we have to give company address link-->
			<a href="company/login"><button class="btn btn-success btn-block"><p>Company Login</p></button></a> 
		</div>
		<br />
		<br />
		<div>
		<!-- here we have to give Admin address link-->
			<a href="admin/login"><button class="btn btn-danger btn-block"><p>Admin Login</p></button> </a>
		</div>
		<br />
		<div class="glyphicon glyphicon-hand-down">
		<p><u>Latest news</u></p>
		
		</div>
		<div>
			<marquee>Students can upload theier project details</marquee>
		</div>
		<div>
		“Do not hire a man (or woman) who does your work for money, but him (or her) who does it for the love of it.” <strong>– Henry David Thoreau</strong>
		</div>
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