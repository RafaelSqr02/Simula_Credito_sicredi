package Programa;

public class ContaBenefi {
	
	private static int contadordeConta = 1;
	
	private int simulacaoId;
	private Beneficiario beneficiario;
	private Double saldoCredito = 0.0;
	
	public ContaBenefi(Beneficiario beneficiario) {
		this.simulacaoId = contadordeConta;
		this.beneficiario = beneficiario;
		contadordeConta += 1;
	}

	public int getSimulacaoId() {
		return simulacaoId;
	}

	public void setSimulacaoId(int simulacaoId) {
		this.simulacaoId = simulacaoId;
	}

	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	public Double getSaldoCredito() {
		return saldoCredito;
	}

	public void setSaldoCredito(Double saldoCredito) {
		this.saldoCredito = saldoCredito;
	}
	
	public String toString() {
		return "\nNúmero da Simulação: " + this.getSimulacaoId() +
			   "\nNome: " + this.beneficiario.getNome() +
		       "\nCPF: " + this.beneficiario.getCPF() +
		       "\nEmail: " + this.beneficiario.getEmail() +
		       "\nValor: " + this.beneficiario.getValor() +
		       "\nParcelas: " + this.beneficiario.getParcelas() +
		       "\nSeguro: " + this.beneficiario.getSeguro() +
		       "\n";	
	}
	
	

}
