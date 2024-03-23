package BT8;

public class Student implements Comparable<Student> {
    private final String fullName;
    private final double averageScore;

    public Student(String fullName, double averageScore) {
        this.fullName = fullName;
        this.averageScore = averageScore;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.averageScore, other.averageScore);
    }

    @Override
    public String toString() {
        return STR."\{fullName}_\{averageScore}";
    }
}