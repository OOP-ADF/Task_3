//Muhammad Andika
//1301140145
//IF 38-09

public class Driver{
	public static void main(String[] args){
		StartUp stp = new StartUp();
		Member m1 = new Member("Alex", "Java Programming");
		stp.addMember(m1);
		Member m2 = new Member("Beni", "Web Developing");
		stp.addMember(m2);
		Member m3 = new Member("Cakra", "Software Engineering");
		stp.addMember(m3);
		Member m4 = new Member("Deni");
		stp.addMember(m4);
		Member m5 = new Member("Eric");
		stp.addMember(m5);
			
		stp.createNewProject("Project1");
		stp.createNewProject("Project2");

		stp.getMember(4).setSpecialization("Software Engineering");
		stp.getMember(5).setSpecialization("Java Programming");

		stp.setProjectMember(stp.getProject(1), stp.getMember(1));
		stp.setProjectMember(stp.getProject(1), stp.getMember(2));
		stp.setProjectMember(stp.getProject(1), stp.getMember(4));
		stp.setProjectMember(stp.getProject(2), stp.getMember(2));
		stp.setProjectMember(stp.getProject(2), stp.getMember(3));
		stp.setProjectMember(stp.getProject(2), stp.getMember(4));
		stp.setProjectMember(stp.getProject(2), stp.getMember(5));

		stp.getMember(1).setProjectWorked(1);
		stp.getMember(2).setProjectWorked(2);
		stp.getMember(3).setProjectWorked(1);
		stp.getMember(4).setProjectWorked(2);
		stp.getMember(5).setProjectWorked(1);

		stp.releaseProject(stp.getProject(2));

		int count = 1;
		while(stp.getMember(count) != null){
			System.out.println(stp.getMember(count).toString());
			count++;
		}
		System.out.println();
		count = 1;
		while(stp.getProject(count) != null){
			System.out.println(stp.getProject(count).toString());
			count++;
		}
		System.out.println();
		System.out.println("Number of released project : " + stp.getNumReleasedProject());
	}
}