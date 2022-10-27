package Transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDriving() {
        System.out.println("Грузовик " + getBrand() + " " + getBrand() + " стартует");
    }

    @Override
    public void finishDriving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " останавливается");
    }

    @Override
    public void pitStop() {
        finishDriving();
        System.out.println("Заменяются колеса, заливается топливо");
        startDriving();
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузовика " + getBrand() + " " + getModel() + " m сек");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика " + getBrand() + " " + getModel() + " m км/ч");
    }

    @Override
    public String toString() {
        return "Грузовик " + getBrand() +
                ", модель - " + getModel() +
                ", объем двигателя - " + getEngineVolume() + " л";
    }
}
