<%-- 
    Document   : menu
    Created on : 22/01/2010, 15:21:13
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
        <meta http-equiv="refresh" content="30" >
        <title>SisMenu - Menu Principal do SisJus</title>
        <style>
            .pic {
                margin-bottom: -4px;
                margin-right: 2px;
            }
        </style>
        <script LANGUAGE="JavaScript">
            function showTimer() {
                var time=new Date();
                var hour=time.getHours();
                var minute=time.getMinutes();
                var second=time.getSeconds();
                if(hour<10)   hour  ="0"+hour;
                if(minute<10) minute="0"+minute;
                if(second<10) second="0"+second;
                var st=hour+":"+minute+":"+second;
                document.getElementById("timer").innerHTML=st;
            }
            function initTimer() {
                // O metodo nativo setInterval executa uma determinada funcao em um determinado tempo
                setInterval(showTimer,1000);
            }

        </script>

    </head>
    <f:view>
        <body onload="initTimer();">
            <h:form id="form1">

                <rich:toolBar>
                    <rich:dropDownMenu>
                        <f:facet name="label">
                            <h:panelGroup>
                                <h:graphicImage value="./images/file.png" styleClass="pic"/>
                                <h:outputText value="File"/>
                            </h:panelGroup>
                        </f:facet>
                        <rich:menuGroup value="Cadastro" icon="./images/cadastro.png">
                            <rich:menuItem submitMode="none" icon="./images/pessoa.png">
                                <h:commandLink action="#{PersonFaces.doAddPerson}" id="addpessoa" value="Pessoa"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/clientes.png">
                                <h:commandLink action="#{ClienteFaces.doAddCliente}" value="Cliente"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/funcionario.png">
                                <h:commandLink action="#{FuncionarioFaces.doAddEmployee}" value="Funcionário"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/usuario.png">
                                <h:commandLink action="#{UserFaces.doAddUser}" value="Usuário"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/layer.png">
                                <h:commandLink action="#{AdvogadoJuizFaces.doAddLayer}" value="Advogado"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/juiz.png">
                                <h:commandLink action="#{AdvogadoJuizFaces.doAddLayer}" value="Juiz"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/Newdoc.png">
                                <h:commandLink action="#{ProcessoFaces.doAddProcesso}" value="Processo"/>
                            </rich:menuItem>
                        </rich:menuGroup>
                        <rich:menuGroup value="Andamento Processo">
                            <rich:menuItem submitMode="none" icon="./images/Newdoc.png">
                                <h:commandLink action="#{andamentoProcessoFaces.doAddAndamento}" value="Andamento"/>
                            </rich:menuItem>
                        </rich:menuGroup>
                        <rich:menuGroup value="Ferramentas">
                            <rich:menuItem submitMode="none" icon="./images/config.png">
                                <h:commandLink  value="Configuração" action="#{Sistema.goConfig}"/>
                            </rich:menuItem>
                        </rich:menuGroup>
                        <rich:menuItem submitMode="none" >
                            <h:commandLink  value="Sair / Log Out" action="logout"/>
                        </rich:menuItem>
                    </rich:dropDownMenu>



                    <rich:dropDownMenu>
                        <f:facet name="label">
                            <h:panelGroup>
                                <h:graphicImage value="./images/viewmain.png" styleClass="pic"/>
                                <h:outputText value="View"/>
                            </h:panelGroup>
                        </f:facet>
                        <rich:menuGroup value="Visualizar" icon="./images/view.png">
                            <rich:menuItem submitMode="none" icon="./images/pessoa.png">
                                <h:commandLink action="#{PersonFaces.doUpdatePerson}" value="Pessoa"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/clientes.png">
                                <h:commandLink action="#{ClienteFaces.doUpdateClient}" value="Cliente"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/funcionario.png">
                                <h:commandLink action="#{FuncionarioFaces.doUpdateEmployee}" value="Funcionário"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/usuario.png">
                                <h:commandLink action="#{UserFaces.DoLinkedWithMenu}" value="Usuário"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/layer.png">
                                <h:commandLink action="#{AdvogadoJuizFaces.doUpdateLayer}" value="Advogado"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/juiz.png">
                                <h:commandLink action="#{AdvogadoJuizFaces.doUpdateLayer}" value="Juiz"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/Newdoc.png">
                                <h:commandLink action="#{ProcessoFaces.doUpdateProcess}" value="Processo"/>
                            </rich:menuItem>
                        </rich:menuGroup>
                    </rich:dropDownMenu>
                    <rich:dropDownMenu>
                        <f:facet name="label">
                            <h:panelGroup>
                                <h:graphicImage value="./images/protocol.png" styleClass="pic"/>
                                <h:outputText value="Protocolo"/>
                            </h:panelGroup>
                        </f:facet>
                        <rich:menuGroup value="Ação"  icon="./images/acao.png">
                            <rich:menuItem submitMode="none" icon="./images/protocolo.png">
                                <h:commandLink action="#{ProtocoloFaces.doAddProtocolo}" value="Cadastrar"/>
                            </rich:menuItem>
                            <rich:menuItem submitMode="none" icon="./images/tramite.png">
                                <h:commandLink value="Ver Trâmite"/>
                            </rich:menuItem>
                        </rich:menuGroup>
                    </rich:dropDownMenu>
                    <rich:dropDownMenu>
                        <f:facet name="label">
                            <h:panelGroup>
                                <h:graphicImage value="./images/protocol.png" styleClass="pic"/>
                                <h:outputText value="E-mail"/>
                            </h:panelGroup>
                        </f:facet>
                            <rich:menuItem submitMode="none" icon="./images/toemail.png">
                                <h:commandLink  value="Enviar"/>
                            </rich:menuItem>
                    </rich:dropDownMenu>
                    <rich:dropDownMenu>
                        <f:facet name="label">
                            <h:panelGroup>
                                <h:outputText value="Ajuda"/>
                            </h:panelGroup>
                        </f:facet>
                        <rich:menuItem submitMode="none">
                        <h:commandLink  value="Sobre" action="#{Sistema.goAbout()}"/>
                        </rich:menuItem>
                    </rich:dropDownMenu>
                </rich:toolBar>
                <br/>
                <h4>Sisjus versão <h:outputText id="Version" value="#{Sistema.version}" /> </h4>
                <h5>  <h:outputText value="#{UserFaces.login}, agora são: " style="font-size: 10pt; text-align: left ; padding-left: 1px; padding-bottom: 2em "/>, <span style="font-size: 9pt; text-align: left" id="timer">Relógio</span> , <h:commandLink style="font-size: 9pt; text-align: left" value="Sing Out"/>    </h5>
                <rich:hotKey key="alt+p" handler="rich:component('addpessoa')}.show()" /> 
            </h:form>
        </body>
    </f:view>
</html>
