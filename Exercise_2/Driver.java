/*Nama: Adam Geraldy Katab
Kelas: IF-38-01
NIM: 1301140381*/

public class Driver {
	public static void main(String[] args) {
		StartUp stp = new StartUp();
		
		Member m = new Member("Alex", "Design");
		stp.addMember(m);
		m = new Member("Beni", "Java");
		stp.addMember(m);
		m = new Member("Cakra", "C++");
		stp.addMember(m);
		m = new Member("Deni");
		stp.addMember(m);
		m = new Member("Eric");
		stp.addMember(m);
		
		stp.createNewProject("project1");
		stp.createNewProject("project2");
		
		stp.setProjectMember(stp.getProject(0), stp.getMember(0));
		stp.setProjectMember(stp.getProject(0), stp.getMember(1));
		stp.setProjectMember(stp.getProject(0), stp.getMember(3));

		for(int i = 1; i < 5; i++)
			stp.setProjectMember(stp.getProject(1), stp.getMember(i));
		
		stp.releaseProject(stp.getProject(1));

		for(Member member: stp.getMemberList()) {
			if(member != null) {
				System.out.println(member.toString());
			}
		}
		
		for(Project proj: stp.getProjectList()) {
			if(proj != null) {
				System.out.println(proj.toString());
			}
		}
		
		stp.createNewProject("Hunger Games");
		m = new Member("Adam");
		stp.addMember(m);
		stp.setProjectMember(stp.getProject(2), m);
		System.out.println(stp.getProject(2).toString());
	}
}