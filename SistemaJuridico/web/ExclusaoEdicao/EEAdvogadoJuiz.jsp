<%-- 
    Document   : EEAdvogadoJuiz
    Created on : 21/04/2010, 10:35:17
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich" %>
<%@taglib prefix="a4j" uri="http://richfaces.org/a4j" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exclusão/Edição  - Advogado ou Juiz - SisJus </title>
    </head>
    <body>
        <h:form id="FormDeExclusaoEdicao">
        <h1 align="center">SisJus - Sistema Sistema de Organização De Processos Jurídicos </h1>
        <h3 align="center">Tabela De Cliente</h3>
        <rich:dataTable var="dados" value="#{AdvogadoJuizFaces.listOfLayer}" align="center">
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Id"  />
        </f:facet>
            <h:inputText value="#{dados.id_advogadojuiz}" ></h:inputText>
    </rich:column>
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Pessoa"  />
        </f:facet>
            <h:inputText value="#{dados.id_pessoa}" ></h:inputText>
    </rich:column>
           <rich:column>
            <f:facet name="header">
            <h:outputText  value="Código da OAB"  />
        </f:facet>
            <h:inputText value="#{dados.cod_oab}" ></h:inputText>
    </rich:column>
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Número da Vara"  />
        </f:facet>
            <h:inputText value="#{dados.nvara}" ></h:inputText>

    </rich:column>
    <rich:column>
        <f:facet name="header">
            <h:outputText value="Descrição da Vara"/>
        </f:facet>
        <h:inputText value="#{dados.descricaodaVara}" />
    </rich:column>
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Ação"  />
        </f:facet>
                <h:commandLink value="Editar"  action="#{AdvogadoJuizFaces.finishedLayer}"></h:commandLink> &nbsp;
                <h:commandLink value="Excluir" action="#{AdvogadoJuizFaces.removeLayer}"></h:commandLink>

    </rich:column>
        </rich:dataTable>
                 <h:commandButton value="Voltar" action="#{UserFaces.BacktoMenu}" />
        </h:form>
    </body>
</html>
</f:view>