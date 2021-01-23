package br.com.pessoal.service.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.github.javafaker.Faker;

import br.com.pessoal.service.Node;

public class ArvoreBinariaTest {

	@Test
	public void deveRetornarOsValoresDaArvore(){
		Node raiz = null;
		Faker faker = new Faker();
		List<Integer> listaArvore = new ArrayList<>();
		
		for(int i = 0 ; i < 10 ; i++ ){
			listaArvore.add(faker.number().randomDigitNotZero());
			raiz = Node.add(listaArvore.get(listaArvore.size() - 1), raiz);
		}
		
		List<Integer> listaRaiz = Node.valoresDaArvore(raiz);
		
		for(int no : listaRaiz)
			assertThat(listaRaiz, containsInAnyOrder(no));
			
		System.out.println(listaRaiz);
	}
	
}