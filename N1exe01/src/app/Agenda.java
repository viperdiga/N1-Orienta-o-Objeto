package app;

import java.util.Scanner;
import java.util.Vector;

public class Agenda {

	private static int total_pessoas;
    private static String name[];
    private static int idade;
    private static String nomes;
    private static float agAltura;
    static Vector set_name = new Vector<String>();
    static Vector set_age = new Vector<Integer>();
    static Vector set_altura = new Vector<Double>();

    public void quantidade_de_pessoa(int qtdade) {
    	total_pessoas = qtdade;
        name = new String[qtdade];
}
    
       
        public static void set_armazenaPessoa(int i) {
            Scanner in_teclado;
            System.out.println("Digite o nome da " + (i + 1) + "  pessoa");
            in_teclado = new Scanner(System.in);
            nomes = in_teclado.nextLine();
            System.out.println("Digite a idade da " + (i + 1) + " pessoa");
            in_teclado = new Scanner(System.in);
            idade = in_teclado.nextInt();
            System.out.println("Digite a altura da " + (i + 1) + " pessoa");
            in_teclado = new Scanner(System.in);
            String altura = in_teclado.nextLine();
            agAltura = Float.parseFloat(altura);

          
            set_name.add(i, nomes);
            set_age.add(i, idade);
            set_altura.add(i, agAltura);

        }

        public static void get_imprimeAgenda(int qtdade_impressao) {

            System.out.println((qtdade_impressao + 1) + " )nome: " + set_name.get(qtdade_impressao));
            System.out.println("idade: " + set_age.get(qtdade_impressao));
            System.out.println("altura: " + set_altura.get(qtdade_impressao));

        }

        @SuppressWarnings("unchecked")
        public static void removePessoa(int remove_index) {
            set_name.set(remove_index, null);
            set_age.set(remove_index, null);
            set_altura.set(remove_index, null);
        }

        public static int buscaPessoa(String nome_busca) {
            
            int position = -1;
            for (int i = 0; i < total_pessoas; i++) {
                if (set_name.get(i).equals(nome_busca)) {
                    position = i;
                }
            }
            return position;
        }

}
    

