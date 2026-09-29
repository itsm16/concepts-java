package rough.exceptions;

public class LaunchClass {

    public static void main(String[] args) {
        ExceptionHandled errClass = new ExceptionHandled();

        try {
            // hovering on div tells about the exception
            errClass.div(12, 0);
        }catch (ArithmeticException e){
            System.out.println("Error: "+ e);
        }
    }
}
