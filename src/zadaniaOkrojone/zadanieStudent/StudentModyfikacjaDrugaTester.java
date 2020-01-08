package zadaniaOkrojone.zadanieStudent;

import java.util.Scanner;

public class StudentModyfikacjaDrugaTester {
    public static void main(String[] args) {
        int numerIndeksu = 0;
        String imie = new String();
        String nazwisko = new String();
        char plec = ' ';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w kreatorze studenta!");

        System.out.println("Podaj numer indeksu studenta którego tworzysz:");
        boolean poprawneDane = false;
        while (!poprawneDane) {
            try {
                numerIndeksu = Integer.parseInt(scanner.nextLine());
                poprawneDane = true;
            } catch (NumberFormatException e) {
                System.out.println("To co wpisales nie jest numerem indeksu! Wpisz poprawny numer indeksu:");
            }
        }

        poprawneDane = false;
        System.out.println("Podaj imię studenta którego tworzysz:");
        while (!poprawneDane) {
            String wczytanaLinia = scanner.nextLine();
            if (wczytanaLinia.length() <= 2 || wczytanaLinia.matches(".*\\d.*")) {
                System.out.println("To co wpisales nie jest imieniem! Wpisz poprawne name:");
            } else {
                poprawneDane = true;
                imie = wczytanaLinia;
            }
        }

        poprawneDane = false;
        System.out.println("Podaj nazwisko studenta którego tworzysz:");
        while (!poprawneDane) {
            String wczytanaLinia = scanner.nextLine();
            if (wczytanaLinia.length() <= 2 || wczytanaLinia.matches(".*\\d.*")) {
                System.out.println("To co wpisales nie jest nazwiskiem! Wpisz poprawne nazwisko:");
            } else {
                poprawneDane = true;
                nazwisko = wczytanaLinia;
            }
        }

        poprawneDane = false;
        System.out.println("Podaj plec (K lub M) studenta, którego tworzysz:");
        while (!poprawneDane) {
            String wczytanaLinia = scanner.nextLine();
            if (wczytanaLinia.length() != 1 || (wczytanaLinia.charAt(0) != 'K' && wczytanaLinia.charAt(0) != 'M')) {
                System.out.println("To co wpisales nie jest plcia! Wpisz poprawna plec:");
            } else {
                poprawneDane = true;
                plec = wczytanaLinia.charAt(0);
            }
        }


        Student student = new Student(numerIndeksu, imie, nazwisko, plec);


        student.przedstawSie();
    }
}
/*
Modyfikacja do zadania Student:
Napisz w klasie student metodę "przedstawSię():void" która wypisuje wszystkie parametry w postaci ślicznego string'a. Np.:
Cześć! Jestem Janek Kowalski, jestem mężczyzną i mój numer indeksu to: 666666.
Na końcu maina (modyfikacja #1) użyj tej metody i wypisz powitanie.
 */
