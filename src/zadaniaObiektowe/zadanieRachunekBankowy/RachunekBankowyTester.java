package zadaniaObiektowe.zadanieRachunekBankowy;

public class RachunekBankowyTester {
    public static void main(String[] args) {

        //RachunekBankowy A = new RachunekBankowy(996,"Mieszko","Pierwszy");
        //RachunekBankowy B = new RachunekBankowy(1410,"Władysław","Jagiełło");

        RachunekBankowy[] wszystkieKonta = new RachunekBankowy[3];

        wszystkieKonta[0] = new RachunekBankowy(966000, "Mieszko", " Pierwszy");
        wszystkieKonta[1] = new RachunekBankowy(141000, "Władysław", " Jagiełło");
        wszystkieKonta[2] = new RachunekBankowy(152000, "Barbara", " Radziwiłłówna");


        Bank bankPolski = new Bank("bankPolski", 3);
        for (int i = 0; i < 3; i++) {
            bankPolski.konta[i] = wszystkieKonta[i];
        }

        for (int i = 0; i < wszystkieKonta.length; i++) {
            bankPolski.konta[i].przelewWplata(3.1415);
        }
        wszystkieKonta[0].przelewWplata(966);
        wszystkieKonta[1].przelewWplata(1410);
        wszystkieKonta[2].przelewWplata(1520);


        for (int i = 0; i < wszystkieKonta.length; i++) {
            bankPolski.konta[i].rachunekInfo();
        }

        bankPolski.wykonajPrzelew("966000", "141000", 456.7);
        System.out.println("\n");
        bankPolski.wykonajPrzelew("141000", "152000", 543.2);
        System.out.println("\n");



        for (int i = 0; i < wszystkieKonta.length; i++) {
            bankPolski.konta[i].rachunekInfo();
        }


    }


}

