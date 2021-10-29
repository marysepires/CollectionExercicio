/**
 * 
 */
package br.edu.ufam.app;

import br.edu.ufam.algo.Fila;
import br.edu.ufam.algo.Lista;
import br.edu.ufam.algo.Pilha;

public class Main {

	public static void main(String[] args) {
		Lista li = new Lista();
		Fila fi = new Fila();
		Pilha pi = new Pilha();
		
		System.out.println("\tLista");
		li.listaVazia(); // Verifica��o se a lista est� vazia
		
		//Inser��o lista
		li.insereLis("Luiza"); 
		li.insereLis("Luana");
		li.insereLis("Nina");
		li.insereLis("Eduarda");
		li.insereLis("Paula");
		li.insereLis("Karla");
		li.listaVazia(); // Verifica��o de a Lista ainda est� vazia
		li.mostra(); // Mostra elementos da lista ap�s inser��o
		
		li.removeLista("Nina"); // Remover elemento especifico da lista
		li.mostra(); // Mostra lista ap�s remor��o
		li.removeLista("Luana"); // Remover elemento especifico da lista
		li.mostra(); // Mostra lista ap�s remor��o
		
		
		System.out.println("------------------------------------------");
		
		System.out.println("\tFila");
		fi.filaVazia(); // verifica��o se a fila est� vazia
		
		// Inser��o na fila
		fi.enfileirar("Joao");
		fi.enfileirar("Pedro");
		fi.enfileirar("Victor");
		fi.enfileirar("Lucas");
		fi.enfileirar("Felipe");
		fi.enfileirar("Caio");
		fi.filaVazia(); // verifica��o se a fila ainda est� vazia
		fi.mostra(); // mostra elementos da fila
		
		// Primeiro e Ultimo da Fila
		fi.primeiroFila();
		fi.ultimoFila();
		
		//Remor��o da Fila
		fi.removeFila();
		fi.mostra();
		fi.removeFila();
		fi.mostra();
		
		System.out.println("------------------------------------------");
		
		System.out.println("\tPilha");
		pi.pilhaVazia(); // Verifica��o de a Pilha est� vazia
		
		//Inser��o na Pilha
		pi.inserePi("Henrique");
		pi.inserePi("Maria");
		pi.inserePi("Juliana");
		pi.inserePi("Enzo");
		pi.inserePi("Valentina");
		pi.inserePi("Anderson");
		pi.pilhaVazia(); //// Verifica��o de a Pilha ainda est� vazia
		pi.mostraPi(); //Mostra elementos da Pilha
		
		pi.remove(); // Remove ultimo elemento adicionado na Pilha
		pi.mostraPi();
		pi.desempilhaPilha(); // Mostra o topo da pilha atual ap�s a remor��o
		pi.remove();
		pi.mostraPi();
		pi.desempilhaPilha();
		
		System.out.println("------------------------------------------");
		
	}

}
