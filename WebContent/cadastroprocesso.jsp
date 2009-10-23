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
	<title>Cadastro de Processo</title>
	</head>
	<body>
	<h:form>
		<br>
		
		  <f:facet name="header">
	<h:outputText value="W.F. Advogacia" style="color: green"/>    
	</f:facet>
	 <table cellspacing="15">
	   <tr>
	     <td><h:outputText value="Autor: " /></td>
	     <td><h:outputText value="Réu: " />
	     <td><h:outputText value="Numero do Processo: " />   </td>
	     <td><h:outputText value="Classificação do Direito: " />
	     <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:outputText value="Status: " />
	     <td><h:outputText value="Data:" /></td> 
	   </tr>
	   <tr>
	   <td><h:inputText onclick="this.style.background: #638cb5; color: white" onselect="background: #638cb5; color: white" value="#{cadastroProcesso.nomeDoAutor}" /></td>
	   <td><h:inputText value="#{cadastroProcesso.nomeDoReu}" /></td>
	   <td><h:inputText value="#{cadastroProcesso.numeroProcesso}" /></td>
	   <td><h:inputText value="#{cadastroProcesso.cod_dir}" />
	   <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:selectOneListbox value="#{cadastroProcesso.status}" size="1" style="color: red"   >
	                <f:selectItem itemLabel="Concluso para despacho" itemValue="Concluso para despacho" />
					<f:selectItem itemLabel="Em Andamento" itemValue="Em Andamento" />
					<f:selectItem itemLabel="Arquivado" itemValue="Em Revisão" />
					<f:selectItem itemLabel="A ser revisado" itemValue="A ser revisado" />
					<f:selectItem itemLabel="Concluso para decisão/Sentença" itemValue="Concluso para decisão/Sentença"/>
					<f:selectItem itemLabel="Para expedição de alvará" itemValue="Para expedição de alvará" />
					<f:selectItem  itemLabel="Para audiência de instrução e julgamento" itemValue="Para audiência de instrução e julgamento"/>
					<f:selectItem  itemLabel="Para réplica" itemValue="Para réplica"/>
					<f:selectItem itemLabel="Status..." />
	        </h:selectOneListbox></td>
	        <td><h:inputText  />  </td>
	     
	   </tr>
	 </table>		
		<br>
		
		<rich:separator></rich:separator>
		<table>
			<tr>
				<td><b><h:outputText value="Descrição do Processo: "></h:outputText></b></td>
			</tr>
			<tr>
				<td><h:inputTextarea cols="70" rows="8"
					value="#{cadastroProcesso.descricaoDoProcesso}"
					style="width: 1000px; height: 390px"></h:inputTextarea>
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
				<td><h:inputTextarea style="width: 950px; height: 60;"
					value="#{cadastroProcesso.observacao}"></h:inputTextarea></td>
			</tr>
		</table>

		<h:commandButton value="Visualizar"
			action="http://localhost:8080/SisJus/faces/visualizar.jsp"></h:commandButton>
		<h:commandButton value="Grava"
			action="#{cadastroProcesso.InserirDados}"></h:commandButton>
			<f:facet name="Footer">
			<h:outputText value="Todos Direitos Resevado. By MiguelCPJava" />
			</f:facet>
	</h:form>
	</body>
</f:view>
</html>