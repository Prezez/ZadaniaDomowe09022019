package pl.sda.javagda21.Zadanie1;

import java.util.Objects;

public class DruzynaPilkarska {

    private String nazwa;
    private int bramkiStracone;
    private int bramkiTrafione;
    private int meczeWygrane;
    private int meczePrzegrane;
    private int meczeZremisowane;
    private int liczbaPunktów;

    public DruzynaPilkarska(String nazwa, int bramkiStracone, int bramkiTrafione, int meczeWygrane, int meczePrzegrane, int meczeZremisowane, int liczbaPunktów) {
        this.nazwa = nazwa;
        this.bramkiStracone = bramkiStracone;
        this.bramkiTrafione = bramkiTrafione;
        this.meczeWygrane = meczeWygrane;
        this.meczePrzegrane = meczePrzegrane;
        this.meczeZremisowane = meczeZremisowane;
        this.liczbaPunktów = liczbaPunktów;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getBramkiStracone() {
        return bramkiStracone;
    }

    public void setBramkiStracone(int bramkiStracone) {
        this.bramkiStracone = bramkiStracone;
    }

    public int getBramkiTrafione() {
        return bramkiTrafione;
    }

    public void setBramkiTrafione(int bramkiTrafione) {
        this.bramkiTrafione = bramkiTrafione;
    }

    public int getMeczeWygrane() {
        return meczeWygrane;
    }

    public void setMeczeWygrane(int meczeWygrane) {
        this.meczeWygrane = meczeWygrane;
    }

    public int getMeczePrzegrane() {
        return meczePrzegrane;
    }

    public void setMeczePrzegrane(int meczePrzegrane) {
        this.meczePrzegrane = meczePrzegrane;
    }

    public int getMeczeZremisowane() {
        return meczeZremisowane;
    }

    public void setMeczeZremisowane(int meczeZremisowane) {
        this.meczeZremisowane = meczeZremisowane;
    }

    public int getLiczbaPunktów() {
        return liczbaPunktów;
    }

    public void setLiczbaPunktów(int liczbaPunktów) {
        this.liczbaPunktów = liczbaPunktów;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DruzynaPilkarska)) return false;
        DruzynaPilkarska that = (DruzynaPilkarska) o;
        return getBramkiStracone() == that.getBramkiStracone() &&
                getBramkiTrafione() == that.getBramkiTrafione() &&
                getMeczeWygrane() == that.getMeczeWygrane() &&
                getMeczePrzegrane() == that.getMeczePrzegrane() &&
                getMeczeZremisowane() == that.getMeczeZremisowane() &&
                getLiczbaPunktów() == that.getLiczbaPunktów() &&
                Objects.equals(getNazwa(), that.getNazwa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNazwa(), getBramkiStracone(), getBramkiTrafione(), getMeczeWygrane(), getMeczePrzegrane(), getMeczeZremisowane(), getLiczbaPunktów());
    }

    @Override
    public String toString() {
        return "\n" + nazwa +
                ", W " + meczeWygrane +
                ", R " + meczeZremisowane +
                ", P " + meczePrzegrane +
                ", BZ " + bramkiTrafione +
                ", BS " + bramkiStracone +
                ", Pkt " + liczbaPunktów;
    }
}
