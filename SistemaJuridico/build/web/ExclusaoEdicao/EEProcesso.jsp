<%-- 
    Document   : EEusuario
    Created on : 21/04/2010, 14:59:22
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
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Exclusão/Edição  - Advogado ou Juiz - SisJus </title>
        </head>
        <body>
            <h:form id="FormDeExclusaoEdicao">
                <h1 align="center">SisJus - Sistema Sistema de Organização De Processos Jurídicos </h1>
                <h3 align="center">Tabela De Processo</h3>


                <rich:dataTable id="dtTable" var="dados" value="#{ProcessoFaces.listOfProcess}" align="center">
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Id"  />
                        </f:facet>
                        <h:inputText value="#{dados.id}" ></h:inputText>
                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Pessoa Autor"  />
                        </f:facet>
                        <h:inputText value="#{dados.pessoa_autor}" ></h:inputText>
                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Advogado Autor"  />
                        </f:facet>
                        <h:inputText value="#{dados.advogado_autor}" ></h:inputText>
                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Pessoa Réu"  />
                        </f:facet>
                        <h:inputText value="#{dados.pessoa_reu}" ></h:inputText>

                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Advogado Réu"  />
                        </f:facet>
                        <h:inputText value="#{dados.advogado_reu}" ></h:inputText>

                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Número do Processo"  />
                        </f:facet>
                        <h:inputText value="#{dados.numero_processo}" ></h:inputText>

                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Código Do Direito"  />
                        </f:facet>
                        <h:inputText value="#{dados.cod_direito}" ></h:inputText>

                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Status"  />
                        </f:facet>
                        <h:selectOneMenu value="#{dados.status}" ></h:selectOneMenu>>

                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Juiz da Sentença"  />
                        </f:facet>
                        <h:inputText value="#{dados.juiz_sentenca}" ></h:inputText>

                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Data inicial"  />
                        </f:facet>
                        <h:inputText value="#{dados.datainicial}" ></h:inputText>

                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Data Final"  />
                        </f:facet>
                        <h:inputText value="#{dados.datafinal}" ></h:inputText>

                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Usuário"  />
                        </f:facet>
                        <h:inputText value="#{dados.owner}" ></h:inputText>

                    </rich:column>
                    <rich:column>
                        <f:facet name="header">
                            <h:outputText  value="Ação"  />
                        </f:facet>
                        <h:commandLink value="Excluir"  action="#{ProcessoFaces.removeProcess}"></h:commandLink> &nbsp;
                    </rich:column>
                </rich:dataTable>
                    <h:commandButton value="Voltar" action="#{UserFaces.backtoMenu}" />
            </h:form>
        </body>
    </html>
</f:view>