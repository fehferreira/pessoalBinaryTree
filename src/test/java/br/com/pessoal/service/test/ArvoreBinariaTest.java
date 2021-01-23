package br.com.pessoal.service.test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import com.github.javafaker.Faker;

public class ArvoreBinariaTest {

	@Test
	public void deveRetornarOsValoresDaArvore(){
		Node raiz = new Node();
		Faker faker = new Faker();
		List<Integer> listaArvore = new ArrayList<>();
		
		for(int i = 0 ; i < 10 ; i++ ){
			listaArvore.add(faker.number().randomDigitNotZero());
			raiz.add(listaArvore.get(listaArvore.size() - 1, raiz));
		}
		
		List<Integer> listaRaiz = raiz.valoresDaArvore();
		
		for(int no : listaRaiz)
			assertThat(listaRaiz, containsInAnyOrder(no));
			
	}
	
}