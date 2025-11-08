package OOPS.innerclass;

public class Test {
    public static void main(String[] args) {
        Car someCar = new Car("V8");
        System.out.println(someCar.getModel());
        System.out.println(someCar.getEngineState());
        Car.Engine somEngine = someCar.new Engine();
        somEngine.turnOn();
    }
}
