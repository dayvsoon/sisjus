<%-- 
    Document   : EEpessoa
    Created on : 21/04/2010, 11:41:02
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
        <title>Exclusão/Edição  - Pessoa - SisJus </title>
         <link rel="stylesheet" type="text/css" href="./estilo.css"/>
    </head>
    <body>
        <h:form id="FormDeExclusaoEdicao">
        <h1 align="center">SisJus - Sistema Sistema de Organização De Processos Jurídicos </h1>
        <h3 align="center">Tabela Do Cadastro de Pessoa</h3>
        <rich:dataTable var="dados" value="#{PersonFaces.listOfPerson}" align="center" id="PessoaPart1" styleClass="tabela" headerClass="cabecalhoTabela" rowClasses="linha1Tabela, linha2Tabela">
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Id"  />
        </f:facet>
            <h:inputText size="4" value="#{dados.id}" ></h:inputText>
    </rich:column>
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Nome"  />
        </f:facet>
            <h:inputText  value="#{dados.nome}" ></h:inputText>
    </rich:column>
           <rich:column>
            <f:facet name="header">
            <h:outputText  value="Sobrenome"  />
        </f:facet>
            <h:inputText value="#{dados.sobrenome}" ></h:inputText>
    </rich:column>
            <rich:column>
               <f:facet name="header">
                <h:outputText  value="Data de Nascimento"  />
               </f:facet>
                <h:inputText size="11" value="#{dados.data_nasc}" ></h:inputText>
            </rich:column>
             <rich:column>
               <f:facet name="header">
                <h:outputText  value="Endereço"  />
               </f:facet>
                <h:inputText value="#{dados.endereco}" ></h:inputText>
             </rich:column>
             <rich:column>
                <f:facet name="header">
                  <h:outputText  value="Bairro"  />
                </f:facet>
                  <h:inputText value="#{dados.bairro}" ></h:inputText>
              </rich:column>
             <rich:column>
                <f:facet name="header">
                    <h:outputText  value="CEP"  />
                </f:facet>
                   <h:inputText value="#{dados.cep}" ></h:inputText>
              </rich:column>
              <rich:column>
                <f:facet name="header">
                  <h:outputText  value="UF"  />
                </f:facet>
                  <h:inputText size="4" value="#{dados.uf}" ></h:inputText>
              </rich:column>
              <rich:column>
                <f:facet name="header">
                  <h:outputText  value="Cidade"  />
                </f:facet>
                  <h:inputText size="10" value="#{dados.cidade}" ></h:inputText>
               </rich:column>
            <rich:column>
                <f:facet name="header">
                  <h:outputText  value="E-mail"  />
                </f:facet>
                  <h:inputText size="10" value="#{dados.email}" ></h:inputText>
               </rich:column>
      
            <rich:column>
                <f:facet name="header">
                  <h:outputText  value="Telefone"  />
                </f:facet>
                  <h:inputText size="15" value="#{dados.telefone}" ></h:inputText>
               </rich:column>
            <rich:column>
                <f:facet name="header">
                  <h:outputText  value="Celular"  />
                </f:facet>
                  <h:inputText size="14" value="#{dados.celular}" ></h:inputText>
               </rich:column>
            <rich:column>
                <f:facet name="header">
                  <h:outputText  value="Profissão"  />
                </f:facet>
                  <h:inputText  value="#{dados.profissao}" ></h:inputText>
               </rich:column>
            <rich:column>
                <f:facet name="header">
                  <h:outputText  value="Data de Cadastro"  />
                </f:facet>
                  <h:inputText size="10" value="#{dados.data_cadastro}" ></h:inputText>
               </rich:column>
            <rich:column>
                <f:facet name="header">
                  <h:outputText  value="Sexo"  />
                </f:facet>
                  <h:inputText size="3" value="#{dados.sexo}" ></h:inputText>
               </rich:column>
            <rich:column>
                <f:facet name="header">
                  <h:outputText  value="R.G."  />
                </f:facet>
                  <h:inputText size="15" value="#{dados.identidade}" ></h:inputText>
               </rich:column>
            <rich:column>
            <f:facet name="header">
            <h:outputText  value="Ação"  />
        </f:facet>
                <h:commandLink value="Editar"  action="#{PersonFaces.finishUpdatePerson}" immediate="true"></h:commandLink> &nbsp;
                <h:commandLink value="Excluir" action="#{PersonFaces.removePerson}"></h:commandLink>

    </rich:column>
        </rich:dataTable>
    <h:commandButton value="Voltar" action="#{UserFaces.backtoMenu}" />
        </h:form>
    </body>
</html>
</f:view>
