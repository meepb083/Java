package week4;

public class Monkey extends Animal {

    private String favoriteFruit; // ผลไม้ที่ชอบ

    public Monkey(String name, int age, String favoriteFruit) {
        super(name, age);
        this.favoriteFruit = favoriteFruit;
    }

    public void chatter() {
        System.out.println(name + " ร้อง เจี๊ยก เจี๊ยก");
    }

    public void showFavoriteFruit() {
        System.out.println("ผลไม้ที่ชอบ : " + favoriteFruit);
    }
}
