<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuario</title>
</head>
<body style="background-color:#D0F5A9;">
 <br> <br> <br> <br> <br>
 <center>
<h1>Hola: ${user}</h1>
<br>
<form action="Contador" method="GET">
<h3>NºVeces:  ${contador}</h3>

<input type="submit" value="Sumar" />
</form>
<br>
<br>
<form action="Logout.jsp" method="GET">
  <input type="submit" value="Desconectarse" />
  </center>
</form>
</body>
</html>