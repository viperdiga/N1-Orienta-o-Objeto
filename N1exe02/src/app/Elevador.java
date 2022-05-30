package app;

public class Elevador {
	
	  private int nAtual, nTotal, nCapac, nPessoas; 
	 
	  
	  public Elevador(int nA, int nT, int nC, int nP) {
	    this.nAtual   = nA;
	    this.nTotal   = nT;
	    this.nCapac   = nC;
	    this.nPessoas = nP;
	  } 
	 
	  
	  public int getCapac()    {
	    return this.nCapac;}
	  
	  public int getPessoas()    {
	    return this.nPessoas;}
	 
	  public int getTotal()    {
	    return this.nTotal;}
	 
	  public int getAtual()    {
	    return this.nAtual;} 
	 
	 
	  public void setPes(int nPe){
	    this.nPessoas = nPe;} 
	 
	  
	  public void Inicializa(int nCap,int nTot){
	    this.nTotal   = nTot;
	    this.nCapac   = nCap;
	  } 
	 
	
	  public void Entra(){
	    this.nPessoas+=1;
	  } 
	 
	 
	  public void Sai(){
	    this.nPessoas-=1;
	  } 
	 
	
	  public void Sobe(){
	    this.nAtual+=1;
	  } 
	 
	 
	  public void Desce(){
	    this.nAtual-=1;
	  } 
	 
	}