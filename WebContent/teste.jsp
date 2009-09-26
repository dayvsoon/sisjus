<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Testando</title>
</head>
<body>
<h:form id="testando">
  <div >
  <nobr><SPAN><h:outputText style="font-size: 10pt; color: lightblue;" value="Testrando" />
  ,<h:outputText style="font-size: 10pt; color: lightblue;" value="seu IP é:" />
  </SPAN></nobr>
  <hr color="blue" size="1"></hr>
  </div>


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
<rich:column id="CDS">
<h:outputText value="Status do Processo" />
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
<h:outputText value="#{record.status}" />
</rich:column>
<rich:column >
<h:outputText value="#{record.cod_id}" />
</rich:column>
</rich:dataTable>
<rich:spacer height="10px"></rich:spacer>
<rich:separator></rich:separator>
<h:outputText value="#{teste.datainicial}" id="data"/>
<rich:calendar value="#{teste.datainicial}">
<a4j:support event="onchange" reRender="data" ></a4j:support>
<f:convertDateTime dateStyle="short" pattern="dd/mm/yyyy"/>
</rich:calendar>
<h:commandButton action="passar" value="teste">
<a4j:support event="onsubmit" reRender="data" ></a4j:support>
</h:commandButton>
</h:form>
</body>
</html>
</f:view>