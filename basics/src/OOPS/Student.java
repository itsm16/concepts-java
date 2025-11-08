package OOPS;

public class Student {
    private String name;
    private int rollNum;

    // overwrite
    public Student(String name, int num){
        this.name = name;
        this.rollNum = num;
    }

    public String getName(){
        return name;
    }

    public int getRollNum(){
        return rollNum;
    }

}
