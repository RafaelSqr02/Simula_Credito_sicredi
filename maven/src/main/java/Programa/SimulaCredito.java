package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class SimulaCredito {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<ContaBenefi> contasBancarias;
	
	public static void main(String[] args){
		contasBancarias = new ArrayList<ContaBenefi>();
		operacoes();
		
	}
	
	public static void operacoes() {
		
		System.out.println("-------------------------------------------------");
		System.out.println("----------Bem Vindos a Simula CREDITO------------");
		System.out.println("*********** Selecione uma Operação **************");
		System.out.println("|     Opção 1 - Criar Simulação      |");
		System.out.println("|     Opção 2 - Sair                 |");
		
		int operacao = input.nextInt();
		
		switch(operacao) {
		case 1:
			criarSimulacao();
			break;
		case 2:
			System.out.println("Obrigado por usar o nosso Sistema!");
			System.exit(0);
		default:
			System.out.println("Opção inválida!");
			operacoes();
			break;
		
		}
		
	}
	
	public static void criarSimulacao() {
		System.out.println("\nNome: ");
		String nome = input.next();
		
		System.out.println("\nCPF: ");
		String cpf = input.next();
		
		System.out.println("\nEmail: ");
		String email = input.next();

		System.out.println("\nValor: ");
		String valor = input.next();
		
		System.out.println("\nParcelas: ");
		String parcelas = input.next();
		
		System.out.println("\nSeguro: ");
		String seguro = input.next();
		
		Beneficiario cliente = new Beneficiario(nome, cpf, email, valor, parcelas, seguro);
		
		ContaBenefi conta = new ContaBenefi(cliente);
		
		contasBancarias.add(conta);
		System.out.println("Sua Simulação foi criada com sucesso!");
		
		operacoes();		
	}
	
		
	}


