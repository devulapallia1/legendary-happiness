import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create university
        University university = new University("Tech University");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Add departments to university
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Create professors
        Professor profJohn = new Professor("P1", "John Doe", Arrays.asList("Algorithms", "Data Structures"));
        Professor profJane = new Professor("P2", "Jane Smith", Arrays.asList("Calculus", "Linear Algebra"));

        // Create students
        Student studentAlice = new Student("S1", "Alice Johnson", Arrays.asList("Algorithms", "Calculus"));
        Student studentBob = new Student("S2", "Bob Brown", Arrays.asList("Data Structures", "Linear Algebra"));

        // Add professors and students to departments
        csDepartment.addProfessor(profJohn);
        mathDepartment.addProfessor(profJane);

        csDepartment.addStudent(studentAlice);
        mathDepartment.addStudent(studentBob);

        // Display all departments and their members
        university.displayAllDepartments();
    }
}

