/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Formatador de Data
function Formatadata(Campo, teclapres)
			{
				var tecla = teclapres.keyCode;
				var vr = new String(Campo.value);
				vr = vr.replace("/", "");
				vr = vr.replace("/", "");
				vr = vr.replace("/", "");
				tam = vr.length + 1;
				if (tecla != 8 && tecla != 8)
				{
				   if (tam > 0 && tam < 2)
					Campo.value = vr.substr(0, 2) ;
				   if (tam > 2 && tam < 4)
					Campo.value = vr.substr(0, 2) + '/' + vr.substr(2, 2);
				   if (tam > 4 && tam < 7)
					Campo.value = vr.substr(0, 2) + '/' + vr.substr(2, 2) + '/' + vr.substr(4,7);
				}
			}
//Formatador de CEP

function MascaraCEP(campo, teclaPress) {
  if (window.event){
    var tecla = teclaPress.keyCode;
  } else {
    tecla = teclaPress.which;
  }
  var s = new String(campo.value);
  s = s.replace(/(\.|\(|\)|\/|\-| )+/g,'');
  tam = s.length + 1;
  if (tam > 5 && tam < 7)
    campo.value = s.substr(0,5) + '-' + s.substr(5, tam);
}

//Formatador do número de Telefone

function mascara_telefone() {
if(document.form.telefone.value.length == 2) {
document.form.telefone.value += ' ';
}
if(document.form.telefone.value.length == 7) {
document.form.telefone.value += '-';
}
}
function formatTelefone(element, e){
  if (e.keyCode != 8){
    length = element.value.length;
    if (length == 2){
      if (element.value.charAt(0)!="(")
        element.value = "(" + element.value + ")";
    }
    if (length == 3)
      if (element.value.charAt(0)=="(")
        element.value += ")";
    if (length == 8)
      element.value += "-";
  }
}

function MascaraTelefone(tel){
    if(mascaraInteiro(tel)==false){
        event.returnValue = false;
    }
    return formataCampo(tel, '(00) 0000-0000', event);
}

function Telefone(campo,tipo){
    var aplicamask = campo.value;
    var tam_campo;
    switch (tipo){
 case 1:  //Aplica máscara de Data
  tam_campo = 10
  aplicamask = aplicamask.replace(/\D/g,"");
  aplicamask = aplicamask.replace(/(\d{2})/,"$1/");
  aplicamask = aplicamask.replace(/(\/{1}\d{2})/,"$1/");
  aplicamask = aplicamask.length > tam_campo ? aplicamask.substring(0,tam_campo) : aplicamask;
  break;
 case 2:  //Aplica máscada de CPF
  tam_campo = 14
  aplicamask = aplicamask.replace(/\D/g,"");
  aplicamask = aplicamask.replace(/(\d{3})/,"$1.");
  aplicamask = aplicamask.replace(/([.]\d{3})/,"$1.");
  aplicamask = aplicamask.replace(/(\d{3}[.]\d{3}[.]\d{3})/,"$1-");
  aplicamask = aplicamask.length > tam_campo ? aplicamask.substring(0,tam_campo) : aplicamask;
  break;
 case 3:  // Aplica máscara de CNPJ
  tam_campo = 18
  aplicamask = aplicamask.replace(/\D/g,"");
  aplicamask = aplicamask.replace(/(\d{2})/,"$1.");
  aplicamask = aplicamask.replace(/([.]\d{3})/g,"$1.");
  aplicamask = aplicamask.replace(/(\d{3}[.]\d{3})/,"$1/");
  aplicamask = aplicamask.replace(/(\/\d{4})/,"$1-");
  aplicamask = aplicamask.length > tam_campo ? aplicamask.substring(0,tam_campo) : aplicamask;
  break;
 case 4:  // Aplica máscara para TELEFONE
  tam_campo = 13
  aplicamask = aplicamask.replace(/\D/g,"");
  aplicamask = aplicamask.replace(/(\w{1})/,"($1");
  aplicamask = aplicamask.replace(/[(][0]/,"(");
  aplicamask = aplicamask.replace(/([(]\d{2})/,"$1)");
  aplicamask = aplicamask.replace(/([)]\d{4})/,"$1-");
  aplicamask = aplicamask.length > tam_campo ? aplicamask.substring(0,tam_campo) : aplicamask;
  break;
 default:
  alert("Tipo Inválido");
  break;
 }
 campo.value = aplicamask;
}
// Máscara para CPF
function MascaraCPF(cpf,evento){
        if(mascaraInteiro(evento)==false){
                return false;
        }
        return formataCampo(cpf, '000.000.000-00', evento);
}
function FormataCpf(campo, teclapres)
			{
				var tecla = teclapres.keyCode;
				var vr = new String(campo.value);
				vr = vr.replace(".", "");
				vr = vr.replace("/", "");
				vr = vr.replace("-", "");
				tam = vr.length + 1;
				if (tecla != 14)
				{
					if (tam == 4)
						campo.value = vr.substr(0, 3) + '.';
					if (tam == 7)
						campo.value = vr.substr(0, 3) + '.' + vr.substr(3, 6) + '.';
					if (tam == 11)
						campo.value = vr.substr(0, 3) + '.' + vr.substr(3, 3) + '.' + vr.substr(7, 3) + '-' + vr.substr(11, 2);
				}
			}

