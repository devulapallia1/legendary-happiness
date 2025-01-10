import java.util.HashMap;
import java.util.Map;

class Department {
    private String name;
    private Map<String, Professor> professors;
    private Map<String, Student> students;

    public Department(String name) {
        this.name = name;
        this.professors = new HashMap<>();
        this.students = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addProfessor(Professor professor) {
        professors.put(professor.getId(), professor);
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Professor getProfessorById(String id) {
        return professors.get(id);
    }

    public Student getStudentById(String id) {
        return students.get(id);
    }

    public void displayAllMembers() {
        System.out.println("Department: " + name);
        System.out.println("Professors:");
        for (Professor professor : professors.values()) {
            professor.displayDetails();
            System.out.println();
        }
        System.out.println("Students:");
        for (Student student : students.values()) {
            student.displayDetails();
            System.out.println();
        }
    }
}
