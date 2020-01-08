package zadaniaObiektowe.zadanieMiasto;

public class Peasant extends Citizen {

    public Peasant(String name) {
        super(name);
    }

    public boolean canVote() {
        return false;
    }
}

