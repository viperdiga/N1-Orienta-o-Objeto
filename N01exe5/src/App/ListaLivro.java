package App;

import java.util.ArrayList;
import java.util.List;

public class ListaLivro {

	private ArrayList<Livro> lista;

		public ListaLivro() {
		lista = new ArrayList<Livro>();
	}

	public ArrayList<Livro> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Livro> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ListaLivro{" + "lista=" + lista + "}";
	}

	public void adicionarLivro(Livro p2) {
		this.lista.add(p2);
	}

	public void apagarTudo() {
		this.lista.clear();
	}

	public int obterQuantidadeDeLivros() {
		return this.lista.size();
	}

	

}
