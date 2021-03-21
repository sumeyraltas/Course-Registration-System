
public class Student extends Member {
	
	protected String year;

	public Student(String name, int Id, String year) {
		super(name, Id);
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
}
