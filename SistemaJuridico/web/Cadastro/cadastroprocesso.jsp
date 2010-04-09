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
        <title>JSP Page</title>

    </head>
   <body style="background-color: #e7e7e7">

       <f:view>
        <h:form>
            
                <fieldset>
                    <legend>Autor</legend>
                <h:panelGrid id="panelautor" columns="2">
                    <h:outputLabel for="idpessoa1" value="Id Pessoa: "/>
                    <h:inputText id="idpessoa1"size="4"/>

                    <h:outputLabel for="advogado" value="Id do Advogado: "/>
                    <h:inputText id="advogado" size="4"/>
                </h:panelGrid>
            </fieldset>
          <fieldset>
	        <legend>Réu</legend>
                <h:panelGrid id="panelreu" columns="2">
                    <h:outputLabel for="idpessoa2" value="Id Pessoa: "/>
                    <h:inputText id="idpessoa2" size="4"/>


                    <h:outputLabel for="advogado2" value="Id do Advogado: "/>
                    <h:inputText id="advogado2" size="4"/>
                </h:panelGrid>
            </fieldset>
            <fieldset>
                <legend>Dados Complementares</legend>
                <h:panelGrid columns="3" id="dadoscomplementares">
                    <h:outputLabel for="nprocesso" value="Nº do Processo: "/>
                    <h:inputText id="nprocesso" size="7"/>
                    <h:outputText/>
                    
                    <h:outputLabel for="coddir" value="Classificação do Direito: "/>
                    <h:inputText id="coddir" size="16"/>
                    <h:outputText/>
                    
                    <h:outputLabel for="status" value="Status do Processo: "/>
                    <h:selectOneMenu id="status">
                                        <f:selectItem itemLabel="Status..." />
                                        <f:selectItem itemLabel="Concluso para despacho" itemValue="Concluso para despacho" />
					<f:selectItem itemLabel="Em Andamento" itemValue="Em Andamento" />
					<f:selectItem itemLabel="Arquivado" itemValue="Em Revisão" />
					<f:selectItem itemLabel="A ser revisado" itemValue="A ser revisado" />
					<f:selectItem itemLabel="Concluso para decisão/Sentença" itemValue="Concluso para decisão/Sentença"/>
					<f:selectItem itemLabel="Para expedição de alvará" itemValue="Para expedição de alvará" />
					<f:selectItem  itemLabel="Para audiência de instrução e julgamento" itemValue="Para audiência de instrução e julgamento"/>
					<f:selectItem  itemLabel="Para réplica" itemValue="Para réplica"/>
					
	        
                    </h:selectOneMenu>
                    <h:outputText/>
                
                    <h:outputLabel for="idjuiz" value="ID do Juiz: "/>
                    <h:inputText id="idjuiz" size="5"/>
                    <h:outputText/>

                    <h:outputLabel for="dataincial" value="Data Inicial: "/>
                    <h:inputText id="datainicial" size="10"/>
                    <h:outputText/>

                    <h:outputLabel for="datafinal" value="Data Final: "/>
                    <h:inputText id="datafinal" size="10"/>
                    <h:outputText/>

                </h:panelGrid>
                    
            </fieldset>
            <fieldset>
                <legend>Descrição do Processo</legend>
                <h:inputTextarea cols="70" rows="8" style="width: 1000px; height: 390px"></h:inputTextarea>
            </fieldset>
              <fieldset>
                <legend>Observações do Processo</legend>
                <h:inputTextarea cols="70" rows="7" style="width: 1000px; height: 20;"></h:inputTextarea>
            </fieldset>
                <h:commandButton value="Salvar" action="#{ProcessoFaces.FinishedProcess}"/>
                <h:commandButton value="Voltar" />

        </h:form>
          </f:view>
</body>
</html>
