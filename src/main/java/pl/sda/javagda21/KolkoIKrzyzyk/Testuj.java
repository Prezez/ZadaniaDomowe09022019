package pl.sda.javagda21.KolkoIKrzyzyk;

import java.util.Random;

public class Testuj {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 10; i++) {

            Integer[] tablica = new Integer[2];
            Main main = new Main();
            main.main(tablica);

        }
    }

    public static String KtoWygral (String wynik){
        return wynik;
    }
}
