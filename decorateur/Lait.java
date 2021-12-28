package decorateur;

public class Lait extends DecorateurIngredient {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.10;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Lait";
    }
}
