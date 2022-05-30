package App;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ListaEditora l1 = new ListaEditora();
		ListaLivro l2 = new ListaLivro();
		
		int op;
		
		do {
			System.out.println("DIGITE");
			System.out.println("1 - Cadastrar Editora ");
			System.out.println("2 - Cadastrar Livro ");
			System.out.println("3 - Visualizar Editora");
			System.out.println("4 - Visualizar Livro");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			switch(op) {
			case 1:
				Editora p1 = new Editora();
				System.out.println("Digite o nome do Editora: ");
				sc.nextLine();
				p1.setNome(sc.nextLine());
			
				l1.adicionarEditora(p1);
				System.out.println("Cadastrar com sucesso!");
				break;
				
			case 2:
				Livro P2 = new Livro();
				System.out.println("Digite o nome do Livro: ");
				sc.nextLine();
				P2.setTitulo(sc.nextLine());
			
				l2.adicionarLivro(P2);
				System.out.println("Cadastrar com sucesso!");
				break;
			case 3:
				if(l1.getLista().isEmpty()) {
					System.out.println("Não há Editoras");
				}else {
					System.out.println(l1);
				}
				break;
			case 4:
				if(l2.getLista().isEmpty()) {
					System.out.println("Não há Livros");
				}else {
					System.out.println(l2);
				}
				break;
					
			default:
				System.out.println("Opcao inv�lida.");
			}
		}while(op!=0);
	}

}
