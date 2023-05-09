package core.mate.academy.model;

public class Truck extends Machine {
    private double weightDistributionFrontEmpty;
    private double weightDistributionFrontLoaded;
    private int maximumGrossVehicleWeight;

    public Truck() {
    }

    public Truck(double weightDistributionFrontEmpty, double weightDistributionFrontLoaded,
                 int maximumGrossVehicleWeight) {
        this.weightDistributionFrontEmpty = weightDistributionFrontEmpty;
        this.weightDistributionFrontLoaded = weightDistributionFrontLoaded;
        this.maximumGrossVehicleWeight = maximumGrossVehicleWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
