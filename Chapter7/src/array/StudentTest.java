package array;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student(1, "김광석");
		student1.addSubject("국어", 100);
		student1.addSubject("수학", 60);
		student1.addSubject("과학", 20);
		
		student1.showStudentInfo();

		System.out.println("===========");
		
		Student student2 = new Student(2, "이미라");
		student2.addSubject("국어", 50);
		student2.addSubject("수학", 100);
		student2.addSubject("과학", 80);
		
		student2.showStudentInfo();
	}

}
