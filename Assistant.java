
public class Assistant extends AcademicStaff{
	
	protected String degree;
	
	public Assistant(String name, int Id, String officeNumber, String degree) {
		super(name, Id, officeNumber);
		this.degree = degree;
	}
	
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
}
