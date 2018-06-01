<%@page import="hangman.DAO.UserDAO"%>
<%@page import="hangman.controller.LoginController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HangmanApp</title>
</head>
<body>
	<div class="bg">
		<div class="container">
			<div class="leftPanel">
				<div id="logo"></div>

			</div>

			<div class="rightPanel">
				<div class="loginDetails">
					<form name="form" action="LoginServlet" method="post">
						<p>${message }</p>
						
				

						<input type="text" name="guessWord" placeholder="GuessWord">

						<input type="submit" id="buttonStyle" name="guess" value="GUESS">

					</form>

					<p style="color: white; margin-left:45px" >
						Score:
						<%
						if (request.getAttribute("score") != null) {
					%>
						<%=request.getAttribute("score")%>
						<%
							}
						%>
					</p>
					
					
					<p style="color: white; margin-left:45px">
							Lives:
							<%
							if (request.getAttribute("wrongAnswers") != null) {
						%>
							<%=request.getAttribute("wrongAnswers")%>
							<%
								}
							%>
						</p>
				</div>

			</div>


		</div>


	</div>

</body>
</html>