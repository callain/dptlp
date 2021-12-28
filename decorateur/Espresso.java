package decorateur;

public class Espresso extends Boisson {

    public Espresso(Taille taille) {
        this.description = "Espresso";
        this.taille = taille;
    }

    @Override
    public double cout() {
        return 1.99;
    }
}