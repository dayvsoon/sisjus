<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
    <%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
    <%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
    <%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<f:view>
<head>
<style type="text/css">

.divsuperior{
font-style: normal;
font-weight: bold;
font-family: verdana;
color: lightblue;
font-size: 10pt;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h:form>
<div>
<h:outputText value="Olá" styleClass="divsuperior" /> <h:outputText value="#{sJuser.loggin}" styleClass="divsuperior"/>, <h:outputText styleClass="divsuperior" value=" você tem " /> <h:outputText style="color: red;font-family: verdana; font-size: 10pt;" id="QuantidadeProcessoPendente" value="#{navBar.qtdprocesso}" /><h:outputText styleClass="divsuperior" value="#{navBar.colocacaoDaPalavra}" /><h:outputText styleClass="divsuperior" value=" que não estão finalizado." />
<hr size="1" color="blue">
</div>
<table height="60%" border="0" cellspacing="0" cellpadding="0" align="left">
<tr height="30px">
</tr>
</table>


<h:commandButton id="Analisar" action="#{navBar.Dados}" value="Analisar">
<a4j:support event="onsubmit" reRender="QuantidadeProcessoPendente"></a4j:support>
</h:commandButton>
</h:form>
</body>
</f:view>
</html>