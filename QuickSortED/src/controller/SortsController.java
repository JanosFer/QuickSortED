package controller;

import br.com.jonas.Sorts;

public class SortsController {
	public SortsController() {
		super();
	}
	
	public int[] quick(int[] vetor) {
		Sorts sort = new Sorts();
		
		int tamanho = vetor.length-1;
		sort.quick(vetor, 0, tamanho);
		
		return vetor;
	}
}
