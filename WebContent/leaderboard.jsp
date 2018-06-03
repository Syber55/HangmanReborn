<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="hangman.DAO.ScoreDAOImplementation"%>

<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hangman play</title>
</head>
<body>

	<div class="bg">
		<div class="container">
			<div class="leftPanel">

				<div style="padding-left: 315px" id="leaderboard">
					<h1>Scoreboard</h1>
					<div class="score">
						<table align="center" color="white">
							<th></th>
							<th>Username</th>
							<th>Score</th>
							<c:forEach items="${scoreList}" var="game" varStatus="counter"
								begin="1" end="10">


								<tr>
									<td>${score.id}</td>
									<td>${score.username}</td>
									<td>${score.score}</td>
									<!-- <td>${game.id}</td> -->




								</tr>
							</c:forEach>
						</table>
					</div>

				</div>



			</div>






		</div>


	</div>



</body>
</html>