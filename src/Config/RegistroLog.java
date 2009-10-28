package Config;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


public class RegistroLog {

	public static boolean LOG_ATIVO = false;

	public static final void Liga(){
		LOG_ATIVO = true;
	}
	public static final void Desliga(){
		LOG_ATIVO = false;
	}
	public static boolean estaLigado(){
		return LOG_ATIVO;
	}
	
	public static void info(String msg){ 
	 try{  
	     boolean adiciona = true;

         FileHandler handler = new FileHandler("SisJus.txt",adiciona);
         Logger logger = Logger.getLogger("Cadastro");
         logger.addHandler(handler);
         logger.info(msg);
    
        }catch (IOException e) {
	        e.printStackTrace();
            }    

       }
	public static final void Message(String war) {
		if (LOG_ATIVO == true)
			System.out.println("SisJus Adverte : " + war);
	}
	public static void Warning(String war, Exception e){
		System.out.println("SisJus Adverte: "+ war + "|" + e.getMessage() + "|");
	}
	public static final void Warning(String war) {
		System.out.println("Sisjus Adverte : " + war);
	}
	
}




