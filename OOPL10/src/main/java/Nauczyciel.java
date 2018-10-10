/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Nauczyciel extends Pracownik {

    public Nauczyciel(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Nauczyciel");
    }

    @Override
    public void WykonajPrace() {
        System.out.println("pracuje nauczyciel");
    }

    @Override
    public void Mow() {
        System.out.println("mowi nauczyciel");
    }
    public String PokazDane()
    {
        WykonajPrace();
        Mow();
        return super.PokazDane();
        
    }
    
}
