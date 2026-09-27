package SpringTwo;

public class DevopsCourse implements Course{
    @Override
    public Boolean getCourse(double amt) {
        System.out.println("Devops course purchased, amt: "+ amt);
        return true;
    }
}
