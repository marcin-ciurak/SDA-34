package zadaniaObiektowe.zadanieSalaLekcyjna;

public class SalaLekcyjnaTester {
    public static void main(String[] args) {

        SalaLekcyjna Alfa = new SalaLekcyjna("Alfa",23);
        SalaLekcyjna Beta = new SalaLekcyjna("Beta",46);

        Alfa.wypiszDaneSali();
        Beta.wypiszDaneSali();
    }
}
