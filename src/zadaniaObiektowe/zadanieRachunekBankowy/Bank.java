package zadaniaObiektowe.zadanieRachunekBankowy;

public class Bank {
    String nazwaBanku;
    RachunekBankowy[] konta;

    protected Bank(String nazwaBanku, int iloscKont) {
        this.nazwaBanku = nazwaBanku;
        this.konta = new RachunekBankowy[iloscKont];
    }

    protected void wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwota) {

        for (int i = 0; i < konta.length; i++) {
            if (konta[i].numerKonta.equals(numerKontaZ)) {
                konta[i].przelewWyplata(kwota);
                System.out.println("Przelew " + kwota + "zł z konta " + konta[i].numerKonta + " należącego do " + konta[i].imie + konta[i].nazwisko);
            }

            if (konta[i].numerKonta.equals(numerKontaNa)) {
                konta[i].przelewWplata(kwota);
                System.out.println("Przelew " + kwota + "zł na konto " + konta[i].numerKonta + " należące do " + konta[i].imie + konta[i].nazwisko);
            }
        }

    }

}
