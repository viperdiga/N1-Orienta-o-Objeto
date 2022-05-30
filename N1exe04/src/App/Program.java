package App;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ListaDeArtista l1 = new ListaDeArtista();
		
		int op;
		
		do {
			System.out.println("DIGITE");
			System.out.println("1 - Cadastrar Artista");
			System.out.println("2 - Visualizar Artista");
			System.out.println("3 - Ver quantidade de Artista");
			System.out.println("4 - Apagar todos os Artista");
			System.out.println("5 - Ver total de Artista");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			switch(op) {
			case 1:
				Artista p1 = new Artista();
				System.out.println("Digite o nome do Artista: ");
				sc.nextLine();
				p1.setNome(sc.nextLine());
			
				l1.adicionarArtista(p1);
				System.out.println("Cadastrar com sucesso!");
				break;
			case 2:
				if(l1.getLista().isEmpty()) {
					System.out.println("N�o h� Artistas");
				}else {
					System.out.println(l1);
				}
				break;
			case 3:
				System.out.println("Total de cadastros: " + l1.obterQuantidadeDeArtistas());
				break;
			case 4:
				if(l1.getLista().isEmpty()) {
					System.out.println("N�o h� Artistas para excluir.");
				}else {
					int confirma;
					System.out.println("Tem certeza que deseja ECLUIR TUDO?\n1-SIM\n2-NAO");
					confirma = sc.nextInt();
					if(confirma == 1) {
						l1.apagarTudo();
						System.out.println("Artistas excluidos com sucesso");
					}else {
						System.out.println("Opcao cancelada.");
					}
				}
				break;
			case 5:
				System.out.println("Total da lista R$ " + l1.calcularTotalDaLista());
				break;
			case 0:
				System.out.println("Sistema encerrado.");
				break;
			default:
				System.out.println("Opcao inv�lida.");
			}
		}while(op!=0);
	}

}
