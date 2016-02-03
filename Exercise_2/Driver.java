// Rana Renes Rengga-1301144351 (IF-38-01)

public class Driver
{
	public static void main(String[] args)
	{
		StartUp stp = new StartUp();
		Member m1 = new Member("Alex", "Java");
		Member m2 = new Member("Beni", "Pascal");
		Member m3 = new Member("Cakra", "Database");
		Member m4 = new Member("Deni");
		Member m5 = new Member("Eric");
		stp.addMember(m1);
		stp.addMember(m2);
		stp.addMember(m3);
		stp.addMember(m4);
		stp.addMember(m5);

		stp.createNewProject("project1");
		stp.createNewProject("project2");

		Project p1 = stp.getProject(0);
		stp.setProjectMember(p1, m1);
		stp.setProjectMember(p1, m2);
		stp.setProjectMember(p1, m4);

		Project p2 = stp.getProject(1);	
		stp.setProjectMember(p2, m2);
		stp.setProjectMember(p2, m3);
		stp.setProjectMember(p2, m4);
		stp.setProjectMember(p2, m5);

		stp.getMember(0).setProjectWorked(1);
		stp.getMember(1).setProjectWorked(2);
		stp.getMember(2).setProjectWorked(1);
		stp.getMember(3).setProjectWorked(2);
		stp.getMember(4).setProjectWorked(1);

		stp.releaseProject(stp.getProject(1));

		for (int i=0; i<=4; i++) 
		{
			System.out.println(stp.getMember(i).toString());
		}
		System.out.println();

		for (int j=0; j<=1; j++)
		{
			System.out.println(stp.getProject(j).toString());
		}
		System.out.println();
		System.out.println("Released project: " + stp.getNumReleasedProject());
	}
}