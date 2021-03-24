public class ElectricCar extends Car{
    private double whPrKm;
    private double maxKm;
    private double batteryCapacityKWh;

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public double getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(double batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public ElectricCar(int regNr, String brand, String model, String year, int numberOfDoors, double whPrKm, double maxKm, double batteryCapacityKWh) {
        super(regNr, brand, model, year, numberOfDoors);
        this.whPrKm = whPrKm;
        this.maxKm = maxKm;
        this.batteryCapacityKWh = batteryCapacityKWh;
    }


    @Override
    public String toString() {
        return "ElectricCar{" +
                "whPrKm=" + whPrKm +
                ", maxKm=" + maxKm +
                ", batteryCapacityKWh=" + batteryCapacityKWh +
                '}';
    }

    @Override
    public double calculateGreenTax() {
        double tax = 0;
        double kmPrL = 100/(this.whPrKm/91.25);
        if (kmPrL>=20 && kmPrL<=50) {
            tax = 330;
        } else if (kmPrL>=15 && kmPrL<20) {
            tax = 1050;
        } else if (kmPrL>=10 && kmPrL<15) {
            tax = 2340;
        } else if (kmPrL>=5 && kmPrL<10) {
            tax = 5500;
        } else if (kmPrL<5) {
            tax= 10470;
        }
        return tax;
    }
}
