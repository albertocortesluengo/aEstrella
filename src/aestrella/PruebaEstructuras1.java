package aestrella;

import java.util.Queue;
import java.util.Stack;

import estructurasdatos.Cola;
import estructurasdatos.Pila;

public class PruebaEstructuras1 {

	Pila pilaEnteros;
	Cola colaEnteros;
	Stack pilaEnterosNativa;
	Queue colaEnterosNativa;
	
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
		
		System.out.println("------------------ Pila ACL -------------------");
		
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
		

		// prueba cola
		
		System.out.println("\n------------------ Cola ACL -------------------");
		
		colaEnteros.put("2");
		colaEnteros.put("4");
		colaEnteros.put("5");
		colaEnteros.put("8");
		colaEnteros.put("10");
		colaEnteros.put("12");
		
		System.out.println("Tamaño--> "+colaEnteros.size());
		System.out.println("sacar--> "+colaEnteros.get());
		System.out.println("Tamaño--> "+colaEnteros.size());
		System.out.println("sacar--> "+colaEnteros.get());
		System.out.println("Tamaño--> "+colaEnteros.size());
		
		System.out.println("vacia? --> "+colaEnteros.vacia());
		
		System.out.println("primero--> "+colaEnteros.primero());
		System.out.println("Tamaño--> "+colaEnteros.size());
		
		System.out.println("sacar--> "+colaEnteros.get());
		System.out.println("Tamaño--> "+colaEnteros.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
