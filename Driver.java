import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		ArrayList<Course> CourseList= new ArrayList<Course>();
		ArrayList<Instructor> InstructorList= new ArrayList<Instructor>();
		ArrayList<Student> StudentList= new ArrayList<Student>();
		ArrayList<TeachingAssistant> TeachingAssistantList= new ArrayList<TeachingAssistant>();
		ArrayList<Assistant> AssistantList= new ArrayList<Assistant>();
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] value = input.split(";"); 
		String comm = value[0]+value[1];
		int programYear = 2020;
		System.out.println("Program Year: "+programYear);
		
		while (!value[0].equals("exit")) {
		
			
			switch (comm) {
			
			case "createcourse":

                String courseCode = value[2];
                String courseName = value[3];
                int year = Integer.parseInt(value[4]);
                String semester = value[5];
                int courseCapacity = Integer.parseInt(value[6]);
                boolean a = true;

                Course course = new Course(courseCode,courseName,year,semester,courseCapacity);

                //course.AddCourse();

                for(int i = 0; i<CourseList.size(); i++){
                String cc = CourseList.get(i).getCourseCode();
                if(courseCode.equals(cc)) {
                        a = false;
                        System.out.println("A course with code "+courseCode+" already exists. ");
                        break;
                        }
                }

                
                if(a) { 
                    Course.CourseList.add(course);
                    System.out.println("success");
                    break;
                }

                break;
			    
				case "createinstructor":
					
					String intructorName = value[2];
					int intructorID = Integer.parseInt(value[3]);		
					String officeNumber = value[4];
					String title = value[5];
					boolean b = false;
					
					Instructor instructor = new Instructor(intructorName,intructorID,officeNumber,title); 
					
					for(int i = 0; i<InstructorList.size(); i++){
					int id = InstructorList.get(i).getId();
					if(intructorID == id) {
						b = true; 
						System.out.println("A person with ID "+intructorID+" already exists.");
						break;
						}
					}

					if(b) {
						System.out.println("success");
						Instructor.InstructorList.add(instructor);
						break;
					}
				    break;
				    
				case "createta":
					
					String taName = value[2];
					int taId = Integer.parseInt(value[3]);
					String taOffice = value[4];
					String tadegree = value[5];
					boolean c = false;
					
					TeachingAssistant ta = new TeachingAssistant(taName,taId,taOffice,tadegree);
					
					for(int i = 0; i<TeachingAssistantList.size(); i++){
					int id = TeachingAssistantList.get(i).getId();
					if(taId == id) {
						c = true; 
						System.out.println("A person with ID "+taId+" already exists.");
						break;
						}
					}
					
					if(c) {	 
						System.out.println("success");
						TeachingAssistant.TeAssistantList.add(ta);
						break;
					}
					break;
					
				case "createra":	
					
					String raName = value[2];
					int raid = Integer.parseInt(value[3]);
					String raOffice = value[4];
					String radegree = value[5];
					boolean e = false;
		
					ResearchAssistant assistant = new ResearchAssistant(raName,raid,raOffice,radegree);
					
					for(int i = 0; i<AssistantList.size(); i++){
					int id = AssistantList.get(i).getId();
					if(raid == id) {
						e = true;
						System.out.println("A person with ID "+raid+" already exists.");
						break;
						}	
					}
						
					if(e) {	
						System.out.println("success");
						ResearchAssistant.ReAssistantList.add(assistant);
						break;
					}
					
					break;
					
				case "createstudent":	
					
					String stuName = value[2];
					int stuid = Integer.parseInt(value[3]);
					String stuyear = value[4];
					boolean d = false;
		
					Student student = new Student(stuName,stuid,stuyear); 
					
					for(int i = 0; i<StudentList.size(); i++){
					int id = StudentList.get(i).getId();
					if(stuid == id) {
						d = true;
						System.out.println("A person with ID "+stuid+" already exists.");
						break;
						}	
					}
						
					if(d) {	
						System.out.println("success");
						StudentList.add(student);
						break;
					}
					
					break;
					
				case "assigninstructor":
					
					int intructorIDassign = Integer.parseInt(value[2]);
					String coursecode = value[3];
					
					Course coursea = Course.AddCourse(coursecode);
					Instructor instructora = Instructor.AddInstructor(intructorIDassign);
					
//					for(int i = 0; i<CourseList.size(); i++){
//						String cci = CourseList.get(i).getCourseCode();
//						if(coursecode.equals(cci)) {
//							System.out.println(InstructorList.get(i).getTitle()+" "+InstructorList.get(i).getName()+" is already teaching "
//					                      	+CourseList.get(i).getCourseCode()+" - "+CourseList.get(i).getCourseName()+".");
//					}
//					}
					
					if(InstructorList.size() > 4 ){
						System.out.println(intructorIDassign+" - "+ InstructorList.get(intructorIDassign) +"cannot teach more than 3 courses in this semester.");
					}
//					else {
//						System.out.println("success");
//					}
					//Instructor assign = new Instructor();

					Instructor.InstructorList.add(instructora);
				    coursea.setInstructor(instructora);
				    System.out.println("success");
					break;	
				    
				case "assignTA":
					
					int taIDassign = Integer.parseInt(value[2]);
					String tacoursecode = value[3];
					
					Course courset = Course.AddCourse(tacoursecode);
					Assistant instructort = TeachingAssistant.AddTeAssistant(taIDassign);
					
					for(int i = 0; i<CourseList.size(); i++){
						String cci = CourseList.get(i).getCourseCode();
						if(tacoursecode.equals(cci)) {
							System.out.println("TA "+TeachingAssistantList.get(i).getName()+" is already teaching "
						                      +CourseList.get(i).getCourseCode()+" - "+CourseList.get(i).getCourseName()+ ".");
						}
						}
					TeachingAssistant.TeAssistantList.add(instructort);
					courset.setMember(instructort);	
					System.out.println("success");
					break;
					
				case "assignRA":
					
					int raIDassign = Integer.parseInt(value[2]);
					String racoursecode = value[3];
					
//					for(int i = 0; i<CourseList.size(); i++){
//						String cci = CourseList.get(i).getCourseCode();
//						if(racoursecode.equals(cci)) {
//							System.out.println("Assistant  "+AssistantList.get(i).getName()+" is already teaching "
//						                      +CourseList.get(i).getCourseCode()+" - "+CourseList.get(i).getCourseName()+ ".");
//						}
//						}
//						System.out.println("success");
					System.out.println("Research assistants cannot assign to any courses. ");
					
					break;

				case "assignstudent":
					
					int stuIDassign = Integer.parseInt(value[2]);
					String stucoursecode = value[3];
					
//					if(stucoursecode.equals())){
//						System.out.println(CourseList.getCourseName()+"is full.");
//					}
					int counter = 0;
					counter++;
					
					break;
				    
				case "reportinstructor":
				
					int intructorIDreport = Integer.parseInt(value[2]);
					
					Instructor instructor1 = Instructor.AddInstructor(intructorIDreport);
					
					System.out.println(instructor1.getTitle()+" "
					                  +instructor1.getName()+" - "+intructorIDreport);
				
					for(int i = 0 ; i<InstructorList.size() ;i++) {
						System.out.println(InstructorList.get(i)); 	//eksik
					}
					
				    break;
				
				case "reportcourse":
				
					String courseCodeReport = value[2];
					
					Course course1 = Course.AddCourse(courseCodeReport);
					
					System.out.println(courseCodeReport+" - " +course1.getCourseName()+ " - " +course1.getYear()+course1.getSemester());
					System.out.println("Capacity: "+course1.getCourseCapacity());
					if(course1.getInstructor().equals(null)) {
						System.out.println("Lecturer: Not Assigned Yet.");
					}
					else {
						System.out.println("Lecturer: "+course1.getInstructor().getTitle()+" "+course1.getInstructor().getName());
					}
				    break;
				
				case "reportTA":
					
					int taIDreport = Integer.parseInt(value[2]); 
					
					Assistant report = TeachingAssistant.AddTeAssistant(taIDreport);
					
					System.out.println("("+report.getDegree()+")"+report.getName()+" - "+taIDreport);
					
					for(int i = 0 ; i<TeachingAssistantList.size() ;i++){ //tam deðil
						System.out.println(CourseList.get(i).getCourseCode()+" - "+CourseList.get(i).getCourseName());
					}
					
					
					break;
				
				case "reportRA":
					
					int raIDreport = Integer.parseInt(value[2]); 
					
					Assistant reportra = ResearchAssistant.AddReAssistant(raIDreport);
					
					System.out.println("("+reportra.getDegree()+")"+reportra.getName()+" - "+raIDreport);
					
					for(int i = 0 ; i<AssistantList.size() ;i++){ //tam deðil
						System.out.println(CourseList.get(i).getCourseCode()+" - "+CourseList.get(i).getCourseName());
					}
					
					
					break;
					
				case "reportstudent":
					
					int stuIDreport = Integer.parseInt(value[2]);
					//for(int i = 0 ; i<StudentList.size() ;i++) {
						System.out.println(StudentList.get(stuIDreport).getYear()+" "+StudentList.get(stuIDreport).getName()+" - "+stuIDreport);
						System.out.println("Courses: "+CourseList.get(stuIDreport).getCourseCode());
					//}
					
					break;
				
				case "changeyear":
					
					int changeYear = Integer.parseInt(value[2]);
					programYear=changeYear;
					System.out.println("success");
					System.out.println("Program Year: "+changeYear);
					break;
					
			}
			input = scan.nextLine();
			value = input.split(";"); 
			comm = value[0]+value[1];
		}
		System.out.println("Unknown command");	
}
	
}
