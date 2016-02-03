/*
Name : Erwin Yulizar F
NIM  : 1301144031
Class: IF-38-01
*/

public class Driver{
	public static void main(String[] args){
		StartUp stp = new StartUp();
		
		Member m = new Member("Alex");
		stp.addMember(m);
		Member m1 = new Member("Beni");
		stp.addMember(m1);
		Member m2 = new Member("Cakra");
		stp.addMember(m2);
		Member m3 = new Member("Deni");
		stp.addMember(m3);
		Member m4 = new Member("Eric");
		stp.addMember(m4);
		
		stp.createNewProject("Project 1");
		stp.createNewProject("Project 2");
		
		Project p1 = stp.getProject(0);
		stp.setProjectMember(p1,m);
		stp.setProjectMember(p1,m1);
		stp.setProjectMember(p1,m3);
		
		Project p2 = stp.getProject(1);
		stp.setProjectMember(p2,m1);
		stp.setProjectMember(p2,m2);
		stp.setProjectMember(p2,m3);
		
		stp.releaseProject(stp.getProject(1));
		
		System.out.println("List Member");
		for (int i=0; i<stp.getAllMember(); i++){
			System.out.println(stp.getMember(i).toString());
		}
		
		System.out.println("List Member");
		for (int i=0 ; i<stp.getNumReleasedProject(); i++){
			System.out.println(stp.getProject(i).toString());
		}
		
		System.out.println("Released Project in StartUp : "+stp.getNumReleasedProject());
	}
}
