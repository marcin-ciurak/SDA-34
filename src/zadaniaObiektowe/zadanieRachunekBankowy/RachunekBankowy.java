package zadaniaObiektowe.zadanieRachunekBankowy;

public class RachunekBankowy {

    String numerKonta, imie, nazwisko;
    double iloscSrodkow;
    int identyfikatorKonta;
    static int iloscKont = 0;

    protected String getNumerKonta() {
        return numerKonta;
    }

    protected double getIloscSrodkow() {
        return iloscSrodkow;
    }

    protected String getImie() {
        return imie;
    }

    protected String getNazwisko() {
        return nazwisko;
    }

    protected RachunekBankowy(int numerKonta, String imie, String nazwisko) {
        this.iloscSrodkow = 0;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKonta = Integer.toString(numerKonta);
        /*Integer. toString(int a) is an inbuilt method in Java which is used to return a String object,
        representing the specified integer in the parameter. Parameters: The method accepts one parameter a of integer type
        and refers to the integer needed to be converted to string.
         */
        this.identyfikatorKonta = iloscKont;
        iloscKont++;
    }

    protected void rachunekInfo() {
        System.out.println("Konto bankowe numer: " + getNumerKonta());
        System.out.println("Właściciel: " + getImie() + " " + getNazwisko());
        System.out.println("Stan: " + getIloscSrodkow() + " zł");
        System.out.println("\n");
    }

    protected void przelewWplata(double kwota) {
        this.iloscSrodkow += kwota;
    }

    protected void przelewWyplata(double kwota) {
        this.iloscSrodkow -= kwota;
    }


}


/* Stwórz klasę RachunekBankowy która posiada pola:
- numer konta
- ilość środków na koncie
- imie i nazwisko właściciela
stwórz w klasie metody:
- gettery do wszystkich pól (nie settery - wiesz dlaczego?)
- wykonajPrzelewPrzychodzący(double kwota):void
- wykonajPrzelewWychodzący(double kwota):void
(metody odejmują lub dodają na konto podaną ilość pieniędzy)
Stwórz klasę Bank która posiada jako pola:
- nazwę banku
- tablicę kont bankowych
stwórz w klasie metody:
- wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu)
 */