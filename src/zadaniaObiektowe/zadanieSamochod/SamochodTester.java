package zadaniaObiektowe.zadanieSamochod;

public class SamochodTester {
    public static void main(String[] args) {

        Samochod Syrena = new Samochod("Syrena 105 ", 115);

        Syrena.wypiszInformacjeOSamochodzie();
        Syrena.przyspieszO5kmh();
        Syrena.zwolnijO5kmh();
    }
}
