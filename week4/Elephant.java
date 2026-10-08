package week4;

public class Elephant extends Animal {

    private double trunkLength; // ความยาวงวง (ซม.)

    public Elephant(String name, int age, double trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
    }

    public void trumpet() {
        System.out.println(name + " ร้อง แป๋น แป๋น");
    }

    public void showTrunkLength() {
        System.out.println("ความยาวงวง : " + trunkLength + " ซม.");
    }
}
