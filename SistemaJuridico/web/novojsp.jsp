<%-- 
    Document   : novojsp
    Created on : 20/01/2010, 13:46:24
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
        <title>JSP Page</title>
    </head>
    <body bgcolor="lightgreen">
        <h:form>
            <fieldset  style="border-style: outset;width: 200px; background-color: silver; height: 200px;">
                <h:graphicImage url="./images/bgbox.png">
                <legend>Configurações do twitter</legend>
             <div id="promocao2"  style="display: block; width: 228px;" >
                 <div style="margin: 0pt; padding: 0pt;" align="center">
                     <br>
                     <h:outputLabel for="Twitter" value="Login: "/>
                     <h:inputText id="Twitter" value="#{AcessoTwitter.user}"/>
                      <h:outputLabel for="SenhaTwitter" value="Senha: "/>
                     <h:inputSecret id="SenhaTwitter" value="#{AcessoTwitter.password}"/>
                <p>
                </h:graphicImage>
                  

             </div>
             </div>
        </fieldset>
        </h:form>
    </body>
    </f:view>
</html>
