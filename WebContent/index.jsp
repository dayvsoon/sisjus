<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
    <%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<f:view>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><h:outputText value="Bem vindo ao " /><h:outputText value="#{configuracao.nomeDoSistema}" /><h:outputText value=" - Todo direito reservado a " /><h:outputText value="#{configuracao.autor}" />   </title>
<style type="text/css">
{
	font-family: Verdana, Tahoma;
	font-size: 12px;
}
body { 
  margin: 0;
  background-color: #e7e7e7;
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
    										&nbsp;<h:outputText value="#{configuracao.sigla}"/>    										
    									</span><br/>
    									<span class="verSistema">&nbsp;Ver. <h:outputText value="#{configuracao.versao}"/></span>    								
    							</td>
  							</tr>
  							<tr height="30px">
    							<td colspan="2" align="center" class="celulaCentralAzul">Bem-Vindo. Identifique o usuário</td>
  							</tr>
  							<tr height="30px">
    							<td class="celulaCentralCinzaDireita"><span class="mensagemErro">*</span>Usuário:&nbsp;</td>
    							<td class="celulaCentralCinzaEsquerda"><h:inputText value="#{sJuser.loggin}" onkeypress="this.style.backgroundColor='lightgreen'" onkeydown="this.style.backgroundColor='white'" required="true" id="userID"    									
    									requiredMessage="Usuário tem que ser informado!" />&nbsp;
    									<h:message for="userID" styleClass="mensagemErro"/>
    							</td>    							 							
  							</tr>
  							<tr height="30px">
    							<td class="celulaCentralCinzaDireita"><span class="mensagemErro">*</span>Senha:&nbsp;</td>
    							<td class="celulaCentralCinzaEsquerda"><h:inputSecret onkeypress="this.style.backgroundColor='lightgreen'" onkeydown="this.style.backgroundColor='white'" value="#{sJuser.password}" required="true" id="passwordID" 
    									requiredMessage="Senha tem que ser informada!"/>&nbsp;
    								<h:message for="passwordID" styleClass="mensagemErro"/>
    							</td>    							
  							</tr>
  							<tr height="50px">
    							<td class="celulaCentralCinzaDireita">&nbsp;</td>
    							<td class="celulaCentralCinzaEsquerda">
    								<h:commandButton styleClass="button" value="Acessar" />&nbsp;
    								<h:messages globalOnly="true" styleClass="mensagemErro"/>
    							</td>
  							</tr>
  							<tr >
  							<td class="celulaInferior"><h:outputText value="Cadastrar"></h:outputText></td>
  							<td class="celulaCentralCinzaEsquerda">&nbsp;</td>
  							</tr>
  							<tr height="30px">
    							<td colspan="2" class="celulaInferior">Desenvolvido por <h:outputText value="#{configuracao.autor}"/></td>
  							</tr>  							
      					</table>
      				</h:form> 
      			</td>
    		</tr>    		    		    
  		</table> 
</body>
</f:view>
</html>