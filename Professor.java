import java.util.List;

class Professor extends Person {
    private List<String> subjects;

    public Professor(String id, String name, List<String> subjects) {
        super(id, name);
        this.subjects = subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    @Override
    public void displayDetails() {
        System.out.println("Professor ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Subjects: " + String.join(", ", subjects));
    }
}

