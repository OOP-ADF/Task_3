//[IF-38-09]_1301144139_I Komang Hendra Wijaya Kusuma

public class Driver 
 {
 	public static void main(String[] args ) 
 	{
 		StartUp stp = new StartUp();
		Member m = new Member("I Komang","Dokter");
		stp.addMember(m);
		m = new Member("Hendra");
		stp.addMember(m);
		m = new Member("Wijaya","Tinju");
		stp.addMember(m);
		m = new Member("Kusuma");
		stp.addMember(m);
		m = new Member("Negara");
		stp.addMember(m);
		
		
		stp.createNewProject("Project 1");
		stp.createNewProject("Project 2");
			
		Project p = stp.getProject(0);
		m = stp.getMember(0);
		stp.setProjectMember(p, m);
		p = stp.getProject(2);
		
		m = stp.getMember(3);
		stp.setProjectMember(p, m);
		p = stp.getProject(0);
		
		stp.releaseProject(stp.getProject(1));
			
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(2).toString());
		System.out.println(stp.getMember(0).toString());
 		System.out.println(stp.getMember(1).toString());
		System.out.println(stp.getMember(2).toString());
 		System.out.println("Number of project released : "+stp.getNumReleasedProject());
	}
}
