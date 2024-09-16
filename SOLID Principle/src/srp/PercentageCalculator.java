package srp;

public class PercentageCalculator {
    public double calculatePercentage(Student student) {
        return (student.getMarks() / 100.0) * 100;
    }
}