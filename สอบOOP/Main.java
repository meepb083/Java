public class Main {

    public static void main(String[] args) {

        Food rice = new Rice("Fried Rice");
        Food noodle = new Noodle("Pad Thai");
        Food drink = new Drink("Iced Tea");

        // เก็บอาหารทั้งหมด
        Food[] foods = {rice, noodle, drink};


        // ================= FOOD INFORMATION =================

        System.out.println("============ FOOD INFORMATION ============");

        for (Food food : foods) {
            food.displayInfo();
            food.prepare();

            // ความสามารถเฉพาะของแต่ละประเภท
            if (food instanceof Rice) {
                ((Rice) food).stirFry();
            }

            if (food instanceof Noodle) {
                ((Noodle) food).boil();
            }

            if (food instanceof Drink){
                ((Drink) food).serveCold();
            }

            System.out.println("------------------------------------------");
        }

        System.out.println();
        System.out.println("========= COLD FOOD / BEVERAGE =========");

        // ตรวจสอบว่าอาหารชนิดไหนสามารถเสิร์ฟเย็นได้
        for (Food food : foods) {

            if (food instanceof ColdServe) {

                food.displayInfo();

                ColdServe coldFood = (ColdServe) food;
                coldFood.serveCold();

                System.out.println("------------------------------------------");
            }
        }
    }
}
