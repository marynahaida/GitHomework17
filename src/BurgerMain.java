public class BurgerMain {
    public static void main(String[] args) {
        Burgers standardBurger = new Burgers("Булочка", "Сир", 1, "овочі", true);
        Burgers dietBurger = new Burgers("Булочка", "Сир", "овочі");
        Burgers doubleBurger = new Burgers("Булочка", 2, "Сир", "овочі", true);

    }
}
