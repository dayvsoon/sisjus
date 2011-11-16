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
                <fieldset><legend> Configurações do Envio de Email</legend>
                <h:panelGrid columns="2">
                    <h:outputText value="Enviar email ao dar andamento no processo? "/>
                    <h:selectOneMenu id="escolhaenvioemail" value="#{configuracoesFaces.selectedConfig.sendEmail}">
                         <f:selectItem itemLabel="Selecione..."/> 
                         <f:selectItem itemLabel="Sim" itemValue="S"/>
                          <f:selectItem itemLabel="Não" itemValue="N"/>
                     </h:selectOneMenu>
                    
                    <h:outputText id="dominioEmail" value="Dominio: " title="Domínio do e-mail que será enviado"/>
                    <h:selectOneRadio id="EscolhaDominio" value="#{configuracoesFaces.selectedConfig.dominioEmail}">
                        <f:selectItem itemLabel="Hotmail" itemValue="hotmail"/>
                        <f:selectItem itemLabel="Gmail" itemValue="gmail"/>
                        <f:selectItem itemLabel="Yahoo" itemValue="yahoo"/>
                    </h:selectOneRadio>
                    <h:outputText id="otemailremetente" value="Email" />
                    <h:inputText id="intemailremetente" onblur="javascript:checkmail(this)" value="#{configuracoesFaces.selectedConfig.seuEmail}" title="Email do remetente"/>
               
                     <h:outputText id="otsenha" value="Senha:" />
                     <h:inputSecret id="insenha" value="#{configuracoesFaces.selectedConfig.suaSenha}"/>
                </h:panelGrid>
                </fieldset>    
               <fieldset>
                    <legend>Configurações de Backup</legend>
                <h:panelGrid columns="3" id="panelbackup">
                     <h:outputText value="Caminho para Backup: " id="caminhoBackup" />
                     <h:inputText id="inpathbackup" value="#{configuracoesFaces.selectedConfig.path2}" size="100"/>
                     <h:commandButton action="#{configuracoesFaces.selectedConfig.escolherDiretorio()}" value="Procurar" id="diretorioLog" immediate="true"/>
                     <h:outputText id="LabelZipado" value="Desejar Compactar o Backup?"/>
                     <h:selectOneMenu id="escolhazip" value="#{configuracoesFaces.selectedConfig.zip}">
                         <f:selectItem itemLabel="Selecione..."/> 
                         <f:selectItem itemLabel="Sim" itemValue="S"/>
                          <f:selectItem itemLabel="Não" itemValue="N"/>
                     </h:selectOneMenu>
                     <h:outputText/>
                     </h:panelGrid>
                    </fieldset>
                <fieldset> <legend>Configurações de Atualização Automática</legend>
                <h:panelGrid columns="2" id="panelAtualizacao">
                    <h:outputText id="labelatulização" value="Site de Atualização: "/>
                    <h:outputText  id="caminhodosite" value="#{configuracoesFaces.selectedConfig.urlAtualizacao}" /> 
                </h:panelGrid> 
                </fieldset>
                <fieldset> <legend>Caminho para gravação de Log</legend>
                    <h:panelGrid columns="3" id="panellog">
                        <h:outputText value="Caminho do Log: "/>
                        <h:inputText value="#{configuracoesFaces.selectedConfig.realPath}" size="100" />
                        <h:commandButton value="Procurar" action="#{configuracoesFaces.selectedConfig.escolherDireotrioLog()}" immediate="true"/>
                    </h:panelGrid>
                </fieldset>
                <h:commandButton value="Gravar" action="#{configuracoesFaces.finishConfig()}"/>
                <h:commandButton id="voltarmenu" value="Voltar" action="#{Sistema.backToMenu}" immediate="true"/>
            </h:form>
            
        </body>
    </html>
</f:view>
