package zadaniaObiektowe.zadanieKomputer;

public class Laptop extends Komputer {

    private double wielkoscMatrycy;
    private boolean czyJestEkranRetina;


    public Laptop(int potrzebnaMoc, String producent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyJestEkranRetina) {

        /* Dziedziczenie."(...) konstrukcja z wykorzystaniem słowa super. Służy ona do wywoływania konstruktorów klasy nadrzędnej
        (tej, z której dziedziczymy) o podanych parametrach, lub w przypadku metod -
        odpowiedników o takiej samej nazwie i podanych parametrach."
        https://javastart.pl/baza-wiedzy/programowanie-obiektowe/dziedziczenie-i-konstrukcja-super
         */

        super(potrzebnaMoc, producent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyJestEkranRetina = czyJestEkranRetina;
    }


    public double getWielkoscMatrycy() {
        return wielkoscMatrycy;
    }

    public boolean isCzyJestEkranRetina() {
        return isCzyJestEkranRetina();
    }

}






