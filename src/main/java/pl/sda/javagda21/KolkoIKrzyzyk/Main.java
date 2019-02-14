package pl.sda.javagda21.KolkoIKrzyzyk;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] tablica = new String[9];
        Scanner scanner = new Scanner(System.in);
        int licznik = 0;
        int pozycja;
        String gracz;

        for (int j = 0; j < tablica.length; j++) {
            tablica[j] = String.valueOf(j);
        }

        wypiszKolkoIKrzyzyk(tablica);

        for (int i = 0; i < 9; i++) {

            if (licznik % 2 == 0) {
                gracz = "X";
            } else {
                gracz = "O";
            }

            do {
                System.out.println("Podaj pole w które chcesz wpisać swój symbol: (" + gracz + ")");
                pozycja = scanner.nextInt();
            } while (!czyNieZajete(tablica,pozycja));

            tablica[pozycja] = gracz;

            wypiszKolkoIKrzyzyk(tablica);

//        System.out.println(Arrays.toString(tablica));
//            System.out.println(czyWygrana(tablica));

            if (czyWygrana(tablica)) {
                System.out.println("Wygrał gracz: " + gracz);
                return;
            }
            licznik++;
        }
        System.out.println("Gra skończyła się remisem");
    }

    public static boolean czyWygrana(String[] tablicaWygranych) {
        if (!tablicaWygranych[0].equalsIgnoreCase(" ") && tablicaWygranych[0].equalsIgnoreCase(tablicaWygranych[1]) && tablicaWygranych[1].equalsIgnoreCase(tablicaWygranych[2]) ||
                !tablicaWygranych[3].equalsIgnoreCase(" ") && tablicaWygranych[3].equalsIgnoreCase(tablicaWygranych[4]) && tablicaWygranych[4].equalsIgnoreCase(tablicaWygranych[5]) ||
                !tablicaWygranych[6].equalsIgnoreCase(" ") && tablicaWygranych[6].equalsIgnoreCase(tablicaWygranych[7]) && tablicaWygranych[7].equalsIgnoreCase(tablicaWygranych[8]) ||
                !tablicaWygranych[0].equalsIgnoreCase(" ") && tablicaWygranych[0].equalsIgnoreCase(tablicaWygranych[3]) && tablicaWygranych[3].equalsIgnoreCase(tablicaWygranych[6]) ||
                !tablicaWygranych[1].equalsIgnoreCase(" ") && tablicaWygranych[1].equalsIgnoreCase(tablicaWygranych[4]) && tablicaWygranych[4].equalsIgnoreCase(tablicaWygranych[7]) ||
                !tablicaWygranych[2].equalsIgnoreCase(" ") && tablicaWygranych[2].equalsIgnoreCase(tablicaWygranych[5]) && tablicaWygranych[5].equalsIgnoreCase(tablicaWygranych[8]) ||
                !tablicaWygranych[0].equalsIgnoreCase(" ") && tablicaWygranych[0].equalsIgnoreCase(tablicaWygranych[4]) && tablicaWygranych[4].equalsIgnoreCase(tablicaWygranych[8]) ||
                !tablicaWygranych[2].equalsIgnoreCase(" ") && tablicaWygranych[2].equalsIgnoreCase(tablicaWygranych[4]) && tablicaWygranych[4].equalsIgnoreCase(tablicaWygranych[6])) {
            return true;
        } else {
            return false;
        }
    }

    public static void wypiszKolkoIKrzyzyk(String[] tablica) {
        System.out.println(tablica[0] + " | " + tablica[1] + " | " + tablica[2]);
        System.out.println("-   -   -");
        System.out.println(tablica[3] + " | " + tablica[4] + " | " + tablica[5]);
        System.out.println("-   -   -");
        System.out.println(tablica[6] + " | " + tablica[7] + " | " + tablica[8]);
    }

    public static boolean czyNieZajete (String[] tablica, int pozycja){
        if (pozycja<0||pozycja>9){
            System.out.println("Podaj pole od 0 do 9");
            return false;
        }
        if (tablica[pozycja].equalsIgnoreCase("X")||tablica[pozycja].equalsIgnoreCase("O")){
            System.out.println("To pole jest już zajete :(");
            return false;
        }
        else return true;
    }
}
