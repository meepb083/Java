package week4;

public class Cat extends Animal{

    private String color;

    public Cat(String name, int age, String color) {
    super(name, age);
    this.color = color;
}
    
    public void meaw(){
        System.out.println(name+ "ร้อง เหมียว เหมียว");
    }

    public void showColor(){
        System.out.println("สี :"+color);
    }

}
