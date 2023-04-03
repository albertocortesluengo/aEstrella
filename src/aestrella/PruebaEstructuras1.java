package aestrella;

import estructurasdatos.Cola;
import estructurasdatos.Pila;

public class PruebaEstructuras1 {

	Pila pilaEnteros;
	Cola colaEnteros;
	
	public static void main(String[] args) {
		new PruebaEstructuras1();
	}

	public PruebaEstructuras1() {
		pilaEnteros = new Pila();
		colaEnteros = new Cola();
		operativa();
	}

	private void operativa() {
		
		// prueba pila
		
		System.out.println("------------------ Pila -------------------");
		
		pilaEnteros.push(2);
		pilaEnteros.push(4);
		pilaEnteros.push(5);
		pilaEnteros.push(8);
		pilaEnteros.push(10);
		pilaEnteros.push(12);
		
		System.out.println("Tamaño--> "+pilaEnteros.size());
		System.out.println("pop--> "+pilaEnteros.pop());
		System.out.println("Tamaño--> "+pilaEnteros.size());
		
		System.out.println("vacia? --> "+pilaEnteros.vacia());
		
		System.out.println("pop--> "+pilaEnteros.pop());
		System.out.println("Tamaño--> "+pilaEnteros.size());
		
		System.out.println("top--> "+pilaEnteros.top());
		System.out.println("Tamaño--> "+pilaEnteros.size());
		
		System.out.println("pop--> "+pilaEnteros.pop());
		System.out.println("Tamaño--> "+pilaEnteros.size());
		

		// prueba pila
		
		System.out.println("\n------------------ Cola -------------------");
		
	}
	
}
