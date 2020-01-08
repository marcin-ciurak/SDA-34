package zadaniaOkrojone.zadanieData;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class MojaData {
    private int days, years;
    private Month months;

    public MojaData(int days, int month, int years) {
        this.days = days;
        this.months = Month.values()[month - 1];
        this.years = years;
    }

    public void wyswietlDate() {
        System.out.println(this.days + "." + (this.months.ordinal() + 1) + "." + this.years);
    }

    public void wyswietlDate2() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.days < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(this.days);
        stringBuilder.append(".");
        if (this.months.ordinal() + 1 < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(this.months.ordinal() + 1);
        stringBuilder.append(".");
        stringBuilder.append(this.years);
        System.out.println(stringBuilder.toString());
    }

    public void wyswietlDate3() {
        System.out.println(this.days + " " + this.months.getShortcut() + " " + this.years);
    }

    public int getDays() {
        return days;
    }

    public int getYears() {
        return years;
    }

    public Month getMonths() {
        return months;
    }

    public DateTime toDateTimeFormat(){
        return DateTime.parse(""+this.getDays()+"/"+(this.getMonths().ordinal()+1)+"/"+this.getYears(), DateTimeFormat.forPattern("dd/MM/yyyy"));
    }
}





/* Utwórz własny typ daty np. MojaData, który przyjmuje 3 argumenty typu int dla określenia dni, miesięcy i lat.
Dodaj metodę wyświetl datę, który wyświetli datę w następujący sposób:

a. 1.11.2011 (pierwszy listopada 2011)
b. 01.11.2011
c. * 1 lis 2011
 */

/*
        // aktualna data
        LocalDate localDate1 = LocalDate.now();
        System.out.println("Local date #1: " + localDate1);
        // data podawana jako liczby rok-miesiąc-dzień
        LocalDate localDate2 = LocalDate.of(2011, 11, 1);
        System.out.println("Local date #2: " + localDate2);
        // data podawana text w formacie ISO
        LocalDate localDate3 = LocalDate.parse("2011-11-01");
        System.out.println("Local date #3: " + localDate3);

 */