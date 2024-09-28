package com.example.demo.DTO;

public class CombinedDTO {
	private Student_dtls_DTO student_dlts;
	private Student_Marks_DTO student_Marks;
	private Student_subject_DTO Student_subject;
	public Student_dtls_DTO getStudent_dlts() {
		return student_dlts;
	}
	public void setStudent_dlts(Student_dtls_DTO student_dlts) {
		this.student_dlts = student_dlts;
	}
	public Student_Marks_DTO getStudent_Marks() {
		return student_Marks;
	}
	public void setStudent_Marks(Student_Marks_DTO student_Marks) {
		this.student_Marks = student_Marks;
	}
	public Student_subject_DTO getStudent_subject() {
		return Student_subject;
	}
	public void setStudent_subject(Student_subject_DTO student_subject) {
		Student_subject = student_subject;
	}

}
 