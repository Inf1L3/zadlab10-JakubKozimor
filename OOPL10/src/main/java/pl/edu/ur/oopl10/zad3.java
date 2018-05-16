/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class zad3 {

    public void dzielenie(int liczba, int dzielnik) {
        try {
            int wynik = liczba / dzielnik;
            System.out.println("Wynik dzielenia liczb:" + liczba + " Oraz: " + dzielnik + "to " + wynik);
        } catch (java.lang.Exception e) {
            System.out.println("Nie mozna przez 0 ");
        }
    }

    
}
