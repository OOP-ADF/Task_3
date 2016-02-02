/*
Anita Auliani
1301144349
IF-38-09
*/

public class Driver {
	public static void main(String[] args) {

		StartUp stp = new StartUp();
		Member m = new Member("Alex");
		stp.addMember(m);
		
		stp.createNewProject("Project 1");
		stp.createNewProject("Project 2");
        
        Project p = stp.getProject(0);
        m = stp.getMember(0);
        stp.setProjectMember(p, m);
        p = stp.getProject(1);
		m = stp.getMember(1);
     
        
        stp.releaseProject(stp.getProject(1));
        
        System.out.println(stp.getMember(0).toString());
        System.out.println(stp.getProject(0).toString());
        System.out.println("Project released : "+stp.getNumReleasedProject());
	}
}