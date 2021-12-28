package decorateur;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        // Espresso
        Boisson espresso = new Espresso(Taille.NORMALE);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cout());

        // Colombia VENTI double chocolat caramel chantilly
        // 0,89 + 0,2 + 0,2 + 0,20 + 0,1 = 1,59
        Boisson colombia = new Chantilly(new Caramel(new Chocolat(new Chocolat(new Colombia(Taille.VENTI)))));
        System.out.println(colombia.getDescription());
        System.out.println(colombia.cout());

        // Sumatra double chocolat chantilly
        Boisson sumatra = new Chantilly(new Chocolat(new Chocolat(new Sumatra())));
        System.out.println(sumatra.getDescription());
        System.out.println(sumatra.cout());
    }
}
