<%-- 
    Document   : configuracoes
    Created on : 04/10/2011, 21:35:26
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
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Panel de Configuração - Sisjus <h:outputText id="versionsys" value="#{Sistema.version}"/> </title>
              <script src="../Formatadores.js" type="text/javascript"></script>
              <script src="../validadores.js" type="text/javascript"></script>
        </head>
        <body style="background-color: #e7e7e7">
            <h:form>
                <h1><h:outputText value="Panel de Configurações"/></h1>
                <h:panelGrid columns="2">
                    <h:selectBooleanCheckbox id="enviodeemail" value="#{andamentoProcessoFaces.sendEmail}">
                        <a4j:support event="onchanged" reRender="insenha, otsenha"/>
                    </h:selectBooleanCheckbox>
                    <h:outputText  value="Enviar email toda vez que inserir um novo andamento"/>
                    
                    <h:outputText id="dominioEmail" value="Dominio: " title="Domínio do e-mail que será enviado"/>
                    <h:selectOneRadio id="EscolhaDominio" value="#{andamentoProcessoFaces.dominioEmail}">
                        <f:selectItem itemLabel="Hotmail" itemValue="hotmail"/>
                        <f:selectItem itemLabel="Gmail" itemValue="gmail"/>
                        <f:selectItem itemLabel="Yahoo" itemValue="yahoo"/>
                    </h:selectOneRadio>
                    <h:outputText id="otemailremetente" value="Email" />
                     <h:inputText id="intemailremetente" onblur="javascript:checkmail(this)" value="#{andamentoProcessoFaces.seuEmail}" title="Email do remetente"/>
               
                     <h:outputText id="otsenha" value="Senha:" />
                     <h:inputSecret id="insenha" value="#{andamentoProcessoFaces.password}"/>
                </h:panelGrid>
                    <h:commandButton id="voltarmenu" value="Voltar" action="#{Sistema.backToMenu}"/>
            </h:form>
            
        </body>
    </html>
</f:view>
