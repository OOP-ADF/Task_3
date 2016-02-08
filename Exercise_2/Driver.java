/*
Hani Dika Riani
1301144012
IF-38-02
*/


public class Driver {
	public static void main(String [] args){
		StartUp stp = new StartUp();
		Member m1 = new Member("Hani");
		Member m2 = new Member("Dika");
		Member m3 = new Member("Riani");
		Member m4 = new Member("Mekel");
		Member m5 = new Member("Agus");
		stp.addMember(m1);
		stp.addMember(m2);
		stp.addMember(m3);
		stp.addMember(m4);
		stp.addMember(m5);
		stp.createNewProject("projecta");
		stp.createNewProject("projectb");
		Project p1 = stp.getProject(0);
		Project p2 = stp.getProject(0);
		Member mm1 = stp.getMember(0);
		stp.setProjectMember(p1,mm1);
		stp.releaseProject(stp.getProject(0));
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getProject(0).toString());
	}
}
