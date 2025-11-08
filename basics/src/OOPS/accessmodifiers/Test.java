package OOPS.accessmodifiers;

public class Test {
    public static void main(String[] args) {
        SectionC StudentA = new SectionC();
        StudentA.setRollNum(21);
        System.out.println(StudentA.getRollNum());
        System.out.println(SectionC.getRoomNum());
    }
}
