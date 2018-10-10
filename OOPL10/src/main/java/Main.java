/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba[] tab = new Osoba[6];
         
         tab[0] = new Piekarz("Mateusz", "Piekarz", 30);
         tab[1] = new Piekarz("Marcin", "Piekarski", 33);
         tab[2] = new Nauczyciel("Jakub", "Nauczyciel", 77);
         tab[3] = new Murarz("Adam", "Murarz", 59);
         tab[4] = new Mechanik("Milosz", "Mechaniczny", 51);
         tab[5] = new Mechanik("Ignacy", "Mechanik", 26);
         
         for(int i=0; i<6; i++)
         {
             System.out.println(tab[i].PokazDane());
         }

    }
    
    
}
