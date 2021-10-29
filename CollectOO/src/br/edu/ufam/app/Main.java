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
		li.listaVazia(); // Verificação se a lista está vazia
		
		//Inserção lista
		li.insereLis("Luiza"); 
		li.insereLis("Luana");
		li.insereLis("Nina");
		li.insereLis("Eduarda");
		li.insereLis("Paula");
		li.insereLis("Karla");
		li.listaVazia(); // Verificação se a Lista ainda está vazia
		li.mostra(); // Mostra elementos da lista após inserção
		
		li.removeLista("Nina"); // Remover elemento especifico da lista
		li.mostra(); // Mostra lista após remorção
		li.removeLista("Luana"); // Remover elemento especifico da lista
		li.mostra(); // Mostra lista após remorção
		
		
		System.out.println("------------------------------------------");
		
		System.out.println("\tFila");
		fi.filaVazia(); // Verificação se a fila está vazia
		
		// Inserção na fila
		fi.enfileirar("Joao");
		fi.enfileirar("Pedro");
		fi.enfileirar("Victor");
		fi.enfileirar("Lucas");
		fi.enfileirar("Felipe");
		fi.enfileirar("Caio");
		fi.filaVazia(); // Verificação se a fila ainda está vazia
		fi.mostra(); // Mostra elementos da fila
		
		// Primeiro e Ultimo da Fila
		fi.primeiroFila();
		fi.ultimoFila();
		
		//Remorção da Fila
		fi.removeFila();
		fi.mostra();
		fi.removeFila();
		fi.mostra();
		
		System.out.println("------------------------------------------");
		
		System.out.println("\tPilha");
		pi.pilhaVazia(); // Verificação se a Pilha está vazia
		
		//Inserção na Pilha
		pi.inserePi("Henrique");
		pi.inserePi("Maria");
		pi.inserePi("Juliana");
		pi.inserePi("Enzo");
		pi.inserePi("Valentina");
		pi.inserePi("Anderson");
		pi.pilhaVazia(); //// Verificação se a Pilha ainda está vazia
		pi.mostraPi(); //Mostra elementos da Pilha
		
		pi.remove(); // Remove ultimo elemento adicionado na Pilha
		pi.mostraPi();
		pi.desempilhaPilha(); // Mostra o topo da pilha atual após a remorção
		pi.remove();
		pi.mostraPi();
		pi.desempilhaPilha();
		
		System.out.println("------------------------------------------");
		
	}

}
