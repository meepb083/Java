public class Rice extends Food {

    public Rice(String name) {
        super(name, "Rice Dish");
    }

    @Override
    public void prepare() {
        System.out.println(name + " : Fried Rice is being prepared.");
    }

    public void stirFry() {
        System.out.println(name + " : Fried Rice is ready to serve.");
    }    
    
}
