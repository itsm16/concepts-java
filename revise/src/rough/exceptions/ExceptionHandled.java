package rough.exceptions;

import java.util.Scanner;

public class ExceptionHandled {

//    warn the invoker , add in the method signature that
//    method throws
    void div(int a, int b) throws ArithmeticException{
        System.out.println("Answer: "+ a/b);
    }
}
