<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hangman Application</title>
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
					<form action="">
						<label>Play Hangman</label> <input type="button" value="REGISTER"
							id="buttonStyle" onclick="window.location.href='register.jsp'">
						<input type="button" value="PLAY" id="buttonStyle"
							onclick="window.location.href='login.jsp'"> <input
							type="button" value="LEADERBOARD" id="buttonStyle"
							onclick="window.location.href='leaderboard.jsp'">
					</form>
				</div>

			</div>


		</div>




	</div>
</body>


</html>


