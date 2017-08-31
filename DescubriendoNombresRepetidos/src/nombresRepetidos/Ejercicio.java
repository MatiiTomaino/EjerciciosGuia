package nombresRepetidos;

import java.io.FileNotFoundException;

public class Ejercicio {

	public static void main(String[] args) throws FileNotFoundException {
    Archivo archivo = new Archivo();
    int cantAMostrar, cantNom;
    NombreRepetido nombreRepetido = new NombreRepetido();
    
    archivo.abrirArchivo("nombres.in");
    cantNom = archivo.leerCantidadNombres();
    cantAMostrar = archivo.leerCantidadAMostrar();
   for (int i = 0; i < 26; i++) {
	
    	nombreRepetido.setNombre(archivo.leerSiguiente());
    	System.out.println(nombreRepetido.getNombre());
    }
    
    System.out.println(cantAMostrar);
    System.out.println(cantNom);
    
	}

}
