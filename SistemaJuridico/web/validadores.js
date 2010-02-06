/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//validação de Data
function validaDat(campo,valor) {
	var date=valor;
	var ardt=new Array;
	var ExpReg=new RegExp("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}");
	ardt=date.split("/");
	erro=false;
	if ( date.search(ExpReg)==-1){
		erro = true;
		}
	else if (((ardt[1]==4)||(ardt[1]==6)||(ardt[1]==9)||(ardt[1]==11))&&(ardt[0]>30))
		erro = true;
	else if ( ardt[1]==2) {
		if ((ardt[0]>28)&&((ardt[2]%4)!=0))
			erro = true;
		if ((ardt[0]>29)&&((ardt[2]%4)==0))
			erro = true;
	}
	if (erro) {
		alert("\"" + valor + "\" não é uma data válida!!!");
		campo.focus();
		campo.value = "";
		return false;
	}
	return true;
}
//Validação para campos que só aceita números

function validar(e)
{
  var tecla;
  if (e.keyCode)  // IE
  {
    tecla = e.keyCode;
  }
  else if (e.which)  // Firefox
  {
    tecla = e.which;
  }
  else  // Sei lá! :P
  {
    return false;
  }
  if (tecla < 48 || tecla > 57)
  {
    return e.replace(/\D/g,"")
  }

    
}

//validação de e-mail

function checkmail(objeto){
		// executa a exp. regular
		var retorno=/^w+[+.w-]*@([w-]+.)*w+[w-]*.([a-z]{2,4}|d+)$/i.test(e.value);
		if (retorno==false){
			// se retorna falso o email é invalido
			alert("Email invalido");
			objeto.select();
		}
		return retorno;
	}