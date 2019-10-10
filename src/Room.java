public class Room {
    double size;
    double temperature;
    boolean conditioner;

    Room(double s, double temp, boolean ac) {
        size = s;
        temperature = temp;
        conditioner = ac;
    }

    Room(double s, double temp) {
        size = s;
        temperature = temp;
        conditioner = false;
    }

    boolean makeCooler() {
        if (temperature >= 16 && conditioner == true) {
            temperature--;
            return true;
        } else {
            return false;
        }
    }
}
