public class Airplane extends Vehicle{

    private double altitude;

    public Airplane (String name, int wheels, double altitude) {
        super(name, wheels);
        this.altitude = altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void safetyIntro() {
        System.out.println("Ladies and gentlemen, For your safety and the safety of those around you, \n" +
                "please remain seated with your seat belt fastened and keep the aisle(s) clear until we are parked at the gate.");
    }
}
