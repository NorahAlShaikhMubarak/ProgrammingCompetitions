package usingcollection;

class Student2 implements Comparable<Student2> {

    private int studentId;
    private String name;
    private double gpa;

    public Student2(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + studentId + ", " + name + ", " + gpa + '}';
    }

    public int compareTo(Student2 s) {
        if (studentId > s.studentId) {
            return 1;
        } else if (studentId < s.studentId) {
            return -1;
        } else {
            return 0;
        }
    }
}
