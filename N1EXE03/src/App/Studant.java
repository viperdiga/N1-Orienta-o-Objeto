package App;

public class Studant {

	private static final double PesoNotaUm = 0.30;
	private static final double PesoNotaDois = 0.35;
	private static final double PesoNotaTres = 0.35;
	
    public String name;

    public double n1;

    public double n2;

    public double n3;

    public double soma(){
        return this.n1*PesoNotaUm + this.n2*PesoNotaDois + this.n3*PesoNotaTres;
    }

    public String missing(){
        return String.format("Falta atingir => %2f", 60 - soma());
    }
    
    
    



    
    
}