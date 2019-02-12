package pl.sda.javagda21.Zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę liczb:");
        int iloscLiczb = scanner.nextInt();

        System.out.println("A teraz podawaj po kolei liczby");
        Integer[] liczby = new Integer[iloscLiczb];

        int suma = 0;
        int iloczyn = 1;
        for (int i = 0; i < iloscLiczb; i++) {
            liczby[i] = scanner.nextInt();
            suma += liczby[i];
            iloczyn *= liczby[i];
        }

        System.out.println("Suma to: " + suma);
        System.out.println("Iloczyn to: " + iloczyn);


        if (suma > iloczyn) {
            System.out.println("Suma jest większa od iloczynu");
        } else if (suma < iloczyn) {
            System.out.println("Iloczyn jest większy od sumy");
        } else {
            System.out.println("Iloczyn jest taki sam jak suma");
        }

    }
}
