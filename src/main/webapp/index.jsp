<%@page import="business.Main"%>

<html>
<title> ::: Inicio :::</title>
<body>
<h1>
<% out.print("Saude_Rec");%>
</h1>

<h1>
<% out.print("Chamados por Bairro: ");%>
</h1>

<h1>
<% Main teste = new Main();
%>
<% out.print(teste.chamdosBairro("CAVALEIRO"));
%>
</h1>

</body>

</html>
