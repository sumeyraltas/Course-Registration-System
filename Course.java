import java.util.ArrayList;

public class Course {
	private String courseName;
	private static String courseCode;
	private int year;
	private String semester;
	private int courseCapacity;
	private Instructor instructor;
	private Member member;
	static ArrayList<Course> CourseList= new ArrayList<Course>();
	
	public Course(String courseCode, String courseName, int year, String semester, int courseCapacity) {
		Course.courseCode = courseCode;
		this.courseName = courseName;
		this.year = year;
		this.semester = semester;
		this.courseCapacity = courseCapacity;
	}
	
	public static Course AddCourse(String courseCode ){
		for(int i = 0;i<=CourseList.size();i++) {
		if(courseCode.equals(CourseList.get(i).getCourseCode())) {
			//System.out.println("A course with code "+courseCode+" already exists.");
			return CourseList.get(i);
		}
		}
		{
			//System.out.println("Success");
			return null;
		}
		
	}

//	public String toString() {
//		return courseCode;
//	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

//	public String getInstructor() {
//		return courseCode;
//	}
//	public void setInstructor(String instructor) {
//		this.courseCode = instructor;
//	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseCapacity() {
		return courseCapacity;
	}

	public void setCourseCapacity(int courseCapacity) {
		this.courseCapacity = courseCapacity;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Course get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
}
