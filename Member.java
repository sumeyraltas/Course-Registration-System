import java.util.ArrayList;

public class Member  {
	
	protected String Name;
	protected int Id;
	protected ArrayList<Course> courseListmember;
	
//	public ArrayList<Course> getCourseListmember() {
//		return courseListmember;
//	}

//	public void setCourseListmember(ArrayList<Course> courseListmember) {
//		this.courseListmember = courseListmember;
//	}

	public Member(String name, int Id) {
		super();
		this.Name = name;
		this.Id = Id;
	    //setCourseListmember(new ArrayList<Course>());
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}



}



