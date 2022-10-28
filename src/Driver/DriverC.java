package Driver;

import Transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, boolean havingLicense, int drivingExperience) {
        super(fullName, havingLicense, drivingExperience);
    }

    @Override
    public void startDriving() {
        System.out.print("Водитель " + getFullName() + " начинает движение на грузовике. ");
        drivenTransport.startDriving();
    }

    @Override
    public void stopDriving() {
        System.out.print("Водитель " + getFullName() + " останавливает грузовик. ");
        drivenTransport.finishDriving();
    }

    @Override
    public void refillTransport() {
        System.out.println("Водитель " + getFullName() + " заправляет грузовик");
    }

    public void drive() {
        System.out.println("Водитель " + getFullName() + " управляет " + drivenTransport.getBrand() + " " + drivenTransport.getModel() + " и будет участвовать в заезде");
    }
}
