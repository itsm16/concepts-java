package innerclasses;

public class Test {
    public static void main(String[] args) {
        // Car someCar = new Car("Tiago");
        // Car.Engine engine = someCar.new Engine();
        // engine.start();

        Computer computer = new Computer("Hp", "NP-04", "Windows");
        computer.getOs().displayInfo();

        // if not instantiated in computer class
        // Computer.OperatingSystem newOS = computer.new OperatingSystem("Windows");    

        // static nested
        Computer.USB usb = new Computer.USB("TYPE-C");
        usb.getType();
    }
}
