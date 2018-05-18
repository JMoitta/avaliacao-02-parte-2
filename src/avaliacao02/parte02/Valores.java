package avaliacao02.parte02;

public class Valores implements ValoresITF {

	private int[] inteiros;
	private int tamanho = 0;
	
	public Valores() {
		inteiros = new int[10];
	}
	
	@Override
	public boolean ins(int v) {
		if(size() == 10 || v < 1)return false;
		inteiros[size()] = v;
		tamanho++;
		return true;
	}

	@Override
	public int del(int i) {
		if(size() == 0) return -1;
		int retorno = inteiros[i];
		inteiros[i] = 0;
		for(int j = i; j < size(); j++) {
			inteiros[j] = inteiros[j+1];
		}
		tamanho--;
		return retorno;
	}

	@Override
	public int size() {
		return tamanho ;
	}

	@Override
	public double mean() {
		if(size() == 0) return 0;
		double media = 0;
		for(int i = 0; i < size(); i++) {
			media += inteiros[i];
			
		}
		return (media / size());
	}

	@Override
	public int greater() {
		if(size() == 0) return -1;
		int maior = inteiros[0];
		for (int i = 0; i < size(); i++) {
			if(inteiros[i] > maior) {
				maior = inteiros[i];
			}
		}
		return maior;
	}

	@Override
	public int lower() {
		if(size() == 0) return -1;
		int menor = inteiros[0];
		for (int i = 0; i < size(); i++) {
			if(inteiros[i] < menor) {
				menor = inteiros[i];
			}
		}
		return menor;
	}

}
