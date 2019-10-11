class Room {
    private double size;
    private double temperature;
    private boolean conditioner;
    private double minTemp = 16;

    Room(double s, double temp, boolean ac) {
        this(s, temp);
        conditioner = ac;
    }

    Room(double s, double temp) {
        this.size = s;
        this.temperature = temp;
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
