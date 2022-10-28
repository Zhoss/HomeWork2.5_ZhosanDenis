package Driver;

import Transport.Bus;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName, boolean havingLicense, int drivingExperience) {
        super(fullName, havingLicense, drivingExperience);
    }

    @Override
    public void startDriving() {
        System.out.println("Водитель " + getFullName() + " начинает движение на автобусе. ");
        drivenTransport.startDriving();
    }

    @Override
    public void stopDriving() {
        System.out.println("Водитель " + getFullName() + " останавливает автобус. ");
        drivenTransport.finishDriving();
    }

    @Override
    public void refillTransport() {
        System.out.println("Водитель " + getFullName() + " заправляет автобус");
    }

    public void drive() {
        System.out.println("Водитель " + getFullName() + " управляет " + drivenTransport.getBrand() + " " + drivenTransport.getModel() + " и будет участвовать в заезде");
    }
}
