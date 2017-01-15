<!DOCTYPE html>
<%@page import="java.io.Console"%>
<%@page import="br.com.fiap.entity.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="usuarios" class="br.com.fiap.entity.Usuario" scope="request" ></jsp:useBean>
<html>
<head>
<title>Menu de Opções</title>
</head>
<body>
  	<% 
		Usuario usr = (Usuario)session.getAttribute("session_usuario");
	%>
	
	<h1>Menu de Opções</h1>

	<%
		if (1==usr.getNivel()){
	%> 
	<ul>
		<li><a href="cadUsuarios.jsp">Cadastro de Usuários</a></li>
	</ul>
	<%} %>
	<%
		if (3!=usr.getNivel()){
	%>
	<u1>
		<li><a href="cadNotas.jsp">Cadastro de Notas</a></li>
	</u1>
	<u1>
	    <li><a href="listNotasProf.jsp">Lista de Manuteção de Notas</a></li>
	</u1>
	<%} %>
	<%
		if(2!=usr.getNivel()){
	%>
	<u1>
	    <li><a href="listNotasAlunos.jsp">Lista de Notas</a></li>
	</u1>
	<%} %>
	<br />
	<input type="submit" value="Retornar" onclick="location.href='/Validação/login.jsp'"/>
</body>
</html>