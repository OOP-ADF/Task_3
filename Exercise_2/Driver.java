//Agung Rahmat Budiman
//1301144142
//IF-38-02

public class Driver {
	public static void main(String[] args) {
		StartUp stp = new StartUp();
		Member m = new Member("Alex","Gaming");
		stp.addMember(m);
		m = new Member("Beni");
		stp.addMember(m);
		m = new Member("Cakra");
		stp.addMember(m);
		m = new Member("Deni");
		stp.addMember(m);
		m = new Member("Eric","Masak");
		stp.addMember(m);
		stp.createNewProject("project 1");
		stp.createNewProject("project 2");
        
        Project p = stp.getProject(0);
        m = stp.getMember(0);
        stp.setProjectMember(p, m);
        p = stp.getProject(1);
        stp.setProjectMember(p, m);
        
        m = stp.getMember(4);
        p = stp.getProject(0);
        stp.setProjectMember(p, m);
        
        stp.releaseProject(stp.getProject(0));
        
        System.out.println(stp.getMember(0).toString());
        System.out.println(stp.getMember(4).toString());
        System.out.println(stp.getProject(0).toString());
        System.out.println(stp.getProject(1).toString());
        System.out.println("Project released : "+stp.getNumReleasedProject());
	}
}
