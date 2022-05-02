package exercicio1;

public class Lista {
	No inicio, fim;
	
	// insere um n� no final da lista. Esse m�todo ser� chamado pelo m�todo inserir
	private void inserirFim(No aux) {
		if(inicio == null) {
			inicio = aux;
		} else {
			fim.prox = aux;
		}
		fim = aux;
	}
	
	//esse m�todo dever� ser implementado de acordo com o enunciado do exerc�cio
	private void inserirPrioridade(No aux) {
		if(inicio == null) {
			fim=aux;
			inicio = aux;
		} else { 
			if(fim.cor.equalsIgnoreCase(aux.cor)) { 
				fim.prox=aux;
				fim=aux;
			}
			else {
				No aux_f = inicio;
				while(aux_f.prox.cor.equalsIgnoreCase(aux.cor)){
					aux_f = aux_f.prox;
				}
				if (!aux_f.cor.equalsIgnoreCase(aux.cor)) {
					inicio = aux;
					aux.prox = aux_f;
				} else {
					No prox_ultimo = aux_f.prox;
					aux_f.prox = aux;
					aux.prox = prox_ultimo;
				
			}
			}
		}
	}
	
	
	// m�todo inserir. Esse m�todo ser� chamado a partir da classe Main
	public void inserir(int numero, String cor) {
		No aux = new No(numero, cor);
		if(cor.equalsIgnoreCase("verde")) {
			inserirFim(aux);
		} else {
			inserirPrioridade(aux);

		}
	}
	
	// m�todo utilizado para imprimir os dados da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.numero);
			aux = aux.prox;
		}
	}
}
