package OOPS.innerclass;

public class Car { 
    private String model;
    private boolean isEngineOn = false;

    Car(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public boolean getEngineState(){
        return this.isEngineOn;
    }

    public class Engine {
        public void turnOn(){
            if(isEngineOn){
                System.out.println(model +": Already on");
            }else{
                System.out.println(model + ": Turned on");
            }
        }
        
    }
}
