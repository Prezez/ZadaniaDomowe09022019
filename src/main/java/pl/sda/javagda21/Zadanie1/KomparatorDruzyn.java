package pl.sda.javagda21.Zadanie1;

import java.util.Comparator;
import java.util.Random;

public class KomparatorDruzyn implements Comparator<DruzynaPilkarska> {
    Random losowo = new Random();

    @Override
    public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {

        if (o1.getLiczbaPunktów() < o2.getLiczbaPunktów()) {
            return 1;
        } else if (o1.getLiczbaPunktów() > o2.getLiczbaPunktów()) {
            return -1;
        } else if (o1.getBramkiTrafione() > o2.getBramkiTrafione()) {
            return 1;
        } else if (o1.getBramkiTrafione() < o2.getBramkiTrafione()) {
            return -1;
        } else if (o1.getBramkiTrafione() - o1.getBramkiStracone() > o2.getBramkiTrafione() - o2.getBramkiStracone()) {
            return -1;
        } else if (o1.getBramkiTrafione() - o1.getBramkiStracone() < o2.getBramkiTrafione() - o2.getBramkiStracone()) {
            return 1;
        } else if (o1.getBramkiStracone() > o2.getBramkiStracone()) {
            return -1;
        } else if (o1.getBramkiStracone() < o2.getBramkiStracone()) {
            return 1;
        } else if (losowo.nextBoolean()) {
            return 1;
        } else return -1;
    }
}
