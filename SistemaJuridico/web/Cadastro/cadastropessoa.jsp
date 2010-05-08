<%-- 
    Document   : cadastropessoa
    Created on : 15/01/2010, 10:28:40
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich" %>
<%@taglib prefix="a4j" uri="http://richfaces.org/a4j" %>
<%@ taglib uri="http://stella.caelum.com.br/faces" prefix="stella"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../Formatadores.js" type="text/javascript"></script>
        <script src="../validadores.js" type="text/javascript"></script>
        
        <title>SisJus - Cadastro de Pessoa</title>
    </head>
<body style="background-color: #e7e7e7">
        <f:view>
        <h:form>
		 <fieldset>
	        <legend>Cadastro de Pessoa</legend>
				<h:panelGrid columns="2">
                                  

                                    <h:outputLabel for="nomepessoa" value="Nome: "/>
                                    <h:inputText id="nomepessoa" size="50" value="#{PersonFaces.selectedPerson.nome}"/>

                                    <h:outputLabel for="sobrenome" value="Sobrenome:"/>
                                    <h:inputText id="sobrenome" size="40" value="#{PersonFaces.selectedPerson.sobrenome}"/>

                                    <h:outputLabel for="sexo" value="Sexo: "/>
                                    <h:selectOneRadio value="#{PersonFaces.selectedPerson.sexo}">
                                        <f:selectItem itemLabel="Masculino" itemValue="M"/>
                                        <f:selectItem itemLabel="Feminino" itemValue="F"/>
                                    </h:selectOneRadio>

                                    <h:outputLabel for="rgpessoa" value="RG: "/>
                                    <h:inputText id="rgpessoa" size="14" value="#{PersonFaces.selectedPerson.identidade}"/>


                                    <h:outputLabel for="txtDate" value="Data de nascimento: "/>
                                    <h:inputText validatorMessage="Data de nascimento com formato inválido!"id="txtDate" size="10" maxlength="10" onkeydown="return validar(event)" onblur="validaDat(this,this.value)"  onkeyup="Formatadata(this,event)" value="#{PersonFaces.selectedPerson.data_nasc}" >
					
	     			    </h:inputText>

                                    <h:outputLabel for="endereco" value="Endereço: "/>
                                    <h:inputText id="endereco" size="40" value="#{PersonFaces.selectedPerson.endereco}"/>

                                    <h:outputLabel for="bairro" value="Bairro: "/>
                                    <h:inputText id="bairro" size="14" value="#{PersonFaces.selectedPerson.bairro}"/>

                                    <h:outputLabel for="cep" value="C.E.P.:"/>
                                    <h:inputText id="cep" value="#{PersonFaces.selectedPerson.cep}"  onkeydown="MascaraCEP(this, event);" onkeyup="return validar(event)" size="14" maxlength="9"/>

                                    <h:outputLabel for="uf" value="UF: "/>
                                    <h:inputText id="uf" size="3" maxlength="2"value="#{PersonFaces.selectedPerson.uf}"/>

                                    <h:outputLabel for="cidade" value="Cidade: "/>
                                    <h:inputText  id="cidade" value="#{PersonFaces.selectedPerson.cidade}"/>

                                    <h:outputLabel for="email" value="E-mail: "/>
                                    <h:inputText id="email" onblur="javascript:checkmail(this)" value="#{PersonFaces.selectedPerson.email}"/>

                                    <h:outputLabel for="itelefone" value="Tel. Residêncial "  />
                                    <h:inputText id="itelefone" size="14" onkeyup="Telefone(this,4)" onkeypress="return validar(event)" value="#{PersonFaces.selectedPerson.telefone}"/>

                                    <h:outputLabel for="telCel" value="Tel. Celular "  />
                                    <h:inputText id="telCel" size="14" onkeyup="Telefone(this,4)" onkeypress="return validar(event)" value="#{PersonFaces.selectedPerson.celular}"/>

                                    <h:outputLabel for="dataDeCadastro" value="Data do Cadastro: "></h:outputLabel>
                                    <h:inputText id="dataDeCadastro" size="10" value="#{Usuario.dataDeCadastro}" readonly="true"/>

                                    <h:outputLabel for="profissao" value="Profissão: "/>
                                    <h:inputText id="profissao" size="40" value="#{PersonFaces.selectedPerson.profissao}"/>

                                    <h:commandButton value="Salvar" action="#{PersonFaces.FinishedPerson}" />
                                    <h:commandButton value="Voltar" action="#{UserFaces.BacktoMenu}" />
		    	</h:panelGrid>
		    </fieldset>
	</h:form>
        </f:view>
    </body>
</html>
