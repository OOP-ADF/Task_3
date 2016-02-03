
//atika w - 1301144211
public class Nom2{
	public static void main (String[] args){
		StartUp su = new StartUp();
		Member m1 = new Member("Alex");
		su.addMember(m1);
		Member m2 = new Member("Beni");
		su.addMember(m2);
		Member m3 = new Member("Cakra");
		su.addMember(m3);
		Member m4 = new Member("Deni");
		su.addMember(m4);
		Member m5 = new Member("Eric");
		su.addMember(m5);
		
		su.createNewProject("Project1");
		su.createNewProject("Project2");
		
		Project p1 = su.getProject(0);
		Project p2 = su.getProject(1);
		
		
		su.setProjectMember(p1,m1);
		su.setProjectMember(p1,m2);
		su.setProjectMember(p1,m4);
		su.setProjectMember(p2,m3);
		su.setProjectMember(p2,m5);
		
		su.releaseProject(su.getProject(1));
		
		System.out.println(su.getMember(0).toString());
		System.out.println(su.getProject(0).toString());
	

	}

}
