package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

import OOPS.Student;

public class TestOne {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}
