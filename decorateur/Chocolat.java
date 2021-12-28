package decorateur;

public class Chocolat extends DecorateurIngredient {

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.20;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chocolat";
    }
}
