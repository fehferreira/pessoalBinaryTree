package br.com.pessoal.service.test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.github.javafaker.Faker;

import br.com.pessoal.service.Node;

public class ArvoreBinariaTest {

	@Test
	public void deveRetornarOsValoresDaArvore() {
		
		Faker faker = new Faker();
		List<Integer> listaArvore = new ArrayList<Integer>();
		Node raiz = new Node();
		
		for (int i = 1; i < 10; i++) {
			listaArvore.add(faker.number().randomDigitNotZero());
			raiz.add(listaArvore.get(listaArvore.size()-1));
		}
		
		System.out.println(listaArvore.size());
		listaArvore.forEach(valor -> System.out.println(valor));
		
		List<Integer> listaRaiz = Node.arvorePreOrder(raiz, new ArrayList<Integer>());
		
		for(Integer valor : listaRaiz) {
			assertThat(listaArvore, hasItems(valor));
		}

	}
	
	@Test
	public void valoresDaArvoreEmOrdemCrescente() {
		
		Faker faker = new Faker();
		List<Integer> listaArvore = new ArrayList<>();
		Node raiz = new Node();
		
		for(int i = 0 ; i < 10 ; i++) {
			listaArvore.add(faker.number().randomDigitNotZero());
			raiz.add(listaArvore.get(listaArvore.size() - 1));
		}
		Collections.sort(listaArvore);

		List<Integer> listaBinariaOrganizada = Node.arvoreInOrder(raiz, new ArrayList<Integer>());
		
		for(Integer valores : listaBinariaOrganizada) {
			assertThat(listaArvore, hasItems(valores));
		}
		
	}
	
	

}