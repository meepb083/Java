import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    // เพิ่มห้องเข้าไปในระบบโรงแรม
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // 1. ตรวจสอบสถานะห้องว่างทั้งหมด
    public void checkAvailableRooms() {
        System.out.println("--- รายการห้องว่าง ---");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("ห้อง " + room.getRoomNumber() + " : ว่าง");
            }
        }
        System.out.println("--------------------");
    }

    // 2. จองห้องพัก
    public void bookRoom(String roomNumber) throws BookingException {
        Room room = findRoom(roomNumber);
        if (room == null) {
            throw new BookingException("ไม่พบหมายเลขห้องนี้ในระบบ");
        }
        if (!room.isAvailable()) {
            throw new BookingException("ห้อง " + roomNumber + " ไม่ว่าง ถูกจองไปแล้ว!");
        }
        
        room.book();
        System.out.println("จองห้อง " + roomNumber + " สำเร็จ!");
    }

    // 3. ยกเลิกการจอง
    public void cancelBooking(String roomNumber) throws BookingException {
        Room room = findRoom(roomNumber);
        if (room == null) {
            throw new BookingException("ไม่พบหมายเลขห้องนี้ในระบบ");
        }
        if (room.isAvailable()) {
            throw new BookingException("ห้อง " + roomNumber + " ยังไม่มีการจอง ไม่สามารถยกเลิกได้!");
        }

        room.cancel();
        System.out.println("ยกเลิกการจองห้อง " + roomNumber + " สำเร็จ!");
    }

    // ฟังก์ชันช่วยหาห้องจากหมายเลข
    private Room findRoom(String roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                return room;
            }
        }
        return null; // ถ้าไม่เจอ
    }
}