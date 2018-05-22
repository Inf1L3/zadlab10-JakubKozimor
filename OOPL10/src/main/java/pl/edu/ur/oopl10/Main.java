package pl.edu.ur.oopl10;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) throws IOException {
        int liczby[] = {1, 2, 3, 4, 5};

        try {
            int wyswietl = liczby[5];
            System.out.println("Liczba " + wyswietl);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Poza tablica ");
        }

        int liczba, dzielnik;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbe : ");
        liczba = odczyt.nextInt();
        System.out.println("Podaj dzielnik : ");
        dzielnik = odczyt.nextInt();
        zad3 dziel = new zad3();

        dziel.dzielenie(liczba, dzielnik);
        WprowadzZKonsoli l1 = new WprowadzZKonsoli();
        l1.ToFileText();
        l1.FromFileText();
    }

}
