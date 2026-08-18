public abstract class Food {

    protected String name;
    protected String type;

    public Food(String name, String type){
        this.name = name;
        this.type = type;

    }

    // แสดงข้อมูลอาหาร
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }

    // อาหารทุกชนิดต้องมีวิธีเตรียมอาหาร
    public abstract void prepare();
}
