package pl.sda.javagda21.Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaPowtorzenProgramu;
        int liczbaLiniitekstu;

        System.out.println("Podaj liczbę powtórzeń programu:");
        liczbaPowtorzenProgramu = Integer.valueOf(scanner.nextLine());


        for (int k = 0; k < liczbaPowtorzenProgramu; k++) {
            System.out.println("Podaj liczbę linii tekstu:");
            liczbaLiniitekstu = Integer.valueOf(scanner.nextLine());
            System.out.println("Teraz wpisuj tekst:");

            String[] listaTesktow = new String[liczbaLiniitekstu];
            for (int j = 0; j < liczbaLiniitekstu; j++) {
                listaTesktow[j] = scanner.nextLine();
            }

//            for (String s : listaTesktow) {
//
//                System.out.println(s);
//            }


            for (int i = 0; i < liczbaLiniitekstu; i++) {
                int dlugosc = listaTesktow[i].split(" ").length;
//                System.out.println(dlugosc);
                String[] listaSlow;
                listaSlow = listaTesktow[i].split(" ");
                for (int j = 0; j < dlugosc; j++) {
                    if ((j + i) % 2 == 0) {
                        listaSlow[j] = listaSlow[j].toUpperCase();
                    } else {
                        listaSlow[j] = listaSlow[j].toLowerCase();
                    }
                }
                for (String s : listaSlow) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }
        }
    }
}
