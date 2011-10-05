<%-- 
    Document   : about
    Created on : 03/10/2011, 09:38:39
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title></title>
        </head>
        <body background="./images/VerdeClaro.png" >
            <h:form>
            <div style="text-align: center; border: 2px dashed #008000;">
                <br/>
                <h1><h:outputText value="#{Sistema.completeNameOfSystem}"/></h1>
                <h3><h:outputText value="Versão: "/> <h:outputText value="#{Sistema.version}"/> </h3>
                <h4><h:outputText value="Atualização: "/> <h:outputText value="#{Sistema.numeroAtualizacao}"/></h4>
                <h4><h:outputText value="Data da Atualização: "/> <h:outputText value="#{Sistema.dataDaUltimaAtualizacao}"/> </h4>
                <h4><h:outputText value="Página do projeto: "/> <h:outputLink><h:outputText value="#{Sistema.paginaDoSistema}"/> </h:outputLink> </h4>
                <h:commandLink value="Fechar" action="#{Sistema.backToMenu()}"/>
            </div>
            </h:form>
        </body>
    </html>
</f:view>
