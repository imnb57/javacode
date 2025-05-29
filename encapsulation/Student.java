// 4. You are working on a student information system and need to create a Student class. The student class should have private instance variables for the student's name, ID number, and grade point average (GPA). Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and modified only through these methods. However, the GPA should be read-only and can only be set within the class constructor.

public class Student {
    private String name;
    private String id;
    private final double gpa;

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = id; }

    public double getGpa() {
        return gpa;
    }
}
