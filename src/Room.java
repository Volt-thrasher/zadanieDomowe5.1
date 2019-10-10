class Room {
    private double size;
    private double temperature;
    private boolean conditioner;

    Room(double s, double temp, boolean ac) {
        size = s;
        temperature = temp;
        conditioner = ac;
    }

    double minTemp = 16;

    Room(double s, double temp) {
        size = s;
        temperature = temp;
        conditioner = false;
    }

    boolean makeCooler() {
        if (temperature >= minTemp && conditioner) {
            temperature--;
            return true;
        } else {
            return false;
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public double getSize() {
        return size;
    }

}
