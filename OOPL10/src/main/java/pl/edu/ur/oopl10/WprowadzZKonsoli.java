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
import java.util.InputMismatchException;
public class WprowadzZKonsoli {
    Scanner pobierz = new Scanner(System.in);
    void wprowadzInt(){
        int liczba;
        try{
              liczba = pobierz.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Błedny typ");
        }
    }
    void wprowadzFloat(){
        float liczba;
        try{
              liczba = pobierz.nextFloat();
        }
        catch(InputMismatchException e){
            System.out.println("Błedny typ");
        }
        
   
    }
    void wprowadzChar(){
        char liczba;
        try{
              liczba = pobierz.next().charAt(0);
        }
        catch(InputMismatchException e){
            System.out.println("Błedny typ");
        }
    }
    void wprowadzLong(){
        long liczba;
        try{
              liczba = pobierz.nextLong();
        }
        catch(InputMismatchException e){
            System.out.println("Błedny typ");
        }
    }
    void wprowadzShort(){
        short liczba;
        try{
              liczba = pobierz.nextShort();
        }
        catch(InputMismatchException e){
            System.out.println("Błedny typ");
        }
    }
    void wprowadzDouble(){
        double liczba;
        try{
              liczba = pobierz.nextDouble();
        }
        catch(InputMismatchException e){
            System.out.println("Błedny typ");
        }
        
   
        
        
        
        
        
        


    
    }
}
