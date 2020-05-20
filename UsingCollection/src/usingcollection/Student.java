package usingcollection;

class Student {
    private int studentId;
    private String name;
    private double gpa;

    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + studentId + ", " + name + ", " + gpa + '}';
    }
}
