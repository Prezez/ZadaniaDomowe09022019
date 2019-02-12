package pl.sda.javagda21.Zadanie5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int odstepyZepsucia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj poziom zepsucia: (0-4)");
        odstepyZepsucia = 6 - Integer.valueOf(scanner.nextLine());

        System.out.println("Podaj teskt:");
        String tekst = scanner.nextLine();

        String[] tekstPodzielony = tekst.split("");

        int licznik = 0;
        for (int i = 0; i < tekstPodzielony.length; i++) {
            if (tekstPodzielony[i].equals(" ") || tekstPodzielony[i].equals(",")) {
                licznik--;
            } else {
                if (licznik % odstepyZepsucia == 0) {
                    tekstPodzielony[i] = tekstPodzielony[i].toUpperCase();
                }
            }
            licznik++;
        }

        for (String s : tekstPodzielony) {
            System.out.print(s);
        }


    }
}
