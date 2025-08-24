<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<style>
.heading h1 {
	font-weight: small !important;
	font-size: 1.9rem;
	color: white;
	color: white;
	text-shadow: 2px 2px 4px #000000;
}

h1 {
	font-weight: small;
	text-align: center;
}

input {
	width: 10px;
}

input.form-control {
	font-size: 16px; /* optional */
}

.heading {
	position: relative;
	top: -20px;
	font-weight: 500px !important;
}

.button {
	margin: 30px;
	display: flex;
	justify-content: center;
	display: flex;
}

.bt:hover {
	background-color: #a300cc;
	box-shadow: 7px 7px 10px white;
}

.bt {
	position: relative;
	top: 1rem;
	padding: 10px;
	width: 9rem;
	height: 3.5rem;
	border-radius: 15px;
	background-color: #8f00b3;
	transition: box-shadow 1s linear;
	font-size: 1.2rem;
	color: white;
	border-radius: red;
	padding: 10px;
}

h4 {
	text-align: center;
	text-decoration: dotted;
	margin: 20px;
	;
}

body {
	background:
		url(https://images.pexels.com/photos/2263436/pexels-photo-2263436.jpeg);
	background-size: cover;
	background-repeat: no-repeat;
}

.high {
	background-image: linear-gradient(120deg, #a64dff, white);
}
</style>
</head>
<body>
<h1>hello! welcome to Event Management Project </h1>

	<div class="container ">
		<div class="row d-flex flex-column align-items-center">
			<div class="col-md-6">
				<div class=" high border rounded  pt-5 p-4  mt-2 mb-2 ">
					<div class="heading">
						<h1 class="display-4">Registration Page</h1>
					</div>
					<form method="post" action="UserRegistration">

						<div class="form-group form-floating mt-3 mb-3  w-60">
							<input type="text" class="form-control" name="firstname"
								placeholder="please enter the FirstName"> <label
								for="firstname">First Name:</label>
						</div>
						<div class="form-group form-floating mt-3 mb-3">

							<input type="text" class="form-control" name="username"
								placeholder="please enter the UserName"> <label
								for="UserName">User Name:</label>
						</div>
						<div class="form-group form-floating mt-3 mb-3">

							<input type="text" class="form-control" name="phoneno"
								placeholder="please enter the mobile number"> <label
								for="">phone no:</label>
						</div>
						<div class="form-group form-floating mt-3 mb-3">
							<input type="password" class="form-control" id="pass"
								name="password" placeholder="Enter The Password" required> <label
								for="pass" >Password:</label>
						</div>
						<div class="form-group form-floating mt-3 mb-3">
							<input type="password" class="form-control" id="conpass"
								name="ConPassword" placeholder="Enter The Password"> <label
								for="conpass">ConformPasswrod:</label>
						</div>


						<div class="button">
							<button class="btn bt w-50" type="submit">Submit</button>
						</div>


					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>