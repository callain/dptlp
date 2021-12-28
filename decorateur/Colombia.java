package decorateur;

public class Colombia extends Boisson {

    public Colombia(Taille taille) {
        description = "Colombia";
        this.taille = taille;
    }

    @Override
    public double cout() {
        return 0.89;
    }
}
