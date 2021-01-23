package br.com.pessoal.service;

import java.util.List;

public class Node {

	private Integer valor;
	private Node direita;
	private Node esquerda;

	public Node(Integer valor) {
		this.valor = valor;
		direita = esquerda = null;
	}
	
	public Node() {}
	
	public void add(Integer valor) {
		if(this.valor == null) {
			this.valor = valor;
			return;
		}
		
		if (valor <= this.valor) {
			if (this.esquerda == null) {
				this.esquerda = new Node(valor);
				return;
			}
			this.esquerda.add(valor);
			return;
		}
		
		if(valor >= this.valor) {
			if(this.direita == null) {
				this.direita = new Node(valor);
				return;
			}
			this.direita.add(valor);
			return;
		}
	}

	public static List<Integer> arvorePreOrder(Node no, List<Integer> listaArvore) {

		listaArvore.add(no.valor);
		
		if (no.esquerda != null)
			listaArvore = Node.arvorePreOrder(no.esquerda, listaArvore);

		if (no.direita != null)
			listaArvore = Node.arvorePreOrder(no.direita, listaArvore);

		return listaArvore;
	}

}
