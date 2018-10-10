/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Mechanik extends Pracownik{

    public Mechanik(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Mechanik");
    }

    @Override
    public void WykonajPrace() {
        System.out.println("pracuje mechanik");
    }

    @Override
    public void Mow() {
        System.out.println("mowi mechanik");
    }
    
    public String PokazDane()
    {
        WykonajPrace();
        Mow();
        return super.PokazDane();
        
    }
}