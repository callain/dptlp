package fabrication;

public class PizzaFromageStyleStrasbourg extends Pizza {
    public PizzaFromageStyleStrasbourg() {
        this.nom = "Pizza pâte style Strasbourg et fromage";
        this.pate = "Extra épaisse";
        this.sauce = "Sauce aux tomates cerise";
        garnitures.add("Lamelles de mozzarella");
    }

    @Override
    public void couper() {
        System.out.println("Découpage en parts carréees");
    }
}
