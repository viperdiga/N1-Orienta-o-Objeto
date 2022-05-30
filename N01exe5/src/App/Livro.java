package App;

public class Livro {

	private String titulo;
	private String autor;
	private int idEditora;
	private int ano;
	
		
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getIdEditora() {
		return idEditora;
	}
	public void setIdEditora(int idEditora) {
		this.idEditora = idEditora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
		
				
	public Livro() {
		super();
	}
	
	public Livro(String titulo, String autor, int idEditora, int ano, int quantidade, double valorUnitario) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.idEditora = idEditora;
		this.ano = ano;
		
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", idEditora=" + idEditora + ", ano=" + ano
				+ ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getIdEditora()=" + getIdEditora()
				+ ", getAno()=" + getAno() + "]";
	}
}
