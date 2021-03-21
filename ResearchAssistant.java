import java.util.ArrayList;

public class ResearchAssistant extends Assistant {

	public ResearchAssistant(String name, int Id, String officeNumber, String degree) {
		super(name, Id, officeNumber, degree);
	}
	static ArrayList<Assistant> ReAssistantList= new ArrayList<Assistant>();
	
	public static Assistant AddReAssistant(int Id){
	for(int i = 0; i<ReAssistantList.size(); i++){
		int cci = ReAssistantList.get(i).getId();
		if(Id == cci) {
		return 	ReAssistantList.get(i);
	}
	}
		return null;
	}
	
}
