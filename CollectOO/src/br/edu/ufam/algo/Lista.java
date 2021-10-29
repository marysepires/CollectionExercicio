package br.edu.ufam.algo;

import java.util.ArrayList;
import java.util.Collection;

public class Lista {
		private Collection<String> lista = new ArrayList<>();
		
		public void insereLis (String valor) {
			this.lista.add(valor);
			
		}
	    public void mostra(){
	    	System.out.println("\nLista:");
	    	for(String valor: lista) {
	    		System.out.println( ""+ valor);
	    	}
	    }
		
	    public void removeLista (String valor) {
	    	if (this.lista.contains(valor)) {
	    	this.lista.remove(valor);
	    	System.out.println("\nRemovido");
	    }else {
	    	System.out.println("Erro ao Remover");
	    }
	  }
	    
	    public void listaVazia (){
			if (lista.isEmpty()) {
	            System.out.println("Lista está vazia");
	        } else {
	            System.out.println("\nLista não está vazia");
	        }
		}
}
