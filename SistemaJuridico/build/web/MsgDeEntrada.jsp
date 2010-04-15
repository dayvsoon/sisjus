<%-- 
    Document   : MsgDeEntrada
    Created on : 11/01/2010, 11:13:21
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
        <title>Bem vindo <h:outputText value="#{UserFaces.login}"/> </title>
        <style type="text/css">
            h6 { text-decoration: blink;
                 color: gray;
                 font-family: serif;
                 font-style: oblique;

            }

        </style>
    </head>
    <body>
        <h1 align="center">BEM VINDO <h:outputText value="#{UserFaces.login}"></h:outputText> AO SISJUS v0.1 </h1>
         <h5 align="center" style="color: gray; font-style: italic; line-height: 4;">Login Realizado com sucesso!</h5>
           <h6 align="center">Em alguns instantes você entrará no sistema...</h6>


    </body>
</html>
</f:view>
