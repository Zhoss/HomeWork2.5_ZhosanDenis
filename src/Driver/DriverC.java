package Driver;

import Transport.Competing;
import Transport.Truck;

public class DriverC<T extends Truck & Competing> extends Driver {

    public DriverC(String fullName, boolean havingLicense, int drivingExperience) {
        super(fullName, havingLicense, drivingExperience);
    }

    @Override
    public void startDriving() {
        System.out.println("Водитель " + getFullName() + " начинает движение на грузовике");
    }

    @Override
    public void stopDriving() {
        System.out.println("Водитель " + getFullName() + " останавливает грузовик");
    }

    @Override
    public void refillTransport() {
        System.out.println("Водитель " + getFullName() + " заправляет грузовик");
    }

    public void drive(T truck) {
        System.out.println("Водитель " + getFullName() + " управляет " + truck.getBrand() + " " + truck.getModel() + " и будет участвовать в заезде");
    }
}
