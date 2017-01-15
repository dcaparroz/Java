<!DOCTYPE html>
<%@page import="java.io.Console"%>
<%@page import="br.com.fiap.entity.*"%>
<jsp:useBean id="usuarios" class="br.com.fiap.entity.Usuario" scope="request" ></jsp:useBean>
<html>
<head>
<title>Lista de notas</title>
</head>
<body>
	<h1>Lista de notas para atuação</h1>
	<input type="submit" value="Retornar" onclick="location.href='menu.jsp'"/>
</body>
</html>