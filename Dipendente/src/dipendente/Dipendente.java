/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dipendente;
        
/**
 *
 * @author Riccardo
 */





public class Dipendente {

    private String matricola;
    private double stipendio;
    private double straordinario; //per ogni ora
    
    public Dipendente(String matricola, double stipendio, double straordinario){
        this.matricola=matricola;
        this.stipendio=stipendio;
        this.straordinario=straordinario;
    }
    
    public double getStipendio(){
        return this.stipendio;
    }
    
    @Override
    public String toString(){
        String s="[Dipendente] Matricola: "+matricola+"\nStipendio base: "+stipendio+" Euro\n";
        s=s+"Straordinario: "+straordinario+" Euro/ora";
        return s;
    }
   
    public void stampa(){
        System.out.println(this);
    }
    
    public double paga(int ore_straordinario){
        return getStipendio()+straordinario*ore_straordinario;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Dipendente d1=new Dipendente("A0123",1000,13.5);
        d1.stampa();
        int ore_extra=12;
        System.out.println("Paga totale con "+ore_extra+" ore di straordinario: "+d1.paga(ore_extra));
    
        DipendenteA d2=new DipendenteA("B1234",1200,12.5);
        d2.stampa();
        d2.prendiMalattia(2);
        d2.stampaMalattia();
        System.out.println("Paga totale con "+ore_extra+" ore di straordinario: "+d2.paga(ore_extra));
        
    }
    
}
