/**
 * 
 */
package br.edu.ufam.algo;

import java.util.Stack;

public class Pilha {
		private Stack<String> pilha = new Stack<String>();
		 
		public void pilhaVazia(){
			if (pilha.isEmpty()) {
	            System.out.println("Pilha vazia");
	        } else {
	            System.out.println("Pilha não está vazia");
	        }
		}
        
		public void inserePi (String nome){
			this.pilha.push(nome);
		}
		
		public void mostraPi () {
			System.out.println("\nNa Pilha:");
			for(String nome: pilha) {
	    		System.out.println( ""+ nome);
	    	}
		}
		
		public void remove () {
			this.pilha.pop();
		}
		
		public void desempilhaPilha () {
			System.out.println("Topo da Pilha "+ pilha.peek());
		}
		
}