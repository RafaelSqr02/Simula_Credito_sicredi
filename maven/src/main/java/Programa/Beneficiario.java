package Programa;

public class Beneficiario {
	
	private static int counterClient = 1;
	
	private String nome;
	private String cpf;
	private String email;
	private String valor;
	private String parcelas;
	private String seguro;
	
	
	public Beneficiario(String nome, String cpf, String email, String valor, String parcelas, String seguro) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.valor = valor;
		this.parcelas = parcelas;
		this.seguro = seguro;
		counterClient += 1;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getParcelas() {
		return parcelas;
	}
	public void setParcelas(String parcelas) {
		this.parcelas = parcelas;
	}
	public String getSeguro() {
		return seguro;
	}
	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}
	
	public String toString() {
		return "\nNome: " + this.getNome() +
		       "\nCPF: "  + this.getCPF() +
		       "\nEmail " + this.getEmail()+
		       "\nValor " + this.getValor()+
		       "\nParcelas " + this.getParcelas()+
		       "\nSeguro " + this.getSeguro();
		
	}
	
	
	

}
