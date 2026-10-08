package week4;

public class Main {

    public static void main(String[] args) {

        
        Dog dog = new Dog("Doode", 3, "Poodle");

        System.out.println("======== Dog ========");
        dog.eat();
        dog.bark();
        dog.sleep();
        dog.showBreed();
        dog.excrete();

        System.out.println();

        
        Cat cat = new Cat("Jijee", 9, "White-Black");

        System.out.println("======== Cat ========");
        cat.eat();
        cat.meaw();
        cat.sleep();
        cat.showColor();
        cat.excrete();

        System.out.println();

        
        Goat goat = new Goat("Messi", 2, "โค้ง");

        System.out.println("======== Goat ========");
        goat.eat();
        goat.bleat();
        goat.sleep();
        goat.showHornType();
        goat.excrete();
        goat.showCharacteristics();

        System.out.println();

        
        Lion lion = new Lion("Haaland", 5, "สีทอง");

        System.out.println("======== Lion ========");
        lion.eat();
        lion.roar();
        lion.sleep();
        lion.showManeColor();
        lion.excrete();
        lion.showCharacteristics();
    }
}
