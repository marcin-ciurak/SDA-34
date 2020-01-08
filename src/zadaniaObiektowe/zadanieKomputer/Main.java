package zadaniaObiektowe.zadanieKomputer;

public class Main {
    public static void main(String[] args) {

        /*
        Stwórz klasę Komputer która posiada pola:
        potrzebna moc (int)
        producent (string)
        typ proceseora (enum o nazwie TypProcesora z wartościami: WIELORDZENIOWY/JEDNORDZENIOWY)
        Stwórz klasę dziedziczącą Laptop która posiada dodatkowe pole:
        wielkosc matrycy (double)
        czy posiada retine (boolean)
        Stwórz kilka obiektów typu Laptop i typu Komputer. Umieść je w tabelach, a następnie wypisz pętlą while.
        *Dla laptopów (żeby sprawdzić czy komputer jest Laptopem zastosuj instanceof) wypisz rowniez ich wielkosc matrycy.
         */

        Komputer K1 = new Komputer(300, "Dell", TypProcesora.JEDNORDZENIOWY);
        Komputer K2 = new Komputer(600, "IBM", TypProcesora.WIELORDZENIOWY);
        Laptop L1 = new Laptop(350, "Lenovo", TypProcesora.JEDNORDZENIOWY, 15.6, true);
        Laptop L2 = new Laptop(550, "Lenovo", TypProcesora.WIELORDZENIOWY, 17.3, false);


        // tablica obiektów typu komputer oraz laptop

        Komputer[] tablicaKomputerow = new Komputer[]{K1, K2, L1, L2};

        int i = 0;   // pętla while
        while (i < tablicaKomputerow.length) {


            /* Modyfikacja Stringu (niemodyfikowalny sam w sobie) - przez utworzenie nowego obiektu String
             i używając operator łączenia (+) dodajemy kolejną część składową.
             "Gdy używamy operatora + w przypadku obiektów String, tak naprawdę najpierw tworzymy nowy obiekt StringBuilder,
             następnie wywołujemy jego metodę append() z argumentem w postaci liczby, innego ciągu znaków, lub pojedynczego znaku.
             Na końcu musimy taki obiekt zamienić oczywiście z powrotem na String za pomocą metody toString()."
             https://javastart.pl/baza-wiedzy/klasy/string-stringbuffer-i-stringbuilder
             */


            StringBuilder sB = new StringBuilder();
            sB.append("Producent: " + tablicaKomputerow[i].getProducent() + " " +
                    "Potrzbena moc: " + tablicaKomputerow[i].getPotrzebnaMoc()
                    + " " + "Typ: " + tablicaKomputerow[i].getTypProcesora());
            if (tablicaKomputerow[i] instanceof Laptop) {
                sB.append(" Wielkosc matrycy: " + ((Laptop) tablicaKomputerow[i]).getWielkoscMatrycy());
            }
            System.out.println(sB.toString());
            i++; // Samodzielnie zwiekszamy i, aby w nastepnym przebiegu petli odnosic sie do nastepnego komputera z tablicy.


        }

    }
}

