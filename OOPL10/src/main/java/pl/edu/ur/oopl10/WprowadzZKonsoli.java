/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
   public void ToFileText() throws IOException {
        String nazwapliku;
        System.out.println("Podaj nazwę pliku: ");
        nazwapliku = pobierz.nextLine();

        try {
            FileWriter plik = new FileWriter(nazwapliku + ".txt");
            BufferedWriter bw1 = new BufferedWriter(plik);
            String text;
            System.out.println("Wpisz do pliku: ");
            text = pobierz.nextLine();
            bw1.write(text);
            bw1.newLine();
            bw1.close();

        } catch (IOException e) {
            System.out.println("Błąd zapisu");
        }

    }

    public void FromFileText() throws FileNotFoundException, IOException {
        String nazwapliku;
        System.out.println("Jaki plik odczytac ?");
        nazwapliku = pobierz.nextLine();
        try {
            FileReader r1 = new FileReader(nazwapliku + ".txt");
            BufferedReader br1 = new BufferedReader(r1);

            String text = br1.readLine();

            do {
                System.out.println(text);
                text = br1.readLine();

            } while (text != null);

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }

    }
        
        
        
        
        
        


    
    }

