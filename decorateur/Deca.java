package decorateur;

public class Deca extends Boisson {

    public Deca(Taille taille) {
        this.description = "Deca";
        this.taille = taille;
    }

    @Override
    public double cout() {
        return 1.05;
    }

}
