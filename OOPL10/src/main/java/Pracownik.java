/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public abstract class Pracownik extends Osoba{
    
     private String zawod;

    public Pracownik(String imie, String nazwisko, int wiek, String zawod) {
        super(imie, nazwisko, wiek);
        this.zawod=zawod;
    }
    
     
     
     public abstract void WykonajPrace();

    @Override
    public String PokazDane() {
        return "{" + "zawod=" + zawod + '}' + super.PokazDane();
    }
     
     
}
