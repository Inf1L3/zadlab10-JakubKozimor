/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Murarz extends Pracownik{

    public Murarz(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Murarz");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
   

public String PokazDane()
    {
        WykonajPrace();
        Mow();
        return super.PokazDane();
        
    }

    

    @Override
    public void WykonajPrace() {
        System.out.println("praacuje murarz");
    }

    @Override
    public void Mow() {
        System.out.println("mowi murarz");
    }

    
    
}
