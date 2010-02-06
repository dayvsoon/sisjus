<%-- 
    Document   : cadastrousuario
    Created on : 14/01/2010, 15:26:48
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
        <script src="../Formatadores.js" type="text/javascript"></script>
        <script src="../validadores.js" type="text/javascript"></script>
        <title>Sisjus - Cadastro</title>
    </head>
    <body style="background-color: #e7e7e7">
        <f:view>
        <h:form>
		 <fieldset>
	        <legend>Cadastro de Usuário</legend>
				<h:panelGrid columns="2">
                                    <h:outputLabel for="nomepessoa" value="Nome: "/>
                                    <h:inputText id="nomepessoa" size="25" value="#{UserFaces.selectedUser.nome}"/>
                                   

                                    <h:outputLabel for="sobrenome" value="Sobrenome:"/>
                                    <h:inputText id="sobrenome" size="25" value="#{UserFaces.selectedUser.sobrenome}"/>
                                    
                                    
                                        <h:outputLabel for="nome" value="Login*: "  />
                                       
                                        <h:inputText id="nome" size="20" value="#{UserFaces.selectedUser.login}"/>

					<h:outputLabel for="Password" value="Password*: "  />
                                        <h:inputSecret id="Password" size="20" value="#{UserFaces.selectedUser.password}"/>
                                   


                                        <h:outputLabel for="dataDeCadastro" value="Data do Cadastro: "></h:outputLabel>
                                       
                                        <h:inputText id="dataDeCadastro" size="10" value="#{Usuario.dataDeCadastro}" readonly="true"></h:inputText>



					
                                        <h:commandButton value="Salvar" id="inserir" action="#{UserFaces.FinishedUser}" />
		    	</h:panelGrid>
		    </fieldset>
	</h:form>
        </f:view>
    </body>
</html>
