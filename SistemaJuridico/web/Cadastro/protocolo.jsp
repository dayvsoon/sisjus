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
        <title>SisProtocolo - SisJus v0.1</title>
    </head>
    <f:view>
    <body style="background-color: #e7e7e7">
        <h:form>
             <fieldset>
	        <legend>Cadastro do Protpcolo</legend>
        <h1>Cadastro de Protoco</h1>
        <h:panelGrid id="PanelProtocolo" columns="2">
            <h:outputLabel for="Nprocesso" value="Número do processo: "/>
            <h:selectOneMenu value="#{ProtocoloFaces.selectedProtocolo.numeroProcesso}" id="Nprocesso">
                <f:selectItem itemLabel=" - Selecione o Processo - "/>
                <f:selectItems id="SlectNProcesso" value="#{ProtocoloFaces.protocolosOfSystem}" />
                <a4j:support event="onsubmit" reRender="Nprocesso"/>
            </h:selectOneMenu>
                
            <h:outputLabel for="OpcaoArquivado" value="Arquivado: "/>
            <h:selectOneMenu id="OpcaoArquivado" value="#{ProtocoloFaces.selectedProtocolo.arquivado}">
                <f:selectItem itemLabel="Selecione..."/>
                <f:selectItem itemLabel="Sim" itemValue="Sim"/>
                <f:selectItem itemLabel="Não" itemValue="Não"/>
                <a4j:support event="onchange" reRender="ArquivadoOnde,MovelNumero, destino"/>
            </h:selectOneMenu>

            <h:outputLabel for="ArquivadoOnde" value="Está na: "/>
            <h:selectOneMenu id="ArquivadoOnde" value="#{ProtocoloFaces.selectedProtocolo.arquivadoOnde}" disabled="#{ProtocoloFaces.selectedProtocolo.acesso}">
                <f:selectItem itemLabel="Selecione..."/>
                <f:selectItem itemLabel="Armário" itemValue="Armário"/>
                <f:selectItem itemLabel="Gaveta" itemValue="Gaveta"/>
                <f:selectItem itemLabel="Estante" itemValue="Estante"/>
                <f:selectItem itemLabel="Arquivo Morto" itemValue="Arquivo Morto"/>
                <a4j:support event="onchange"  reRender="NumeroMovel"/>

            </h:selectOneMenu>

            <h:outputText id="NumeroMovel" value="#{ProtocoloFaces.selectedProtocolo.arquivadoOnde} Nº: "/>
            <h:inputText id="MovelNumero" value="#{ProtocoloFaces.selectedProtocolo.lugarOndeEstaOProcesso}" disabled="#{ProtocoloFaces.selectedProtocolo.acesso}"/>

            <h:outputLabel for="datatramite" value="Data: "/>
            <rich:calendar id="datatramite" value="#{ProtocoloFaces.selectedProtocolo.data_tramite}" datePattern="dd/MM/yyyy"/>

            <h:outputLabel for="assunto" value="Assunto: "/>
            <h:inputText id="assunto" value="#{ProtocoloFaces.selectedProtocolo.assunto}"/>

            <h:outputLabel for="resenha" value="Resumo: "/>
            <h:inputTextarea id="resenha" value="#{ProtocoloFaces.selectedProtocolo.resenha}" style="width: 700px" >
                <a4j:support event="onkeyup" reRender="Contador"/>
            </h:inputTextarea>

            <h:outputLabel for="origem" value="Origem: "/>
            <h:inputText id="origem" value="#{ProtocoloFaces.selectedProtocolo.origem}"/>

            <h:outputLabel for="destino" value="Destino: "/>
            <h:inputText id="destino" value="#{ProtocoloFaces.selectedProtocolo.destino}" disabled="#{Protocolo.disable}"/>

            <h:commandButton action="#{ProtocoloFaces.FinishedProtocolo}" value="Salvar"/>
            <h:commandButton value="Voltar" action="#{ProtocoloFaces.BackingToMenu}" immediate="true" />
        </h:panelGrid>
             </fieldset>
            <h:outputText id="LabelContador" value="Quantidade de caractere: "/> <h:outputText id="Contador" value="#{ProtocoloFaces.selectedProtocolo.countWordOfResenha}"/>
            <h:outputText id="LabelContadorAviso" style="color: red" value=" Max. de 320 caractere "/>
            <h:outputText id="teste" value="#{ProtocoloFaces.selectedProtocolo.acesso}"/>
        </h:form>
    </body>
    </f:view>
</html>
