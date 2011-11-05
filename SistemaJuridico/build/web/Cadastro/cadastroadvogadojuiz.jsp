<%-- 
    Document   : cadastroadvogadojuiz
    Created on : 28/01/2010, 15:51:25
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
        <title>SisCadastro - Cadastro de Advogado</title>
    </head>
    <body style="background-color: #e7e7e7">
        <f:view>
            <h:form>
                <fieldset>
                    <legend>Cadastro de Advogado</legend>
                    <h:panelGrid id="layerpanel" columns="3">

                        <h:outputLabel for="tipoAJ" value="Está pessoa é: "/>
                        <h:selectOneMenu id="tipoAJ" value="#{AdvogadoJuizFaces.selectedLayer.tipo}">
                            <f:selectItem itemLabel="- Selecione o Tipo - "/>
                            <f:selectItem itemValue="A" itemLabel="Advogado"/>
                        </h:selectOneMenu>
                        <h:outputText/>

                        <h:outputLabel for="idpessoa" value="Id Pessoa: "/>
                        <h:selectOneMenu id="idpessoa" value="#{AdvogadoJuizFaces.selectedLayer.id_pessoa}">
                            <f:selectItem itemLabel="- Selecione a Pessoa - "/>
                            <f:selectItems value="#{AdvogadoJuizFaces.clientsOfSystem}"/>
                        </h:selectOneMenu>
                        <h:outputText/>

                        <h:outputLabel for="codoab" value="Código da OAB: "/>
                        <h:inputText id="codoab" size="12" value="#{AdvogadoJuizFaces.selectedLayer.cod_oab}" required="true" requiredMessage="Campo Obrigatório Código da OAB:"/>
                        <h:outputText id="msgoab" style="color: red" value="*É indispensável o preenchimento da sua OAB" />


                        <h:message for="codoab" style="color: red"/>
                        <h:outputText/>
                    </fieldset>

                    <h:commandButton value="Salvar" action="#{AdvogadoJuizFaces.FinishedLayer}"/>
                    <h:commandButton value="Voltar" action="#{UserFaces.backtoMenu}" immediate="true"/>
                </h:panelGrid>


            </h:form>
        </f:view>
    </body>
</html>
