
/* Thoriq Abdul Aziz
	1301144341
	IF-38-01
*/
public class Driver{
	public static void main(String[] args){
		StartUp stp = new StartUp();
		Member m = new Member("Alex");
		Member m1 = new Member("Beni","Programmer");
		Member m2 = new Member("Cakra","NEtwork Administrator");
		Member m3 = new Member("Doni","Analyst");
		Member m4 = new Member("Eric","Project Manager");
		m1.setSpecialization("Analyst");	
		stp.addMember(m);
		stp.addMember(m1);
		stp.addMember(m2);
		stp.addMember(m3);
		stp.addMember(m4);
		stp.createNewProject("Project 1");
		stp.createNewProject("Project 2");
		stp.setProjectMember(stp.getProject(0), stp.getMember(0));
		stp.setProjectMember(stp.getProject(0), stp.getMember(1));
		stp.setProjectMember(stp.getProject(0), stp.getMember(3));
		stp.setProjectMember(stp.getProject(1), stp.getMember(1));
		stp.setProjectMember(stp.getProject(1), stp.getMember(2));
		stp.setProjectMember(stp.getProject(1), stp.getMember(3));
		stp.setProjectMember(stp.getProject(1), stp.getMember(4));

		stp.getMember(0).setProjectWorked(2);
		stp.getMember(1).setProjectWorked(2);
		stp.getMember(2).setProjectWorked(1);
		stp.getMember(3).setProjectWorked(1);
		stp.getMember(4).setProjectWorked(1);

		stp.releaseProject(stp.getProject(1));
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(1).toString());
		System.out.println(stp.getMember(2).toString());
		System.out.println(stp.getMember(3).toString());
		System.out.println (stp.getMember(4).toString());
		
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getProject(1).toString());
		System.out.println("Released project: " + stp.getNumReleasedProject());

	}
}
