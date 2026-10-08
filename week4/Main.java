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

        Elephant elephant = new Elephant("Phaitong", 10, 150.0);

        System.out.println("======== Elephant ========");
        elephant.eat();
        elephant.trumpet();
        elephant.sleep();
        elephant.showTrunkLength();
        elephant.excrete();

        System.out.println();

        Monkey monkey = new Monkey("Luffy", 4, "กล้วย");

        System.out.println("======== Monkey ========");
        monkey.eat();
        monkey.chatter();
        monkey.sleep();
        monkey.showFavoriteFruit();
        monkey.excrete();
    }
}
