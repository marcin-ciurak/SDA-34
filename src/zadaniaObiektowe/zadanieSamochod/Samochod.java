package zadaniaObiektowe.zadanieSamochod;

public class Samochod {

    String nazwa;
    int predkosc;

    public Samochod(String nazwa, int predkosc) {
        this.nazwa = nazwa;
        this.predkosc = predkosc;
    }

    public void wypiszInformacjeOSamochodzie() {
        System.out.println("Samochod " + nazwa + "predkosc " + predkosc + " km/h.");

    }

    public void przyspieszO5kmh() {
        this.predkosc = predkosc + 5;
        System.out.println("Samochod " + nazwa + "predkosc " + predkosc + " km/h.");
    }

    public void zwolnijO5kmh() {
        this.predkosc = predkosc - 5;
        System.out.println("Samochod " + nazwa + "predkosc " + predkosc + " km/h.");
    }
}



/* Stwórz klasę Samochód.
Dodaj do klasy dwa pola:
String nazwa;
int predkosc;
stwórz trzy metody w klasie samochód:
wypiszInformacjeOSamochodzie():void - która wypisuje informacje o samochodzie (prędkość,
nazwę itd.)
przyspieszO5kmh():void - która ma zwiększać wartość prędkości samochodu o 5km/h
zwolnijO5kmh():void - która ma zmniejszać wartość prędkości samochodu o 5km/h
przetestuj napisane rozwiaznie
*/