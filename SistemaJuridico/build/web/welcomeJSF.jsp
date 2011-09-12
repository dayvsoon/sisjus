<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich" %>
<%@taglib prefix="a4j" uri="http://richfaces.org/a4j" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Bem vindo ao SisJus</title>
            <style type="text/css">

                body {
                    margin: 0;
                    background-color: #e7e7e7;
                    padding-top: 200px;
                    position: relative;
                }
                .button {
                    border: 1px solid #1C1A74;
                    background: #B4C6DC;
                }
                .tituloSistema{
                    color: #ffffff;
                    font-weight: bold;
                    font-size: 30px;
                }
                .verSistema{
                    color: #ffffff;
                }
                .mensagemErro{
                    color: #ff0000;
                }
                .tabelaCentral{
                    border: 0;
                    width: 760px;
                    height: 100%;
                    vertical-align: middle;
                }
                .celulaSuperior{
                    background-color: lightgreen;
                    border-style: solid;
                    border-width: 3px 3px 0px 3px;
                    border-color: #ffffff;
                    padding-right: 10px;
                    color: #ffffff;
                }

                .celulaSuperiorSemBorda{
                    background-color: #34669B;
                    border-style: solid;
                    border-width: 0px 0px 0px 0px;
                    border-color: #ffffff;
                    padding-right: 10px;
                    color: #ffffff;
                }

                .celulaCentralAzul{
                    color: #1C1A74;
                    font-weight: bold;
                    background-color: #B4C6DC;
                    border-style: solid;
                    border-width: 0px 3px 0px 3px;
                    border-color: #ffffff;
                }

                .celulaCentralAzulSemBorda{
                    color: #1C1A74;
                    font-weight: bold;
                    background-color: #B4C6DC;
                    border-style: none;
                }

                .celulaCentralCinzaDireita{
                    text-align: right;
                    font-weight: bold;
                    border-style: solid;
                    border-width: 0px 0px 0px 3px;
                    border-color: #ffffff;
                    background-color: #D2D2D2;
                }
                .celulaCentralCinzaEsquerda{
                    border-style: solid;
                    border-width: 0px 3px 0px 0px;
                    border-color: #ffffff;
                    background-color: #D2D2D2;
                }
                .celulaInferior{
                    text-align: center;
                    background-color: lightgreen;
                    border-style: solid;
                    border-width: 0px 3px 3px 3px;
                    border-color: #ffffff;
                    font-weight: bold;
                    color: #ffffff;
                }

                .celulaInferiorSemBorda{
                    text-align: center;
                    background-color: #34669B;
                    border-style: none;
                    font-weight: bold;
                    color: #ffffff;
                }

                .tabelaTeste{
                    position: absolute;
                    bottom: 0px;
                    width: 100%;
                    height: 30px;
                }

                .linha1{
                    background-color: gray;
                }

                .linha2{
                    background-color: #FFFFFF;
                }
                .Cadastro{
                    text-align: center;
                    color: gray;
                    border: 0px solid #1C1A74;
                    font-weight: bold;
                }


            </style>

        </head>

        <body>
            <table align="center"  cellspacing="0" cellpadding="0" class="tabelaCentral">
                <tr height="100%">
                    <td>
                        <h:form>
                            <table width="60%" border="0" cellspacing="0" cellpadding="0" align="center">
                                <tr height="80px">
                                    <td align="right" colspan="2" class="celulaSuperior">
                                        <span class="tituloSistema">
                                            &nbsp;<h:outputText value="#{Sistema.siglaDoSistema}"/>
                                        </span><br/>
                                        <span class="verSistema"><h:outputText id="SiglaVersao" value="Ver. "/><h:outputText id="VersãoDoSistema" value="#{Sistema.version}" /></span>
                                    </td>
                                </tr>
                                <tr height="30px">
                                    <td colspan="2" align="center" class="celulaCentralAzul"><h:outputText id="MsgBemVindo" value="Bem-Vindo. Identifique o usuário"/></td>
                                </tr>
                                <tr height="30px">
                                    <td class="celulaCentralCinzaDireita"><span class="mensagemErro">*</span><h:outputText id="usuario" value="Usuário: "/></td>
                                    <td class="celulaCentralCinzaEsquerda"><h:inputText value="#{UserFaces.login}" onfocus="if (this.value == 'Usuário') { this.value = '';}" onblur="if (this.value == 'Usuário') { this.value = '';}" onkeypress="this.style.backgroundColor='lightgreen'" onkeydown="this.style.backgroundColor='white'" required="true" id="userID" requiredMessage="Usuário tem que ser informado!" />
                                        <br><h:message for="userID" styleClass="mensagemErro"/>
                                    </td>
                                </tr>
                                <tr height="30px">
                                    <td class="celulaCentralCinzaDireita"><span class="mensagemErro">*</span>Senha:&nbsp;</td>
                                    <td class="celulaCentralCinzaEsquerda"><h:inputSecret onkeypress="this.style.backgroundColor='lightgreen'" onkeydown="this.style.backgroundColor='white'" value="#{UserFaces.password}" required="true" id="passwordID"
                                                   requiredMessage="Senha tem que ser informada!"/>&nbsp;
                                        <br><h:message for="passwordID" styleClass="mensagemErro"/>
                                    </td>
                                </tr>
                                <tr height="50px">
                                    <td class="celulaCentralCinzaDireita">&nbsp;</td>
                                    <td class="celulaCentralCinzaEsquerda">
                                        <h:commandButton styleClass="button" value="Acessar" action="#{UserFaces.doAutenthicLogin}" />&nbsp;
                                        <h:messages globalOnly="true" styleClass="mensagemErro"/>
                                        <h:commandButton styleClass="button" value="Cadastrar" action="#{UserFaces.doAddUser}" immediate="true"></h:commandButton>&nbsp;

                                        </td>
                                    </tr>                                                       
                                    <tr height="30px">
                                        <td colspan="2" class="celulaInferior">Desenvolvido por <h:outputText value="#{Sistema.autor}"/></td>
                                </tr>
                            </table>
                        </h:form>
                    </td>
                </tr>
            </table>
        </body>
    </html>
</f:view>
