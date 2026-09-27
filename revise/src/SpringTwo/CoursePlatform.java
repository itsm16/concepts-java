package SpringTwo;

public class CoursePlatform {
    Course service;

    public CoursePlatform(Course service){
        this.service = service;
    }

    public void setService(Course service) {
        this.service = service;
    }

    Boolean getTheCourse(double amount){
        System.out.println("you purchased a course");
      return service.getCourse(amount);
    };

}
