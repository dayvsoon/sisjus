package Config;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	 Date dia = new Date(System.currentTimeMillis());
    public  String Formatador = new SimpleDateFormat("dd/MM/yyyy").format(dia);
	 Date diaFim = new Date(System.currentTimeMillis());
	 public  String Formatador2 = new SimpleDateFormat("dd/MM/yyyy").format(diaFim);

	 public int ContadorDeData(){
	int Resultado = 0;
	Resultado = diaFim.compareTo(dia);
	return Resultado;
}

}
