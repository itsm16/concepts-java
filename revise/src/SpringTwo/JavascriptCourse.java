package SpringTwo;

public class JavascriptCourse implements Course{
    @Override
    public Boolean getCourse(double amt) {
        System.out.println("Javascript course purchased, amt: "+ amt);
        return true;
    }
}
