package fabrication;

public abstract class Pizzeria {

    public Pizza commanderPizza(String type) {
        Pizza pizza = creerPizza(type);

        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();

        return pizza;
    }

    public abstract Pizza creerPizza(String type);
}
