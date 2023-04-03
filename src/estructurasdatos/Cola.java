package estructurasdatos;


public class Cola {

	class Nodo {
		  Object elemento;
		  Nodo siguienteNodo;

		  public Nodo(Object o) {
			  elemento = o;
			  siguienteNodo = null;
		  }
	  }

	  Nodo nodoPrimero;
	  Nodo nodoFin;
	  int size;

	  public Cola() {
		  nodoFin = null;
		  size = 0;
	  }

	  public void put(Object o) {
		  Nodo nuevoNodo = new Nodo(o);
		  if (nodoPrimero == null) {
			  nodoPrimero = nuevoNodo;
			  nodoFin = nuevoNodo;
		  } else {
			  nodoFin.siguienteNodo = nuevoNodo;
			  nodoFin = nuevoNodo;
		  }
		  size++;
	  }

	  public Object get() {
		  if (nodoPrimero == null) return null;
		  Object o = nodoPrimero.elemento;
		  nodoPrimero = nodoPrimero.siguienteNodo;
		  size--;
		  return o;
	  }

	  public boolean vacia() {
		  return (size == 0);
	  }

	  public int size() {
		  return size;
	  }

	  public Object primero() {
		  if (nodoPrimero == null) {
			  return null;
		  } else {
			  return nodoPrimero.elemento;
		  }
	  }
}
