package fabrication;

public class PizzeriaBrest extends Pizzeria {

    @Override
    public Pizza creerPizza(String type) {
        Pizza pizza = null;

        if (type.equals("fromage")) {
            pizza = new PizzaFromageStyleBrest();
        } else if (type.equals("poivrons")) {
            pizza = new PizzaPoivronsStyleBrest();
        } else if (type.equals("fruitsDeMer")) {
            pizza = new PizzaFruitsDeMerStyleBrest();
        } else if (type.equals("vegetarienne")) {
            pizza = new PizzaVegetarienneStyleBrest();
        }

        return pizza;
    }

}
