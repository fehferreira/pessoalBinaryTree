package br.com.pessoal.service;

public class Node {

	private Integer valor;
	private Node direita;
	private Node esquerda;
	
	public static void add(Integer valor, Node raiz) {
		if(raiz == null) {
			raiz = new Node();
			raiz.valor = valor;
			return;
		}
		
		if(valor > raiz.valor) {
			if(raiz.direita == null) {
				raiz.direita = new Node();
				raiz.direita.valor = valor;
				return;
			}
			Node.add(valor, raiz.direita);
			return;
		}
		
		if(raiz.esquerda == null) {
			raiz.esquerda = new Node();
			raiz.esquerda.valor = valor;
			return;
		}
		Node.add(valor, raiz.esquerda);
	}
	
	
	
}
