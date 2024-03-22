package BT3;

public class Student {
    private final String name;
    private final double averageScore;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return STR."Student{name='\{name}\{'\''}, averageScore=\{averageScore}\{'}'}";
    }
}