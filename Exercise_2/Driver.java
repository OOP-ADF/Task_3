//Agung Suhendar_1301140279_IF 38-09

public class Driver{	
	public static void main(String[] args){
		StartUp Stp = new StartUp();
		Member m = new Member("Agung","java");
		Stp.addMember(m);
		m = new Member("Agung2","C++");
		Stp.addMember(m);
		m = new Member("Agung3","PHP");
		Stp.addMember(m);
		m = new Member("Suhendar","java");
		Stp.addMember(m);
		m = new Member("Suhendar2","C++");
		Stp.addMember(m);
		
		Stp.createNewProject("Project1");
		Stp.createNewProject("Project2");
			
		Project p = Stp.getProject(0);
		m = Stp.getMember(0);
		Stp.setProjectMember(p, m);
		
		Stp.releaseProject(Stp.getProject(1));
			
		System.out.println(Stp.getMember(0).toString());
		System.out.println(Stp.getMember(1).toString());
		System.out.println(Stp.getMember(2).toString());
		System.out.println(Stp.getMember(3).toString());
		System.out.println(Stp.getMember(4).toString());
 		System.out.println(Stp.getProject(0).toString());
		System.out.println(Stp.getProject(1).toString());
 		System.out.println("Number of released project : "+Stp.getNumReleasedProject());
	}
}
