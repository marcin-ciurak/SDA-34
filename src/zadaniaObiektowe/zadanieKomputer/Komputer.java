package zadaniaObiektowe.zadanieKomputer;

public class Komputer {

   /*
   "Private jest najbardziej restrykcyjnym modyfikatorem dostępu. Może być stosowane wyłącznie przed elementami klasy,
   w tym przed klasami wewnętrznymi. Oznacza on tyle, że dany element (klasa, metoda, czy pole)
   widoczny jest tylko i wyłącznie wewnątrz klasy".
   https://www.samouczekprogramisty.pl/modyfikatory-dostepu-w-jezyku-java/
   */

   private int potrzebnaMoc;
   private String producent;
   private TypProcesora typProcesora;


    public Komputer(int potrzebnaMoc, String producent, TypProcesora typProcesora) {
        this.potrzebnaMoc = potrzebnaMoc;
        this.producent = producent;
        this.typProcesora = typProcesora;

    }

    /*
    "Gettery w rzeczywistości to nic innego jak metody klasy (publiczne),
    dzięki którym możemy ustawiać wartość pola lub odczytywać jego wartość.
    Ich jedynym obowiązkiem jest zwracanie wartości konkretnego pola.
    Dodatkowo wyróżnia ich przedrostek get – np. getLogin()".
    https://1024kb.pl/kurs-java-od-podstaw/tydzien-2/settery-i-gettery/
    */

    public int getPotrzebnaMoc() {
        return potrzebnaMoc;
    }

    public String getProducent() {
        return producent;
    }

    public TypProcesora getTypProcesora() {
        return typProcesora;
    }


    @Override
    public String toString() {
        return "Producent " + producent + ". Potrzebna moc: " + potrzebnaMoc + " .";
    }
}
