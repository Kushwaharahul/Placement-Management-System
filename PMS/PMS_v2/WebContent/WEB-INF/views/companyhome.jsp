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
	</style>
	</head>
	<body background="company.jpg">
	
		<div class="container">
		<h1>${hmsg}</h1>
		<header><h1>Comapny Home Page</h1>
		</header>
			<div class="row">
			<br/>
			<br/>
			<br/>
			<div class="col-xs-6 col-xs-offset-3">
			<h2>Select Test Date And Slot</h2>
			<label for="date">Date : </label>
                <input id="date" name="date" type="date" id="date" value=""/>
            <label for="slot">select time slot</label>
			<select id="slot">select time slot
				<option>9am-11am</option>
				<option>12pm-2pm</option>
				<option>3pm-5pm</option>
				<option>6pm-8pm</option>
				<option>9pm-11pm</option>
			</div>
		</div>
	</body>
	</html>