/**
 * 
 */
package br.edu.ufam.algo;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
		private Queue<String> fila = new LinkedList<String>();
		
		public void enfileirar (String nome) {
			this.fila.add(nome);
		}
		
		public void filaVazia() {
			if (fila.isEmpty()) {
	            System.out.println("Fila está vazia");
	        } else {
	            System.out.println("\nFila não está vazia");
	        }
		}
		public void primeiroFila() {
		 System.out.println("\tPrimeiro: " + ((LinkedList<String>) fila).getFirst());
		}
		
		public void ultimoFila() {
			 System.out.println("\tUltimo: " + ((LinkedList<String>) fila).getLast());
		}
		
	    public void mostra(){
	    	System.out.println("\nNa fila:");
	    	for(String nome: fila) {
	    		System.out.println( ""+ nome);
	    	}
	    }
	    
	    public void removeFila (){
	    	this.fila.poll();
	  }
		
}
