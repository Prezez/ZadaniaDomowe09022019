package pl.sda.javagda21.Zadanie2;

public class Main {
    public static void main(String[] args) {
        int wysokosc = 10;
        int dlugosc = 15;

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < dlugosc; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
