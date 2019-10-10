public class ConditionerTest {
    public static void main(String[] args) {
        Room room1 = new Room(16, 15, true);
        Room room2 = new Room(9, 18);
        Room room3 = new Room(12, 17, true);

        System.out.println(room1.temperature);
        room1.makeCooler();
        System.out.println(room1.temperature);

        System.out.println(room2.temperature);
        room2.makeCooler();
        System.out.println(room2.temperature);

        System.out.println(room3.temperature);
        room3.makeCooler();
        System.out.println(room3.temperature);
    }
}
