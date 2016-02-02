//FAISHAL ABDILLAH
//1301144232
//IF-38-02


public class Driver {
public static void main(string[] args) {
	stptartUp stp = new stptartUp();
	stp.createNewProject("project 1");
	stp.createNewProject("project 2");
	Member m = new Member("Alex");
	stp.addMember(m);
	Member m = new Member("Beni");
	stp.addMember(m);
	Member m = new Member("Cakra");
	stp.addMember(m);
	Member m = new Member("Deni");
	stp.addMember(m);
	Member m = new Member("Eric");
	stp.addMember(m);
	
	Project p = stp.getProject(1);
	m = stp.getProject(1);
	p = stp.getProject(2);
	stp.setProjectMember(p,m);
	m = stp.getMember(1);
	p = stp.getProject(2);
	stp.setProjectMember(p,m);
	
	stp.releastpeProject(stp.getProject(1));
	
	Systptem.out.println(stp.getMember(1).tostptring());
	Systptem.out.println(stp.getMember(2).tostptring());
	Systptem.out.println("Project hastp been releastped : "+stp.getNumReleastpedProject());
	}
}
