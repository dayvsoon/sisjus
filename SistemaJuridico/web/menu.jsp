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
    </head>
    <f:view>
    <body>
        <h:form id="form1">
            
            <h:outputText value="#{UserFaces.login}" style="font-size: 6pt; text-align: right ; padding-left: 1330px "/>, <h:commandLink style="font-size: 6pt; text-align: right" value="Sing Out"/>
       
            <hr style="color: blue ">
            <rich:toolBar>
                <rich:dropDownMenu>
                    <f:facet name="label">
                        <h:panelGroup>
                        <h:graphicImage value="./images/file.png" styleClass="pic"/>
                        <h:outputText value="File"/>
                        </h:panelGroup>
                    </f:facet>
                    <rich:menuGroup value="Cadastro" icon="./images/cadastro.png">
                        <rich:menuItem submitMode="none"icon="./images/pessoa.png">
                            <h:commandLink action="#{PersonFaces.doAddPerson}" value="Pessoa"/>
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" icon="./images/clientes.png">
                            <h:commandLink action="#{ClienteFaces.doAddCliente}" value="Cliente"/>
                        </rich:menuItem>
                        <rich:menuItem submitMode="none"icon="./images/funcionario.png">
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
                </rich:dropDownMenu>

                <rich:dropDownMenu>
                    <f:facet name="label">
                        <h:panelGroup>
                        <h:graphicImage value="./images/search.png" styleClass="pic"/>
                        <h:outputText value="Search"/>
                        </h:panelGroup>
                    </f:facet>
                    <rich:menuGroup value="Buscar" icon="./images/busca.png">
                        <rich:menuItem submitMode="none" icon="./images/pessoa.png">
                            <h:commandLink action="#{PersonFaces.DoSearch}" value="Pessoa"/>
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Cliente" icon="./images/clientes.png">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Funcionário" icon="./images/funcionario.png">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Usuário" icon="./images/usuario.png">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Advogado" icon="./images/layer.png">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Juiz" icon="./images/juiz.png">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Processo" icon="./images/Newdoc.png">
                        </rich:menuItem>
                    </rich:menuGroup>
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
                            <h:commandLink action="#{FuncionarioFaces.doUpdateLayer}" value="Funcionário"/>
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
                    </rich:menuGroup>
                </rich:dropDownMenu>
            </rich:toolBar>

            <h4>Testando a nova página inicial</h4>
        </h:form>
    </body>
    </f:view>
</html>
