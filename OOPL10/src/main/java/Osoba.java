/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public abstract class Osoba {
    
    private String imie;
    private String nazwisko;
    private int wiek;
    
    
    public Osoba(String imie, String nazwisko, int wiek)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
    }
    
    
    public abstract void Mow();

    
    public String PokazDane() {
        return "{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + '}';
    }
   
     
   
}
