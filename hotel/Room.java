public class Room {
    private String roomNumber;
    private boolean isAvailable;

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true; // ค่าเริ่มต้นคือห้องว่าง
    }

    public String getRoomNumber() {
        return roomNumber;     
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // เมธอดสำหรับจองห้อง
    public void book() {
        this.isAvailable = false;
    }

    // เมธอดสำหรับยกเลิกการจอง
    public void cancel() {
        this.isAvailable = true;
    }
}