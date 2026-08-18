public class Noodle extends Food {

    public Noodle(String name) {
        super(name , "Noodle Dish");
    }

    @Override
    public void prepare() {
        System.out.println(name + " : Pad Thai is being prepared.");
    }

    // ความสามารถเฉพาะของก๋วยเตี๋ยว
    public void boil() {
        System.out.println(name + " : Pad Thai is being cooked with noodles.");
    }

}
