class TemperatureSensor {
    private int temperature;
    public void setTemperature(int t) {
        if (t >= 0 && t <= 100) this.temperature = t;
        else System.out.println("Temperature out of range");
    }
    public int getTemperature() { return temperature; }
}

class TempertureSensor {
    public static void main(String[] args) {
        P5_TemperatureSensor ts = new P5_TemperatureSensor();
        ts.setTemperature(-5);
        ts.setTemperature(36);
        System.out.println("Temperature = " + ts.getTemperature());
    }
}
