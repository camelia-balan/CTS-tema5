public class PizzaFactory {

    //tema: de modificat astfel incat sa avem enum in loc de valorile hardcodate
    public static Pizza createPizza(PizzaType type) {
        switch (type) {
            case Cheese:
                return new CheesePizza();
            case Pepperoni:
                return new PepperoniPizza();
            case Vegan:
                return new VeganPizza();
        }
        return null;
    }
}
