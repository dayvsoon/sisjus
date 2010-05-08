<%-- 
    Document   : cadastroprocesso
    Created on : 28/01/2010, 16:18:57
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
        <title>SisCadastro - Cadastro de Pessoa</title>

    </head>
   <body style="background-color: #e7e7e7">

       <f:view>
        <h:form>
            
                <fieldset>
                    <legend>Autor</legend>
                <h:panelGrid id="panelautor" columns="2">
                    <h:outputLabel for="idpessoa1" value="Id Pessoa: "/>
                    <h:selectOneMenu id="idpessoa1" value="#{ProcessoFaces.selectedProcesso.pessoa_autor}" >
                        <f:selectItem itemLabel="- Selecione a Pessoa - " />
                        <f:selectItems value="#{ProcessoFaces.clientOfSystem}"/>
                    </h:selectOneMenu>

                    <h:outputLabel for="advogado" value="Id do Advogado: "/>
                    <h:selectOneMenu id="advogado" value="#{ProcessoFaces.selectedProcesso.advogado_autor}">
                        <f:selectItem itemLabel="- Selecione o Advogado - " />
                        <f:selectItems value="#{ProcessoFaces.layerOfSystem}"/>
                    </h:selectOneMenu>
                </h:panelGrid>
            </fieldset>
          <fieldset>
	        <legend>Réu</legend>
                <h:panelGrid id="panelreu" columns="2">
                    <h:outputLabel for="idpessoa2" value="Id Pessoa: "/>
                    <h:selectOneMenu id="idpessoa2" value="#{ProcessoFaces.selectedProcesso.pessoa_reu}">
                        <f:selectItem itemLabel="- Selecione a Pessoa - " />
                         <f:selectItems value="#{ProcessoFaces.clientOfSystem}"/>
                    </h:selectOneMenu>


                    <h:outputLabel for="advogado2" value="Id do Advogado: "/>
                    <h:selectOneMenu id="advogado2"  value="#{ProcessoFaces.selectedProcesso.advogado_reu}">
                        <f:selectItem itemLabel="- Selecione o Advogado - " />
                        <f:selectItems value="#{ProcessoFaces.layerOfSystem}"/>
                    </h:selectOneMenu>
                </h:panelGrid>
            </fieldset>
            <fieldset>
                <legend>Dados Complementares</legend>
                <h:panelGrid columns="3" id="dadoscomplementares">
                    <h:outputLabel for="nprocesso" value="Nº do Processo: "/>
                    <h:inputText id="nprocesso" size="7" value="#{ProcessoFaces.selectedProcesso.numero_processo}"/>
                    <h:outputText/>
                    
                    <h:outputLabel for="coddir" value="Classificação do Direito: "/>
                    <h:inputText id="coddir" size="16" value="#{ProcessoFaces.selectedProcesso.cod_direito}"/>
                    <h:outputText/>
                    
                    <h:outputLabel for="status" value="Status do Processo: "/>
                    <h:selectOneMenu id="status" value="#{ProcessoFaces.selectedProcesso.status}">
                                        <f:selectItem itemLabel="Status..." />
                                        <f:selectItem itemLabel="Concluso para despacho" itemValue="Concluso para despacho" />
					<f:selectItem itemLabel="Em Andamento" itemValue="Em Andamento" />
					<f:selectItem itemLabel="Arquivado" itemValue="Em Revisão" />
					<f:selectItem itemLabel="A ser revisado" itemValue="A ser revisado" />
					<f:selectItem itemLabel="Concluso para decisão/Sentença" itemValue="Concluso para decisão/Sentença"/>
					<f:selectItem itemLabel="Para expedição de alvará" itemValue="Para expedição de alvará" />
					<f:selectItem itemLabel="Para audiência de instrução e julgamento" itemValue="Para audiência de instrução e julgamento"/>
					<f:selectItem itemLabel="Para réplica" itemValue="Para réplica"/>
					
	        
                    </h:selectOneMenu>
                    <h:outputText/>
                
                    <h:outputLabel for="idjuiz" value="ID do Juiz: "/>
                    <h:selectOneMenu id="idjuiz" value="#{ProcessoFaces.selectedProcesso.juiz_sentenca}">
                        <f:selectItem itemLabel="- Selecione o Juiz - " />
                        <f:selectItems value="#{ProcessoFaces.majorLayerOfSystem}"/>

                    </h:selectOneMenu>
                    <h:outputText/>

                    <h:outputLabel for="dataincial" value="Data Inicial: "/>
                    <rich:calendar id="datainicial"  value="#{ProcessoFaces.selectedProcesso.datainicial}" validator="#{processo.validateBeginDate}" >
                        <f:convertDateTime pattern="yyyy-MM-dd"></f:convertDateTime>
                         <a4j:support event="onchanged" reRender="dataini"/>
                    </rich:calendar>

                    <h:outputText id="dataini" value="#{ProcessoFaces.selectedProcesso.datainicial}" >
                     <f:convertDateTime  pattern="dd/MM/yyyy" type="date" dateStyle="short" timeZone="GMT-3" />
                    </h:outputText>

                   

                    <h:outputLabel for="datafinal" value="Data Final: "/>
                    <rich:calendar id="datafinal" value="#{ProcessoFaces.selectedProcesso.datafinal}" validator="#{processo.validateEndDate}" >
                        <f:convertDateTime pattern="yyyy-MM-dd" type="date"/>
                        <a4j:support event="onchanged" reRender="datafi"/>
                    </rich:calendar>
                    <h:outputText id="datafi" value="#{ProcessoFaces.selectedProcesso.datafinal}">
                        <f:convertDateTime  pattern="dd/MM/yyyy" type="date" dateStyle="short" timeZone="GMT-3" />
                    </h:outputText>

                </h:panelGrid>
                    
            </fieldset>
            <fieldset>
                <legend>Descrição do Processo</legend>
                <h:inputTextarea cols="70" rows="8" style="width: 1000px; height: 390px" value="#{ProcessoFaces.selectedProcesso.descricao_processo}"></h:inputTextarea>
            </fieldset>
              <fieldset>
                <legend>Observações do Processo</legend>
                <h:inputTextarea cols="70" rows="7" style="width: 1000px; height: 20;" value="#{ProcessoFaces.selectedProcesso.observacao_processo}"></h:inputTextarea>
            </fieldset>
               
                <h:commandButton value="Salvar" action="#{ProcessoFaces.FinishedProcess}"/>
                <h:commandButton value="Voltar" action="#{UserFaces.BacktoMenu}" />
                <h:messages/>

        </h:form>
          </f:view>
</body>
</html>
