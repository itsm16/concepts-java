package innerclasses;

public class Car {
    private String model;
    private Boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine {
        void start(){
            if (isEngineOn) {
                System.out.println(model+": Engine is already on");
            }else{
                isEngineOn = true;
                System.out.println(model+": Engine started");
            }
        }
    }
}
