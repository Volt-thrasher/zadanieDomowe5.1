public class ConditionerTest {
    public static void main(String[] args) {
        Room room1 = new Room(16, 15, true);
        Room room2 = new Room(9, 18);
        Room room3 = new Room(12, 17, true);

        System.out.println(room1.getTemperature());
        room1.makeCooler();
        System.out.println(room1.getTemperature());

        System.out.println(room2.getTemperature());
        room2.makeCooler();
        System.out.println(room2.getTemperature());

        System.out.println(room3.getTemperature());
        room3.makeCooler();
        System.out.println(room3.getTemperature());

        System.out.println("Kwadratura pokoju: " + room1.getSize() + "m2, aktualna temperatura: " + room1.getTemperature()
                + " 'C");
    }
}
