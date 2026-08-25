public class Main {
    public static void main(String[] args) {
        // สร้างระบบโรงแรมและเพิ่มห้องเข้าไป
        Hotel myHotel = new Hotel();
        myHotel.addRoom(new Room("101"));
        myHotel.addRoom(new Room("102"));
        myHotel.addRoom(new Room("103"));

        // ลองทดสอบระบบ
        try {
            // เช็คห้องว่างตอนเริ่มต้น
            myHotel.checkAvailableRooms();

            // ลูกค้าคนที่ 1 จองห้อง 101
            myHotel.bookRoom("101");

            // เช็คห้องว่างอีกครั้ง (101 จะหายไป)
            myHotel.checkAvailableRooms();

            // ลูกค้าคนที่ 2 พยายามจองห้อง 101 (จะเกิด Error เข้า Block Catch)
            myHotel.bookRoom("101");

        } catch (BookingException e) {
            System.out.println("เกิดข้อผิดพลาด: " + e.getMessage());
        }

        System.out.println("\n--- ทดสอบการยกเลิก ---");
        try {
            // ยกเลิกห้อง 101
            myHotel.cancelBooking("101");
            
            // เช็คห้องว่างรอบสุดท้าย (101 จะกลับมาว่าง)
            myHotel.checkAvailableRooms();
        } catch (BookingException e) {
            System.out.println("เกิดข้อผิดพลาด: " + e.getMessage());
        }
    }
}