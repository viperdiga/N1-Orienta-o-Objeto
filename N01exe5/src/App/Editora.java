package App;

public class Editora {
	
	private Long id;
	private String nome;
	private String email;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public double calcularTotal() {
		return this.quantidade * this.valorUnitario;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Editora [id=" + id + ", nome=" + nome + ", email=" + email + ", quantidade=" + quantidade
				+ ", valorUnitario=" + valorUnitario + ", getQuantidade()=" + getQuantidade() + ", getValorUnitario()="
				+ getValorUnitario() + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getEmail()="
				+ getEmail() + "]";
	}

	
	
	

}
