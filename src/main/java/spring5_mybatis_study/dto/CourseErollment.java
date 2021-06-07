package spring5_mybatis_study.dto;

public class CourseErollment {

	private Student student;
	private Course course;

	public CourseErollment() {
		// TODO Auto-generated constructor stub
	}

	public CourseErollment(Course course, Student student) {
		this.student = student;
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return String.format("CourseErollment [student=%s, course=%s]", student, course);
	}

}
