
public class AcademicStaff extends Member{

	protected String officeNumber;
	
	public AcademicStaff(String name, int Id, String officeNumber) {
		super(name, Id);
		
		this.officeNumber = officeNumber;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	
}
