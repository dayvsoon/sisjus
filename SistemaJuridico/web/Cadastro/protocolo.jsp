<%-- 
    Document   : protocolo
    Created on : 22/04/2010, 11:22:47
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich" %>
<%@taglib prefix="a4j" uri="http://richfaces.org/a4j" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Protocolo - SisJus v0.1</title>
    </head>
    <f:view>
    <body>
        <h:form>
             <fieldset>
	        <legend>Cadastro do Protpcolo</legend>
        <h1>Cadastro de Protoco</h1>
        <h:panelGrid id="PanelProtocolo" columns="2">
            <h:outputLabel for="Nprocesso" value="Número do processo: "/>
            <h:selectOneMenu value="#{ProtocoloFaces.selectedProtocolo.numeroProcesso}" id="Nprocesso">
                <f:selectItem itemLabel=" - Selecione o Processo - "/>
                <f:selectItems value="#{ProtocoloFaces.protocolosOfSystem}" id="SlectNProcesso"/>
            </h:selectOneMenu>

            <h:outputLabel for="OpcaoArquivado" value="Arquivado: "/>
            <h:selectOneMenu id="OpcaoArquivado">
                <f:selectItem itemLabel="Selecione..."/>
                <f:selectItem itemLabel="Sim" itemValue="Sim"/>
                <f:selectItem itemLabel="Não" itemValue="Não"/>
            </h:selectOneMenu>

            <h:outputLabel for="ArquivadoOnde" value="Está na: "/>
            <h:selectOneMenu id="ArquivadoOnde">
                <f:selectItem itemLabel="Selecione..."/>
                <f:selectItem itemLabel="Armário" itemValue="Armário"/>
                <f:selectItem itemLabel="Gaveta" itemValue="Gaveta"/>
                <f:selectItem itemLabel="Estante" itemValue="Estante"/>
                <f:selectItem itemLabel="Arquivo Morto" itemValue="Arquivo Morto"/>
                <a4j:support event="onchanged" reRender="NumeroMovel"/>

            </h:selectOneMenu>

            <h:outputText id="NumeroMovel"/>
        </h:panelGrid>
             </fieldset>
        </h:form>
    </body>
    </f:view>
</html>
