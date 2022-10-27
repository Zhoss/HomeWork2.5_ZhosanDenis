package Transport;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDriving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " стартует");
    }

    @Override
    public void finishDriving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " останавливается");
    }

    @Override
    public void pitStop() {
        finishDriving();
        System.out.println("Заменяются колеса, заливается топливо");
        startDriving();
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автомобиля " + getBrand() + " " + getModel() + " n сек");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля " + getBrand() + " " + getModel() + " n км/ч");
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() +
                ", модель - " + getModel() +
                ", объем двигателя - " + getEngineVolume() + " л";
    }
}
