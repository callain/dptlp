package decorateur;

public class Sumatra extends Boisson {

    public Sumatra() {
        description = "Sumatra";
    }

    @Override
    public double cout() {
        return 0.99;
    }

}