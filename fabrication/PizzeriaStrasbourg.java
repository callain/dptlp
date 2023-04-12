package fabrication;

public class PizzeriaStrasbourg extends Pizzeria {

    @Override
    public Pizza creerPizza(String type) {
        Pizza pizza = null;

        if (type.equals("fromage")) {
            pizza = new PizzaFromageStyleStrasbourg();
        } else if (type.equals("poivrons")) {
            pizza = new PizzaPoivronsStyleStrasbourg();
        } else if (type.equals("fruitsDeMer")) {
            pizza = new PizzaFruitsDeMerStyleStrasbourg();
        } else if (type.equals("vegetarienne")) {
            pizza = new PizzaVegetarienneStyleStrasbourg();
        }

        return pizza;
    }

}
