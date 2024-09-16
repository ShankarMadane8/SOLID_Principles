package srp;

public class SingleResponsibilityPrinciple {
	
    public static void main(String[] args) {
		Student student =new Student();
		student.setMarks(70);
		student.setName("Vishal");
		
		StudentRepository studentRepository =new StudentRepository();
		System.out.println(studentRepository.addStudentToDatabase(student));
		
		StudentPrinter studentPrinter = new StudentPrinter();
		studentPrinter.printDetails(student);
		
		PercentageCalculator percentageCalculator = new PercentageCalculator();
		System.out.println(percentageCalculator.calculatePercentage(student));
	}
}
