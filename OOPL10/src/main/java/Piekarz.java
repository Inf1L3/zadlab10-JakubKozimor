/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Piekarz extends Pracownik{

    public Piekarz(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Piekarz");
    }

    @Override
    public void WykonajPrace() {
        System.out.println("pracuje piekarz");
    }

    @Override
    public void Mow() {
        System.out.println("mowi piekarz");
    }
    
    
    public String PokazDane()
    {
        WykonajPrace();
        Mow();
        return super.PokazDane();
        
    }
    
}
