/**
 * Nama : Reza Muhammad K
 * Nim  : 1301144332
 */
 
public class Driver{
	public static void main(String[] args){
		StartUp stp = new StartUp();
		Member m = new Member("Alex","Programming");
		stp.addMember(m);
		m = new Member("Beni");
		stp.addMember(m);
 		m = new Member("Cakra");
 		stp.addMember(m);
		m = new Member("Deni");
		stp.addMember(m);
		m = new Member("Eric");
 		stp.addMember(m);
		stp.createNewProject("project 1");
 		stp.createNewProject("project 2");
		Project p = stp.getProject(0);
		m = stp.getMember(0);
		stp.setProjectMember(p, m);
        p = stp.getProject(1);
        stp.setProjectMember(p, m);
         
        m = stp.getMember(0);
        p = stp.getProject(0);
        stp.setProjectMember(p, m);
		stp.releaseProject(stp.getProject(0));
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getProject(1).toString());
		System.out.println("Project released : "+stp.getNumReleasedProject());
	}
}