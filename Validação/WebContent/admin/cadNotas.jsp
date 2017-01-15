<!DOCTYPE html>
<%@page import="java.io.Console"%>
<%@page import="br.com.fiap.entity.*"%>
<jsp:useBean id="usuarios" class="br.com.fiap.entity.Usuario" scope="request" ></jsp:useBean>
<html>
<head>
<title>Cadastro de Notas</title>
</head>
<body>
	<h1>Cadastro de notas</h1>
	<input type="submit" value="Retornar" onclick="location.href='menu.jsp'"/>
</body>
</html>