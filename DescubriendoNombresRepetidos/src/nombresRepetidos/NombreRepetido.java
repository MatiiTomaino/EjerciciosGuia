package nombresRepetidos;
import java.util.*;

public class NombreRepetido {

private String nombre;
private int cantRepetido;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCantRepetido() {
	return cantRepetido;
}
public void setCantRepetido(int cantRepetido) {
	this.cantRepetido = cantRepetido;
}
@Override
public String toString() {
	return "NombreRepetido [nombre=" + nombre + ", cantRepetido=" + cantRepetido + "]";
}

void eliminarRepetidos(ArrayList<NombreRepetido> nomRep)
{
	
}

}
