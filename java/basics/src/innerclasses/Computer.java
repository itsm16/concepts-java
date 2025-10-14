package innerclasses;

public class Computer {
    private String brand;
    private String model;
    private OperatingSystem os;

    Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOs() {
        return os;
    }

    class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("Computer model: " + model + ", OS: " + osName);
        }
    }

    static class USB {
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void getType() {
            System.out.println("Type: " + type);
        }
    }
}
