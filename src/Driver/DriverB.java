package Driver;

import Transport.Competing;
import Transport.Car;

public class DriverB<T extends Car & Competing> extends Driver {

    public DriverB(String fullName, boolean havingLicense, int drivingExperience) {
        super(fullName, havingLicense, drivingExperience);
    }

    @Override
    public void startDriving() {
        System.out.println("Водитель " + getFullName() + " начинает движение на автомобиле");
    }

    @Override
    public void stopDriving() {
        System.out.println("Водитель " + getFullName() + " останавливает автомобиль");
    }

    @Override
    public void refillTransport() {
        System.out.println("Водитель " + getFullName() + " заправляет автомобиль");
    }

    public void drive(T car) {
        System.out.println("Водитель " + getFullName() + " управляет " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }
}
