package pl.sda.javagda21.Zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DruzynaPilkarska lechia = new DruzynaPilkarska("Lechia", 5,28,5,2,3);
        DruzynaPilkarska manUtd = new DruzynaPilkarska("Manchester United", 10,18,3,5,2);
        DruzynaPilkarska wisla = new DruzynaPilkarska("Wisla",28,25,3,4,3);
        DruzynaPilkarska gornik = new DruzynaPilkarska("Gornik", 35,28,6,4,0);
        DruzynaPilkarska zawisza = new DruzynaPilkarska("Zawisza", 57,3, 0,8,2);
        DruzynaPilkarska real = new DruzynaPilkarska("Real", 58, 3, 0, 9,1);
        DruzynaPilkarska barca = new DruzynaPilkarska("Barcelona", 58, 3, 0, 9,1);

        List <DruzynaPilkarska>tabela = new ArrayList<>(Arrays.asList(lechia,manUtd,wisla,gornik,zawisza,real,barca));

        System.out.println(tabela);
        System.out.println();
        System.out.println();
        System.out.println();

        KomparatorDruzyn komparatorDruzyn = new KomparatorDruzyn();
        Collections.sort(tabela,komparatorDruzyn);
        System.out.println(tabela);

    }
}
