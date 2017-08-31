package nombresRepetidos;
import java.util.*;
import java.io.*;

public class Archivo {

private Scanner sc;

public Scanner getSc() {
	return sc;
}

public void setSc(Scanner sc) {
	this.sc = sc;
}


void abrirArchivo(String path) throws FileNotFoundException
{
  this.setSc(new Scanner(new File(path)));
}


int leerCantidadNombres()
{
	return this.getSc().nextInt();
     
}

int leerCantidadAMostrar()
{
	
	return this.getSc().nextInt();
}

String leerSiguiente()
{ 
	
   if( sc.hasNext())
       return this.getSc().next();
   else
   {  
	   sc.close();
	   System.out.println("No Hay Mas Elementos.");
	   return "";
	   
   }
}

void escribirArchivo(String path, ArrayList<NombreRepetido> nomRep)
{
	

}

}
