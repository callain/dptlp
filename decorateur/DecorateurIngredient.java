package decorateur;

public abstract class DecorateurIngredient extends Boisson {
    protected Boisson boisson;

    protected DecorateurIngredient(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();

    @Override
    public Taille getTaille() {
        return boisson.getTaille();
    }
}
