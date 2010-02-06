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
        <title>JSP Page</title>
    </head>
    <f:view>
    <body>
        <h:form id="form1">
            <rich:toolBar>
                <rich:dropDownMenu>
                    <f:facet name="label">
                        <h:panelGroup>
                        <h:outputText value="File"/>
                        </h:panelGroup>
                    </f:facet>
                    <rich:menuGroup value="Cadastro">
                        <rich:menuItem submitMode="none" value="Pessoa">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Cliente">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Funcionário">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Usuário">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Advogado">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Juiz">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Processo">
                        </rich:menuItem>
                    </rich:menuGroup>
                </rich:dropDownMenu>

                <rich:dropDownMenu>
                    <f:facet name="label">
                        <h:panelGroup>
                        <h:outputText value="Search"/>
                        </h:panelGroup>
                    </f:facet>
                    <rich:menuGroup value="Buscar">
                        <rich:menuItem submitMode="none" value="Pessoa">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Cliente">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Funcionário">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Usuário">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Advogado">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Juiz">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Processo">
                        </rich:menuItem>
                    </rich:menuGroup>
                </rich:dropDownMenu>
           
            <rich:dropDownMenu>
                    <f:facet name="label">
                        <h:panelGroup>
                        <h:outputText value="View"/>
                        </h:panelGroup>
                    </f:facet>
                    <rich:menuGroup value="Visualizar">
                        <rich:menuItem submitMode="none" value="Pessoa">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Cliente">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Funcionário">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Usuário">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Advogado">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Juiz">
                        </rich:menuItem>
                        <rich:menuItem submitMode="none" value="Processo">
                        </rich:menuItem>
                    </rich:menuGroup>
                </rich:dropDownMenu>
            </rich:toolBar>
        </h:form>
    </body>
    </f:view>
</html>
