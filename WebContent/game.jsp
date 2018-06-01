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
			<img src="images/1.jpg" alt="IMG" width="470px" height="768px">
				<div id="logo">
				
				<%if (request.getAttribute("wrongAnswers") !=null){
 					if ((int) (request.getAttribute("wrongAnswers")) ==0 ) {
 				%>
					<img src= "images/1.jpg" alt="IMG">
						<%
 					}
 				%>	
 				<%
 					if ((int) (request.getAttribute("wrongAnswers")) ==1 ) {
 				%>
					<img src= "images/2.jpg" alt="IMG">
						<%
 					}
 				%>	
 				<%
 					if ((int) (request.getAttribute("wrongAnswers")) ==2 ) {
 				%>
					<img src= "images/3.jpg" alt="IMG">
						<%
 					}
 				%>	
 				<%
 					if ((int) (request.getAttribute("wrongAnswers")) ==3 ) {
 				%>
					<img src= "images/4.jpg" alt="IMG">
						<%
 					}
 				%>	
 				<%
 					if ((int) (request.getAttribute("wrongAnswers")) ==4) {
 				%>
					<img src= "images/5.jpg" alt="IMG">
						<%
 					}
					}
 				%>	
				
				
				</div>

			</div>

			<div class="rightPanel">
				<div class="loginDetails">
				
					<form name="form" action="GameServlet" method="post">
						<h1 style="color:white; margin-left:100px">
					
						Word:
						<%
						if (request.getAttribute("wordHolder") != null) {
					%>
						<%=request.getAttribute("wordHolder")%>
						<%
							}
						%>
					
					</h1>
						
				

						<input type="text" name="guessWord" placeholder="GuessWord">

						<input type="submit" id="buttonStyle" name="guess" value="GUESS">

					</form>
					<div style="margin-top: 60px">
					<p style="color: white; margin-left:100px" >
						Score:
						<%
						if (request.getAttribute("score") != null) {
					%>
						<%=request.getAttribute("score")%>
						<%
							}
						%>
					</p>
					
					
					<p style="color: white; margin-left:100px; ">
							Lives:
							<%
							if (request.getAttribute("wrongAnswers") != null) {
						%>
							<%=request.getAttribute("wrongAnswers")%>
							<%
								}
							%>
						</p>
						
						<p style="color: white; margin-left:100px">
							Previous guesses:
							<%
							if (request.getAttribute("previouseGuesses") != null) {
						%>
							<%=request.getAttribute("previouseGuesses")%>
							<%
								}
							%>
						</p>
						
						</div>
				</div>

			</div>


		</div>


	</div>

</body>
</html>