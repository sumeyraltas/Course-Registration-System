import java.util.ArrayList;

public class TeachingAssistant extends Assistant {

	public TeachingAssistant(String name, int Id, String officeNumber, String degree) {
		super(name, Id, officeNumber, degree);
	}

	static ArrayList<Assistant> TeAssistantList= new ArrayList<Assistant>();
	
	public static Assistant AddTeAssistant(int Id){
	for(int i = 0; i<TeAssistantList.size(); i++){
		int cci = TeAssistantList.get(i).getId();
		if(Id == cci) {
		return 	TeAssistantList.get(i);
	}
	}
		return null;
	}
	

}
