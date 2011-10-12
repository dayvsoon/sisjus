<%-- 
    Document   : andamento
    Created on : 28/09/2011, 21:41:00
    Author     : miguel
    Atualizado : 10/10/2011 22:24:43
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich" %>
<%@taglib prefix="a4j" uri="http://richfaces.org/a4j" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Andamento de Processo</title>
    </head>
    <body style="background-color: #e7e7e7">
        <f:view>
            <h:form>
                <fieldset>
                    <legend>Andamento do processo</legend>
                    <h:panelGrid columns="2">
                        <h:outputText id="OTNumeroProcesso" value="Numero Processo: "/>
                        <rich:comboBox value="#{andamentoProcessoFaces.selectedAndamento.numeroProcesso}" id="NumeroProcesso" >
                            <f:selectItems value="#{andamentoProcessoFaces.andamentosOfSystem}" />
                        </rich:comboBox>

                        <h:outputLabel for="status" value="Status do Processo: "/>
                        <h:selectOneMenu id="status" value="#{andamentoProcessoFaces.selectedAndamento.status}">
                            <f:selectItem itemLabel="Status..." />
                            <f:selectItems value="#{andamentoProcessoFaces.statusOfBase}" />
                        </h:selectOneMenu> 

                        <h:outputLabel for="dataDeCadastro" value="Data do Cadastro: "></h:outputLabel>
                        <h:inputText id="dataDeCadastro" size="10" value="#{andamentoProcessoFaces.selectedAndamento.data}" readonly="true"/>

                        
                            <h:outputText id="OTDescricaoProcesso" value="Descricao Processo: "/>
                            <h:inputTextarea cols="70" rows="7" style="width: 1000px; height: 20;" value="#{andamentoProcessoFaces.selectedAndamento.observacao_processo}"></h:inputTextarea>
                            <h:outputText id="otemail" value="E-mail:"/>
                            <rich:comboBox value="#{andamentoProcessoFaces.emailDeEnvio}" id="EmailEnvio" >
                                <f:selectItems value="#{andamentoProcessoFaces.emailUser}" />
                            </rich:comboBox>
                            
                            
                            <h:commandButton value="Salvar" action="#{andamentoProcessoFaces.finishedProtocolo}"/>
                            <h:commandButton value="Voltar" action="#{andamentoProcessoFaces.backToPageBefore}"/>
                    </h:panelGrid> 
                </h:form>
            </f:view> 
    </body>
</html>
