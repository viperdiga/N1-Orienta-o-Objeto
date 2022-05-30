package App;

public class Artista {
	private String nome;
	private int idArtista;
	private int quantidade;
	private double valorUnitario;	
		
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdArtista() {
		return idArtista;
	}
	public void setIdArtista(int idArtista) {
		this.idArtista = idArtista;
	}
	public Artista(String nome, int idArtista) {
		super();
		this.nome = nome;
		this.idArtista = idArtista;
	}
	
	
	public double calcularTotal() {
		return this.quantidade * this.valorUnitario;
	}
	
	public Artista() {
		super();
	}
	
	@Override
	public String toString() {
		return "Artistas [nome=" + nome + ", idArtista=" + idArtista + ", getNome()=" + getNome() + ", getIdArtista()="
				+ getIdArtista() + "]";
	}
	
	
		
}
