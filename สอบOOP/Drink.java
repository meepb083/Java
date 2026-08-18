public class Drink extends Food implements ColdServe {

    public Drink(String name) {
        super(name, "Beverage");
    }

    @Override
    public void prepare() {
        System.out.println(name + " : Iced Tea is being prepared.");
    }

    @Override
    public void serveCold() {
        System.out.println(name + " : Iced Tea is served cold");
    }

}
