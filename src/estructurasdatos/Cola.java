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
		  Nodo new_node = new Nodo(o);
		  if (nodoPrimero == null) {
			  nodoPrimero = new_node;
			  nodoFin = new_node;
		  } else {
			  nodoFin.siguienteNodo = new_node;
			  nodoFin = new_node;
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
