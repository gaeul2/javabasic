package array;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private int studentId;
	private ArrayList <Subject> subjectList; 

	public Student(int studentId, String studentName) {
		this.studentName = studentName;
		this.studentId=studentId;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName, int subjectScore) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for (Subject subject: subjectList) {
			total += subject.getSubjectScore();
			System.out.println(studentName+" 학생의 "+
								subject.getSubjectName()+"의 성적은 "
								+subject.getSubjectScore()+"점 입니다.");

		}
		System.out.println(studentName+" 학생의 총점은 "+ total + "점 입니다.");
	}
}
