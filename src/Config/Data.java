package Config;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	Date dia = new Date(System.currentTimeMillis());
    String Formatador = new SimpleDateFormat("dd/MM/yyyy").format(dia);
	
public int ContadorDeData(){
	int Resultado = 0;
	return Resultado;
}

}
