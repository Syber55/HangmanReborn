<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hangman Web Application</title>
</head>
<body>

	<div class="bg">
		<div class="container">
			<div class="leftPanel">
				<div id="logo">
					<img src="images/logo.png">

				</div>

			</div>

			<div class="rightPanel">
				<div class="loginDetails">
					<form action="registrationController" method="post">
						<label>Sign Up</label> <input type="text" name="username"
							placeholder="Username"> <input type="password"
							name="password" placeholder="Password"> <input
							type="submit" id="buttonStyle" name="submit" value="REGISTER">
						<input type="button" value="GO BACK" id="buttonStyle"
							onclick="window.location.href='index.jsp'">

					</form>
				</div>

			</div>


		</div>


	</div>




</body>
</html>