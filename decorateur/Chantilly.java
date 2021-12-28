package decorateur;

public class Chantilly extends DecorateurIngredient {

    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.10;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chantilly";
    }
}