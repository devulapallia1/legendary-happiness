import java.util.List;

class Student extends Person {
    private List<String> courses;

    public Student(String id, String name, List<String> courses) {
        super(id, name);
        this.courses = courses;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Courses: " + String.join(", ", courses));
    }
}
