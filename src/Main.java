import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car subaru = new Car("Subaru", "Impreza", 2.0);
        Car mitsubishi = new Car("Mitsubishi", "Lancer", 2.5);
        Car citroen = new Car("Citroen", "C4", 2.2);
        Car ford = new Car("Ford", "Escort", 1.8);
        System.out.println(mitsubishi);
        subaru.pitStop();

        Truck kamaz = new Truck("КАМАЗ", "4350-9", 12.0);
        Truck tatra = new Truck("Tatra", "T-138", 11.5);
        Truck iveco = new Truck("IVECO", "Iveco", 12.9);
        Truck ginaf = new Truck("Ginaf", "Rally Power", 11.7);
        System.out.println(kamaz);
        tatra.bestLapTime();

        Bus man = new Bus("Man", "Lion’s City C", 9.0);
        Bus volvo = new Bus("Volvo", "7900", 7.4);
        Bus liaz = new Bus("ЛиАЗ", "5256.58", 6.7);
        Bus hyundai = new Bus("Hyundai", "Aero Town", 7.5);
        System.out.println(liaz);
        hyundai.maxSpeed();

        DriverB denis = new DriverB("Жосан Денис Сергеевич", true, 8);
        DriverC dmitriy = new DriverC("Василенко Дмитрий Петрович", true, 6);
        DriverD nicolai = new DriverD("Ткаченко Николай Александрович", true, 12);

        denis.setDrivenTransport(subaru);
        denis.startDriving();
        denis.drive();
        dmitriy.setDrivenTransport(iveco);
        dmitriy.drive();
        nicolai.setDrivenTransport(man);
        nicolai.drive();
    }
}