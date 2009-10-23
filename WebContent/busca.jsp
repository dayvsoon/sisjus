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
<title>Buscar Processo</title>
</head>
<body>
<h:form id="BucarProcessoGravado">
<table align="center" width="100%" border="0" cellpadding="0px" cellspacing="0px"
			height="41px">
			<tr>
				<td width="11px"
					style="background-image: url(file:///C|/Documents%20and%20Settings/miguel/Desktop/vector_glass_buttons/esquerda.png); background-repeat: no-repeat;">&nbsp;</td>
				<td
					style="background-image: url(file:///C|/Documents%20and%20Settings/miguel/Desktop/vector_glass_buttons/meio.png); background-repeat: repeat-x">
				&nbsp;&nbsp;<b><h:outputText style="color:#FFFFFF;"
					value="Buscar :"></h:outputText>&nbsp;</b> <h:inputText onfocus="this.style.backgroundColor='#Fff001'"
					value="#{buscaProcesso.valorProcurado}"></h:inputText>&nbsp;&nbsp; <h:selectOneListbox
					size="1" value="#{buscaProcesso.valordaBusca}">
					<f:selectItem itemLabel="Processo" itemValue="numerodoprocesso" />
					<f:selectItem itemLabel="Nome Do Autor" itemValue="nomedoautor" />
					<f:selectItem itemLabel="Nome Do Réu" itemValue="nomedoreu" />
					<f:selectItem itemLabel="Código" itemValue="cod_id"/>
					<f:selectItem itemLabel="Selecione..." />
				</h:selectOneListbox>&nbsp; <h:commandButton value="Buscar" action="#{buscaProcesso.Buscar}"></h:commandButton>
				</td>
				<td width="17px"
					style="background-image: url(file:///C|/Documents%20and%20Settings/miguel/Desktop/vector_glass_buttons/direita.png); background-repeat: no-repeat">&nbsp;</td>
			</tr>
		</table>
		<rich:separator></rich:separator>
		<rich:spacer height="10px"></rich:spacer>
<rich:dataTable onmouseout="this.style.backgroundColor='#Fff001'" onRowMouseOver="this.style.backgroundColor='#F1F1F1'" var="record" value="#{teste.all}" align="center">
<f:facet name="header">
<rich:columnGroup id="CGroup">
<rich:column id="CID">
<h:outputLabel value="ID"/>
</rich:column>
<rich:column id="CNA">
<rich:spacer></rich:spacer>
<h:outputLabel value="Nome do Autor" />
</rich:column>
<rich:column id="CNR">
<h:outputLabel value="Nome do Réu"/>
<rich:spacer></rich:spacer>
</rich:column>
<rich:column id="CDP">
<h:outputText value="Número do Processo" />
</rich:column>
<rich:column id="CDC">
<h:outputText value="Código de Controle" />
</rich:column>
</rich:columnGroup>
</f:facet>
<rich:column id="MID">
<h:outputText value="#{record.id}" />
</rich:column>
<rich:column id="DNID" >
<h:outputText value="#{record.nomedoautor}" />
</rich:column>
<rich:column >
<h:outputText value="#{record.nomedoreu}" />
</rich:column>
<rich:column >
<h:outputText value="#{record.numerodoprocesso}" />
</rich:column>
<rich:column >
<h:outputText value="#{record.cod_id}" />
</rich:column>
</rich:dataTable>
<rich:spacer height="10px"></rich:spacer>
<rich:separator></rich:separator>

<h:panelGrid columns="3" id="Infomaçõesgrupo1">
<h:outputText value="Autor: " id="labelautor"/>
<h:selectBooleanCheckbox value="#{buscaProcesso.abilitarautor}">
<a4j:support event="onchange" reRender="OPTAutor"></a4j:support>
</h:selectBooleanCheckbox>
<h:inputText onkeypress="this.style.backgroundColor='lightgreen'" disabled="#{buscaProcesso.abilitarautor}" id="OPTAutor" value="#{buscaProcesso.pparte}" />
<h:outputText id="labelReu" value="Reu:" />
<h:selectBooleanCheckbox value="#{buscaProcesso.abilitarreu}">
<a4j:support event="onchange" reRender="OPTReu"></a4j:support>
</h:selectBooleanCheckbox>
<h:inputText disabled="#{buscaProcesso.abilitarreu}" onkeypress="this.style.backgroundColor='lightgreen'" id="OPTReu" value="#{buscaProcesso.sparte}"/>
<h:outputText id="labelnumero" value="Numero do processo: " />
<h:selectBooleanCheckbox value="#{buscaProcesso.abilitarnumeroprocesso}">
<a4j:support event="onchange" reRender="OPTNumero"></a4j:support>
</h:selectBooleanCheckbox>
<h:inputText disabled="#{buscaProcesso.abilitarnumeroprocesso}" onkeypress="this.style.backgroundColor='lightgreen'" id="OPTNumero" value="#{buscaProcesso.NProcesso}" />
<h:outputText value="Código do processo:" />
<h:selectBooleanCheckbox />
<h:inputText disabled="true" value="#{buscaProcesso.codigoGerado}" />
<h:outputText id="labelstatus" value="Status: " />
<h:selectBooleanCheckbox />
<h:outputText id="OPTStatus" value="#{buscaProcesso.situacao}" style="color: red; text-decoration: blink" />
<h:outputText value="Dias para encerrar o processo:" />
<td></td>
<h:outputText value="ExemploVaiSerColocadoAqui" />
</h:panelGrid>
<rich:separator style="color: gray"></rich:separator>
<h:panelGrid columns="1" id="Informaçõesgrupo2">
<h:outputText value="Descrição do Processo: " />
<h:outputText value="#{buscaProcesso.dprocesso}"  />
</h:panelGrid>
<rich:separator></rich:separator>
		<h:panelGrid columns="1" id="Informaçõesgrupo3">
			<h:outputText value="Observações: " />
			<h:outputText value="#{buscaProcesso.op}" />
		</h:panelGrid>
		<rich:separator></rich:separator>
		<h:commandButton action="#{buscaProcesso.Atualizar}" value="Atualizar" />
		
		<rich:modalPanel ></rich:modalPanel>
</h:form>
</body>
</f:view>
</html>