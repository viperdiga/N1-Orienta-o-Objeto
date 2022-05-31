package app;

import java.util.Scanner;

public class Program {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		
		System.out.println("Digite o seu nome: ");
		p1.setNome (sc.nextLine());
		
		System.out.println("Digite seu Sexo: ");
		p1.setSexo (sc.nextLine());
				
		System.out.println("Digite sua Idade: ");
		p1.setIdade(sc.nextInt());
		
		Scanner sc1 = new Scanner(System.in);
		endereco e11 = new endereco();
				
		System.out.println("Digite seu CEP: ");
		e11.setCEP (sc1.nextLine());
		
		System.out.println("Digite o seu logradouro: ");
		e11.setLogradouro (sc1.nextLine());
		
		System.out.println("Digite seu complemento: ");
		e11.setComplemento (sc1.nextLine());
		
		System.out.println("Digite seu Número: ");
		e11.setNumero (sc1.nextInt());
		
		
	
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Sexo: " + p1.getSexo());
		System.out.println("Endereço: " +e11.toendereco() );
		
	}

				

}
