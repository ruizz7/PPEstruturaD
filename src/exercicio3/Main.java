package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// insercao dos elementos na lista
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		
		// inverte os elementos da lista
		inverter(lista);
		
		// imprime os elementos da lista
		lista.imprimir();
	}
	
	public static void inverter(Lista lista) {
		Lista lista_inv = new Lista();
		No aux = lista.fim;
		boolean acabou_inversao=false;
		while (!acabou_inversao) {
			if(aux==null) {
				break;
			}
			lista_inv.inserir(aux.dado);
			aux = aux.esq;
		}
	}
}