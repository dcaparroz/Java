<!DOCTYPE html>
<html>
<head>
<title>Cadastro de Usu�rios</title>
</head>
<body>
	<h1>Cadastro de Usu�rios</h1>
	<form action="cadUsuarios" method="post">
		Nome:<br /> 
		<input type="text" name="nome" size="20" /><br /> 
		Senha:<br />
		<input type="password" name="senha" size="20" /><br />
		N�vel:<br/>
		<select name="nivel">
			<option value="1">Administrador</option>
			<option value="2">Professor</option>
			<option value="3">Aluno</option> 
		</select> 
		<input type="submit" value="Enviar" />
	</form>
	${mensagem}	
	<br />
	<input type="submit" value="Retornar" onclick="location.href='menu.jsp'"/>
</body>
</html>