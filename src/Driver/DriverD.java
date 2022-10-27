package Driver;

import Transport.Bus;
import Transport.Competing;

public class DriverD<T extends Bus & Competing> extends Driver {

    public DriverD(String fullName, boolean havingLicense, int drivingExperience) {
        super(fullName, havingLicense, drivingExperience);
    }

    @Override
    public void startDriving() {
        System.out.println("Водитель " + getFullName() + " начинает движение на автобусе");
    }

    @Override
    public void stopDriving() {
        System.out.println("Водитель " + getFullName() + " останавливает автобус");
    }

    @Override
    public void refillTransport() {
        System.out.println("Водитель " + getFullName() + " заправляет автобус");
    }

    public void drive(T bus) {
        System.out.println("Водитель " + getFullName() + " управляет " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде");
    }
}
