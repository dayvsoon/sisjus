<%-- 
    Document   : cadastrocliente
    Created on : 28/01/2010, 16:04:29
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich" %>
<%@taglib prefix="a4j" uri="http://richfaces.org/a4j" %>
<%@taglib prefix="stella" uri="http://stella.caelum.com.br/faces" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../Formatadores.js" type="text/javascript"></script>
        <title>JSP Page</title>
        
    </head>
   <body style="background-color: #e7e7e7">
       
       <f:view>
        <h:form>
            <fieldset>
	        <legend>Cadastro de Cliente - Pessoa Física</legend>
                <h:panelGrid id="layerpanel" columns="2">
                    <h:outputLabel for="Idcliente" value="ID: "/>
                    <h:inputText id="Idcliente" value="#{ClienteFaces.selectedClient.id}" size="3"/>
                   

                    <h:outputLabel for="idpessoa" value="Id Pessoa: "/>
                    <h:selectOneMenu id="somcliente" value="#{ClienteFaces.selectedClient.nome_pessoa}">
                        <f:selectItems value="#{ClienteFaces.clientsOfSystem}"/>
                    </h:selectOneMenu>

                    <h:outputLabel for="cpf" value="C.P.F: "/>
                    <h:inputText id="cpf" size="14" maxlength="15" onkeyup="Telefone(this,2)" value="#{ClienteFaces.selectedClient.cpfcnpj}">
                        <stella:validateCPF formatted="true"/>

                    </h:inputText>
                                      
                    <h:outputLabel for="datainicio" value="Data de Cadastro: "/>
                    <h:inputText id="datainicio" size="10" value="#{cliente.datainicio}" readonly="true"/>
                   

                    <h:commandButton id="RecordDate" action="#{ClienteFaces.FinishedClient}" value="Salvar"/>
                    <h:commandButton action="#{ClienteFaces.doAddClientJuridico}" value="Cliente - Pessoa Juridica" immediate="true" />
                </h:panelGrid>
                <br/>
                    <h:message for="cpf" style="color: red"/>
            </fieldset>
    </h:form>
          </f:view>
</body>
</html>
