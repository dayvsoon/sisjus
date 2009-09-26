<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<f:view>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Visualização do Processo</title>
	</head>
	<body>
	<h:form>
		<h:panelGrid columns="2" cellspacing="15">
		<h:outputText value="Autor: " />
		<h:outputText value="#{cadastroProcesso.nomeDoAutor}" />
		<h:outputText value="Réu: " />
		<h:outputText value="#{cadastroProcesso.nomeDoReu}" />
		<h:outputText value="Numero do Processo: " />
		<h:outputText value="#{cadastroProcesso.numeroProcesso}" />
		<h:outputText value="Tipo: " />
		<h:outputText value="#{cadastroProcesso.cod_dir}" />
		<h:outputText value="Status" />
		<h:outputText style="Text-decoration: blink; color: red" value="#{cadastroProcesso.status}" />
		
		
		
		</h:panelGrid>
		<br>
		<rich:separator></rich:separator>
		<table>
			<tr>
				<td><b><h:outputText value="Descrição do Processo: "></h:outputText></b></td>
			</tr>
			<tr>
				<td><h:outputText
					value="#{cadastroProcesso.descricaoDoProcesso}"
					style="width:950px; height: 320px"></h:outputText>
			</tr>
			<tr>
				
			</tr>
		</table>
		<rich:separator></rich:separator>

		<table>
			<tr>
				<td><b><h:outputText value="Observações: "></h:outputText></b></td>
			</tr>
			<tr>
				<td><h:outputText style="width: 950px; height: 60;"
					value="#{cadastroProcesso.observacao}"></h:outputText></td>
			</tr>
		</table>
	</h:form>
	</body>
</f:view>
</html>