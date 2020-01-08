package zadaniaOkrojone.zadanieStudent;

public class StudentTester {
    public static void main(String[] args) {

        Student brian = new Student(191947, "Brian", "May", 'M');
        Student tina = new Student(261939, "Tina", "Turner", 'K');
        Student bruce = new Student();


        bruce.setNrIndeksu(101233);
        bruce.setImie("Bruce");
        bruce.setNazwisko("Dickinson");
        bruce.setPlec('M');



        System.out.println("Student 1: " + brian.getNrIndeksu() + ", name: " + brian.getImie() + ", nazwisko: " + brian.getNazwisko() + ", plec: " + brian.getPlec());
        System.out.println("Student 2: " + tina.getNrIndeksu() + ", name: " + tina.getImie() + ", nazwisko: " + tina.getNazwisko() + ", plec: " + tina.getPlec());
        System.out.println("Student 3: " + bruce.getNrIndeksu() + ", name: " + bruce.getImie() + ", nazwisko: " + bruce.getNazwisko() + ", plec: " + bruce.getPlec());

    }
}

    /*
    Stwórz 3 instancje obiektu student i wypisz ich parametry na ekran metodami getterów.
    Co najmniej jednemu obiektowi ustaw parametry używając setterów.
    */
