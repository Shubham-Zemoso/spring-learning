<html>

<head>
	<title>My Company Home Page</title>
</head>

<body>
	<h2>My Company Home Page</h2>
	<hr>

	Welcome to the my company home page!

	<form:form action="${pageContext.request.contextPath}/logout"
    method="POST">
    <input type="submit" value="Logout" |>
    </form:form>

</body>

</html>