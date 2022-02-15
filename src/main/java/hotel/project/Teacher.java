package hotel.project;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

class TeacherData{
	private String name;
	private int age;
	
	
	public TeacherData() {
		super();
		
	}
	public TeacherData(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


@Path("teacher")
public class Teacher {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllTeachers(TeacherData teacherData) {
		System.out.println(teacherData.getName() + " " + teacherData.getAge());
		return "teacher";
	}

}
