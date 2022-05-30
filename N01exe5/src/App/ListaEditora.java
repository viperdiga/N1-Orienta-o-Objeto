package App;

import java.util.ArrayList;
import java.util.List;

public class ListaEditora {

	private ArrayList<Editora> lista;

	// construtor que inicializa o atributo(vari�vel)
	public ListaEditora() {
		lista = new ArrayList<Editora>();
	}

	public ArrayList<Editora> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Editora> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ListaEditora{" + "lista=" + lista + "}";
	}

	public void adicionarEditora(Editora p1) {
		this.lista.add(p1);
	}

	public void apagarTudo() {
		this.lista.clear();
	}

	public int obterQuantidadeDeEditoras() {
		return this.lista.size();
	}

	public double calcularTotalDaLista() {
		double soma = 0;
		for (int i = 0; i < this.lista.size(); i++) {
			soma = soma + this.lista.get(i).calcularTotal();
		}
		return soma;
	}

}
