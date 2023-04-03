package estructurasdatos;

public class Pila {

	  class Nodo {
		  Object elemento;
		  Nodo siguienteNodo;

		  public Nodo(Object o) {
			  elemento = o;
			  siguienteNodo = null;
		  }
	  }

	  Nodo nodoFin;
	  int size;

	  public Pila() {
		  nodoFin = null;
		  size = 0;
	  }

	  public void push(Object o) {
		  Nodo nuevoNodo = new Nodo(o);
		  if (nodoFin == null)
		    nodoFin = nuevoNodo;
		  else {
		    nuevoNodo.siguienteNodo = nodoFin;
		    nodoFin = nuevoNodo;
		  }
		    size++;
	  }

	  public Object pop() {
		  if (nodoFin == null) return null;
		  Object o = nodoFin.elemento;
		  nodoFin = nodoFin.siguienteNodo;
		  size--;
		  return o;
	  }

	  public boolean vacia() {
		  return (size == 0);
	  }

	  public int size() {
		  return size;
	  }

	  public Object top() {
		  if (nodoFin == null) {
			  return null;
		  } else {
			  return nodoFin.elemento;
		  }
	  }
}



















