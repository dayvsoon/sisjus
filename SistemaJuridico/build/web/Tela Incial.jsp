<%-- 
    Document   : Tela Incial
    Created on : 30/12/2009, 12:23:36
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
        <title>Bem Vindo </title>
        <link href="../status.css" rel="stylesheet" type="text/css"/>
        
    </head>
    
    <body style="background-color: #e7e7e7">         
        <h:form>

            <div class="topo">
              

                    
                <h:outputText  value="Olá #{UserFaces.login}, você tem "></h:outputText>
               
                
            </div>
                    <rich:panel header="Primeiro" styleClass="linha">
                        <f:facet name="header">
                            Primeiro<
                            </f:facet>
                    oiiii
                    </rich:panel>
                    <rich:panel styleClass="linha2" header="Segundo">
                        Segundo
                    </rich:panel>
                    <rich:panel styleClass="linha3" header="Terceira">
                    Exemplo 3
                    </rich:panel>

                    <rich:panel styleClass="linha4" header="Quarto">
                        Exemplo 4
                    </rich:panel>

                        <rich:panel styleClass="linha5" header="Quinto">
                            Exemplo 5

                        </rich:panel>

                            <rich:panel styleClass="linha6" header="Sexto">
                                Exemplo 6
                            </rich:panel>

                                <rich:panel styleClass="linha7" header="Sétimo">
                               Exemplo 7

                            </rich:panel>

                               <rich:panel styleClass="linha8" header="Processos Finalizados">
                                   <h:selectOneMenu>
                                   <f:selectItems value="#{ProcessoFaces.listOfProcessFinally}"/>                                    </h:selectOneMenu>
                               </rich:panel>
                                   <rich:panel styleClass="linha9" header="Nono">
                                       Exemplo 9
                                   </rich:panel>
                                       <br>
                                       <p class="texto"> Sisjus - Sistema De Organização de Processos Jurídicos - Todos os direitos reservados </p>
        </h:form>
    </body>
</html>
</f:view>