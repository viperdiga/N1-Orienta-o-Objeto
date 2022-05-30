package App;

import java.util.ArrayList;
import java.util.List;

public class ListaDeArtista {

	private ArrayList<Artista> lista;

	// construtor que inicializa o atributo(vari�vel)
	public ListaDeArtista() {
		lista = new ArrayList<Artista>();
	}

	public ArrayList<Artista> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Artista> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ListaDeArtista{" + "lista=" + lista + "}";
	}

	public void adicionarArtista(Artista p1) {
		this.lista.add(p1);
	}

	public void apagarTudo() {
		this.lista.clear();
	}

	public int obterQuantidadeDeArtistas() {
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
