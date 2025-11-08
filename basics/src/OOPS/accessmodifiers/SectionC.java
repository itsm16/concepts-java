package OOPS.accessmodifiers;

public class SectionC {
    private int rollNum;
    private static int roomNum = 202;

    static{
        System.out.println("initialized first");
    }

    // part of class SectionC
    static int totalStudents = 50;

    // part of instances of class SectionC
    public int getRollNum() {
        return rollNum;
    }

    // part of instances of class SectionC
    public void setRollNum(int num){
        this.rollNum = num;
    }

    // now this method belongs to class SectionC
    public static int getRoomNum() {
        return roomNum;
    }
}
