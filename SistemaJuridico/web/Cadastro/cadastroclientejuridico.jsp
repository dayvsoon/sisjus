<%-- 
    Document   : cadastroclientejuridico
    Created on : 28/01/2010, 16:14:55
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
        <title>SisCadastro - Cadastro de Cliente - Pessoa Juridica</title>

    </head>
   <body style="background-color: #e7e7e7">

       <f:view>
        <h:form>
            <fieldset>
	        <legend>Cadastro de Cliente - Pessoa Juridica</legend>
                <h:panelGrid id="layerpanel" columns="3">

                   
                    
                    <h:outputLabel for="idpessoa" value="Id Pessoa: "/>
                    <h:selectOneMenu id="idpessoa" value="#{ClienteFaces.selectedClient.nome_pessoa}">
                        <f:selectItem itemLabel="- Selecione a Pessoa -"/>
                        <f:selectItems value="#{ClienteFaces.clientsOfSystem}"/>
                        <a4j:support event="onchange" reRender="idpessoa" immediate="true"/>
                    </h:selectOneMenu>
                    <h:outputText/>

                    <h:outputLabel for="cnpj" value="C.N.P.J: "/>
                    <h:inputText id="cnpj" size="18" maxlength="18" onkeyup="Telefone(this,3)"value="#{ClienteFaces.selectedClient.cpfcnpj}">
                        <stella:validateCNPJ formatted="true"/>
                    </h:inputText>
                    <h:message for="cnpj" style="color: red"/>


                    <h:outputLabel for="datainicio" value="Data de Cadastro: "/>
                    <h:inputText id="datainicio" size="10" value="#{cliente.datainicio}" readonly="true"/>
                    <h:outputText/>

                </h:panelGrid>
              
                <h:commandButton action="#{ClienteFaces.FinishedClient}" value="Salva" />
                <h:commandButton value="Voltar" action="#{ClienteFaces.GotoMenu}"/>
                
        </fieldset>
    </h:form>
          </f:view>
</body>
</html>
