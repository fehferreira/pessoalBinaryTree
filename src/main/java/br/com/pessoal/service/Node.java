package br.com.pessoal.service;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private Integer valor;
	private Node direita;
	private Node esquerda;

	public Node(Integer valor) {
		this.valor = valor;
		this.direita = this.esquerda = null;
	}

	public static Node add(Integer valor, Node raiz) {
		if (raiz == null) {
			return new Node(valor);
		}

		Node galhos;

		if (valor >= raiz.valor) {
			galhos = new Node(valor);
			raiz.direita = galhos;
		}

		if (valor <= raiz.valor) {
			galhos = new Node(valor);
			raiz.esquerda = galhos;
		}

		return raiz;

	}

	public static List<Integer> valoresDaArvore(Node no) {
		List<Integer> listaArvore = new ArrayList<>();

		if(no.esquerda != null)
			Node.valoresDaArvore(no.esquerda);

		listaArvore.add(no.valor);
		
		if(no.direita != null)
			Node.valoresDaArvore(no.direita);
		
		return listaArvore;
	}

}
