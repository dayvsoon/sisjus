<%-- 
    Document   : configuracoes
    Created on : 04/10/2011, 21:35:26
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
            <title>Panel de Configuração - Sisjus <h:outputText id="versionsys" value="#{Sistema.version}"/> </title>
        </head>
        <body style="background-color: #e7e7e7">
            <h:form>
                <h1><h:outputText value="Panel de Configurações"/></h1>
                <h:panelGrid columns="2">
                    <h:selectBooleanCheckbox id="enviodeemail" value="#{andamentoProcessoFaces.sendEmail}">
                    </h:selectBooleanCheckbox>
                    <h:outputText  value="Enviar email toda vez que inserir um novo andamento"/>
                    
                    <h:outputText id="dominioEmail" value="Dominio: " title="Domínio do e-mail que será enviado"/>
                    <h:selectOneMenu id="EscolhaDominio" value="#{email.dominio}">
                        <f:selectItem itemLabel="Selecione o dominio"/>
                        <f:selectItem itemLabel="Hotmail" itemValue="hotmail"/>
                        <f:selectItem itemLabel="Gmail" itemValue="gmail"/>
                        <f:selectItem itemLabel="Yahoo" itemValue="yahoo"/>
                    </h:selectOneMenu>
                </h:panelGrid>
                    <h:commandButton id="voltarmenu" value="Voltar" action="#{Sistema.backToMenu}"/>
            </h:form>
            
        </body>
    </html>
</f:view>
