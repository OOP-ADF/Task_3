/* RIZMA NURVIARELDA
1301144229
IF 38 09
*/

public class Driver {
	public static void main(String[] args) {
		StartUp s = new StartUp();
		Member y = new Member("Alex");
		s.addMember(y);
		y = new Member("Beni");
		s.addMember(y);
		y = new Member("Cakra");
		s.addMember(y);
		y = new Member("Deni");
		s.addMember(y);
		y = new Member("Eric");
		s.addMember(y);
			
		s.createNewProject("Project1");
		s.createNewProject("Project2");
			
		Project p = s.getProject(0);
		y = s.getMember(0);
		s.setProjectMember(p,y);
			
		s.releaseProject(s.getProject(1));
			
		System.out.println(s.getMember(0).toString());
		System.out.println(s.getMember(1).toString());
		System.out.println(s.getMember(2).toString());
		System.out.println(s.getMember(3).toString());
		System.out.println(s.getMember(4).toString());
		System.out.println("Number of project released : "+s.getNumberReleasedProject());
	}
}
