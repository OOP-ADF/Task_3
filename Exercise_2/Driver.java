//Sulistiyo TR 1301144329 IF-38-09

public class Driver 
{
	public static void main(String[] args ) 
	{
		StartUp stp = new StartUp();
		Member m = new Member("Alex");
		stp.addMember(m);
		m = new Member("Beni");
		stp.addMember(m);
		m = new Member("Cakra");
		stp.addMember(m);
		m = new Member("Deni");
		stp.addMember(m);
		m = new Member("Eric");
		stp.addMember(m);
			
		stp.createNewProject("Project1");
		stp.createNewProject("Project2");
			
		Project p = stp.getProject(0);
		m = stp.getMember(0);
		stp.setProjectMember(p,m);
			
		stp.releaseProject(stp.getProject(1));
			
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(1).toString());
		System.out.println(stp.getMember(2).toString());
		System.out.println(stp.getMember(3).toString());
		System.out.println(stp.getMember(4).toString());
		System.out.println("Number of project released : "+stp.getNumReleasedProject());
	}
}
