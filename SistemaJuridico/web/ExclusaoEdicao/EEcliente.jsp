<%-- 
    Document   : EEcliente
    Created on : 21/04/2010, 11:18:00
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
        <h3 align="center">Tabela De Advogado e Juiz</h3>
        <rich:dataTable var="dados" value="#{ClienteFaces.listOfClient}" align="center">
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Id"  />
        </f:facet>
            <h:inputText value="#{dados.id}" ></h:inputText>
    </rich:column>
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Pessoa"  />
        </f:facet>
            <h:inputText value="#{dados.nome_pessoa}" ></h:inputText>
    </rich:column>
           <rich:column>
            <f:facet name="header">
            <h:outputText  value="CPF/CNPJ"  />
        </f:facet>
            <h:inputText value="#{dados.cpfcnpj}" ></h:inputText>
    </rich:column>
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Data de inclusão"  />
        </f:facet>
            <h:inputText value="#{dados.datainicio}" ></h:inputText>

    </rich:column>
   
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Ação"  />
        </f:facet>
                <h:commandLink value="Editar"  action="#{ClienteFaces.FinishUpdateClient}"></h:commandLink> &nbsp;
                <h:commandLink value="Excluir" action="#{ClienteFaces.removeClient}"></h:commandLink>

    </rich:column>
        </rich:dataTable>
                 <h:commandButton value="Voltar" action="#{UserFaces.BacktoMenu}" />
        </h:form>
    </body>
</html>
</f:view>