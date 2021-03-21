import java.util.ArrayList;

public class Instructor extends AcademicStaff {

	private String title;
	public int CourseCount;

	static ArrayList<Instructor> InstructorList= new ArrayList<Instructor>();
	
	public Instructor(String name, int Id, String officeNumber, String title) {
		super(name, Id, officeNumber);
		this.title = title;
	}

//	public boolean coursecount() {
//		if(CourseCount==4){
//			System.out.println(Id+" - "+ InstructorList.get(Id) +"cannot teach more than 3 courses in this semester.");
//			return false;
//		}
//		CourseCount++;
//		System.out.println("Success");
//		return true;
//		
//	}
	public static Instructor AddInstructor(int intructorIDassign){
	for(int i = 0; i<InstructorList.size(); i++){
		int cci = InstructorList.get(i).getId();
		if(intructorIDassign == cci) {
		return 	InstructorList.get(i);
	}
	}
		return null;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
