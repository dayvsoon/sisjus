<%-- 
    Document   : BuscaPessoa
    Created on : 22/04/2010, 15:31:32
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
    <f:view>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SisJus - Buscar Pessoa</title>
     
    </head>
    <body>
        <h:form>
            <h:panelGrid columns="3" id="BuscaPessoa">
                <h:outputLabel for="idpessoa" value="Id Pessoa: "/>
                <h:selectOneMenu id="somcliente" value="#{PersonFaces.selectedPerson.id}">
                        <f:selectItems value="#{PersonFaces.peopleBD}"/>
                        <a4j:support event="onchange" reRender="nome"/>
                    </h:selectOneMenu>
                <h:commandButton value="Pesquisar" action="#{PersonFaces.doSearch}">
                    <a4j:support event="onsubmit" reRender="nome,PanelInputs"/>
                </h:commandButton>    
            </h:panelGrid>
        <fieldset>
	       		 <legend>Pesquisa de Pessoas</legend>

                         <h:panelGrid columns="2" id="PanelInputs">
                             <h:outputLabel for="nome" value="Nome "  />
                             <h:inputText id="nome"  value="#{PersonFaces.selectedPerson.nome}"/>

                             <h:outputLabel for="sobrenome" value="Sobrenome:"/>
                             <h:inputText id="sobrenome"  size="40" value="#{PersonFaces.selectedPerson.sobrenome}"/>

                             <h:outputLabel for="sexo" value="Sexo: "/>
                             <h:inputText id="sexo"  value="#{PersonFaces.selectedPerson.sexo}" size="2"/>
                             
                             <h:outputLabel for="rgpessoa" value="RG: "/>
                             <h:inputText id="rgpessoa" size="14" value="#{PersonFaces.selectedPerson.identidade}" />

                             <h:outputLabel for="txtDate" value="Data de nascimento: "/>
                             <h:inputText id="txtDate"  value="#{PersonFaces.selectedPerson.data_nasc}"/>

                             <h:outputLabel for="endereco" value="Endereço: "/>
                             <h:inputText id="endereco"  size="40" value="#{PersonFaces.selectedPerson.endereco}" />

                             <h:outputLabel for="bairro" value="Bairro: "/>
                             <h:inputText id="bairro"  size="14" value="#{PersonFaces.selectedPerson.bairro}"/>

                             <h:outputLabel for="cep" value="C.E.P.:"/>
                             <h:inputText id="cep"  value="#{PersonFaces.selectedPerson.cep}"  size="14"/>

                             <h:outputLabel for="uf" value="UF: "/>
                             <h:inputText id="uf"  size="3" value="#{PersonFaces.selectedPerson.uf}"/>

                             <h:outputLabel for="cidade" value="Cidade: "/>
                             <h:inputText  id="cidade"  value="#{PersonFaces.selectedPerson.cidade}"/>

                             <h:outputLabel for="email" value="E-mail: "/>
                             <h:inputText id="email"   value="#{PersonFaces.selectedPerson.email}"/>

                             <h:outputLabel for="itelefone" value="Tel. Residêncial "  />
                             <h:inputText id="itelefone"  size="14" value="#{PersonFaces.selectedPerson.telefone}"/>

                             <h:outputLabel for="telCel" value="Tel. Celular "  />
                             <h:inputText id="telCel"  size="14" value="#{PersonFaces.selectedPerson.celular}"/>

                             <h:outputLabel for="dataDeCadastro" value="Data do Cadastro: "></h:outputLabel>
                             <h:inputText id="dataDeCadastro" size="10" value="#{PersonFaces.selectedPerson.data_cadastro}" />

                             <h:outputLabel for="profissao" value="Profissão: "/>
                             <h:inputText id="profissao"  size="40" value="#{PersonFaces.selectedPerson.profissao}"/>
                         </h:panelGrid>
        </fieldset>
            <h:panelGrid columns="2">
                <h:commandButton value="Salvar" action="#{PersonFaces.UpdatePerson}">
                    <h:commandButton value="Voltar" action="#{UserFaces.BacktoMenu}" immediate="true" />    
                    <a4j:support event="onsubmit" reRender="PanelInputs"/>
                </h:commandButton>    
            </h:panelGrid>
        </h:form>
    </body>
  </f:view>
</html>
