package SpringTwo;

public class LaunchApp {
    public static void main(String[] args) {
        CoursePlatform plat = new CoursePlatform(new JavascriptCourse());
        plat.setService(new DevopsCourse());

        plat.getTheCourse(3475.0);
    }
}
