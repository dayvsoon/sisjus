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

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
   <body style="background-color: #e7e7e7">

       <f:view>
        <h:form>
            <fieldset>
	        <legend>Cadastro de Cliente - Pessoa Juridica</legend>
                <h:panelGrid id="layerpanel" columns="3">
                    <h:outputLabel for="idpessoa" value="Id Pessoa: "/>
                    <h:inputText size="4"/>
                    <h:inputText id="idpessoa" size="50" readonly="true" />

                    <h:outputLabel for="cpf" value="C.N.P.J: "/>
                    <h:inputText id="cpf" size="17" maxlength="16"/>
                    <h:outputText />


                    <h:outputLabel for="datainicio" value="Data de Cadastro: "/>
                    <h:inputText id="descricaovara" size="10" maxlength="10"/>
                    <h:outputText/>

                </h:panelGrid>
        </fieldset>
    </h:form>
          </f:view>
</body>
</html>
