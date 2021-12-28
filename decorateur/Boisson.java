package decorateur;

public abstract class Boisson {
    protected String description = "Boisson inconnue";
    protected Taille taille = Taille.NORMALE;

    public String getDescription() {
        return description;
    }

    public Taille getTaille() {
        return taille;
    }

    public abstract double cout();
}
