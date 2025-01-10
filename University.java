import java.util.TreeMap;

class University {
    private String name;
    private TreeMap<String, Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new TreeMap<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.put(department.getName(), department);
    }

    public Department getDepartmentByName(String name) {
        return departments.get(name);
    }

    public void displayAllDepartments() {
        System.out.println("University: " + name);
        for (Department department : departments.values()) {
            department.displayAllMembers();
            System.out.println();
        }
    }
}
