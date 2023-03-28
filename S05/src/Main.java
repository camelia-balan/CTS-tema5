public class Main {
    public static void main(String[] args) {
        PepperoniPizza pepperoniPizza = (PepperoniPizza) PizzaFactory.createPizza(PizzaType.Pepperoni);
        CheesePizza cheesePizza = (CheesePizza) PizzaFactory.createPizza(PizzaType.Cheese);

        AnimalFactory af1, af2;
        af1 = new DogFactory();
        af2 = new CatFactory();
        af1.createAnimal();
        af2.createAnimal();

        GUIFactory gf1, gf2;
        gf1 = new WindowsGUIFactory();
        gf2 = new MacGUIFactory();
        gf1.createButton();
        gf1.createMenu();
        gf2.createButton();
        gf2.createMenu();
    }
}