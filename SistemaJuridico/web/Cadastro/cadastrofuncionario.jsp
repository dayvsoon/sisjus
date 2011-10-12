<%-- 
    Document   : cadastrofuncionario
    Created on : 28/01/2010, 16:17:12
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
        <title>SisCadastro - Cadastro de Funcionário</title>

    </head>
   <body style="background-color: #e7e7e7">

       <f:view>
        <h:form>
            <fieldset>
	        <legend>Cadastro de Funcionário</legend>
                <h:panelGrid id="layerpanel" columns="3">
                    
                        
                    <h:outputLabel for="idpessoa" value="Id Pessoa: "/>
                    <rich:comboBox value="#{FuncionarioFaces.selectedFuncionario.nome_pessoa}" >
                        <f:selectItems value="#{FuncionarioFaces.clientsOfSystem}"></f:selectItems>
                    </rich:comboBox>
                    
                    <h:outputText id="idpessoa" value="#{FuncionarioFaces.selectedFuncionario.nome_pessoa}" />

                    <h:outputLabel for="cargo" value="Cargo: "/>
                    <h:inputText id="cargo" size="18" value="#{FuncionarioFaces.selectedFuncionario.cargo}"/>
                    <h:outputText />


                </h:panelGrid>
                <h:commandButton value="Salvar" action="#{FuncionarioFaces.finishedFuncionario}"/>
                <h:commandButton value="Voltar" action="#{FuncionarioFaces.gotoMenu}"/>
        </fieldset>
    </h:form>
          </f:view>
</body>
</html>
