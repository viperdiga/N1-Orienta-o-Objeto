package App;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
    	
		    public static void main(String[] args) throws Exception {
		    	
		    	
	
	        Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);

	        Studant st = new Studant();

	        System.out.print("Informe o seu nome: ");
	        st.name = sc.nextLine();

	        System.out.print("Informe sua nota n1: ");
	        st.n1 = sc.nextDouble();

	        System.out.print("Informe sua nota n2: ");
	        st.n2 = sc.nextDouble();
	        

	        System.out.print("Informe sua nota n3: ");
	        st.n3 = sc.nextDouble();
            
	        
	        
	        System.out.println(" \n"+st.soma()); 
	        
	        	        	             
	      if(st.soma() >= 60){
	            System.out.println(
	                "FINAL GRADE: " + st.soma() + "\n" + 
	                "Aprovado" + "\n"
	            );
	        }else{
	            System.out.println(
	                "FINAL GRADE: " + st.soma() + "\n" +
	                "Reprovado " + "\n" +
	                
	                 st.missing()
	              
	            );
	        } 


	    }
	}