/* NAMA : ANGKY FAJRIATI MS MUSA
   KELAS : IF-38-01
   NIM : 1301141221
*/

public class Driver{
	public static void main(String[] args) {
		StartUp stp1=new StartUp();
		StartUp stp2=new StartUp();
		
		Member m1=new Member("Angky");
		Member m2=new Member("Fajriati");
		Member m3=new Member("MS");
		Member m4=new Member("Musa");
		Member m5=new Member("Yooo");
		
		stp1.addMember(m1);
		stp1.addMember(m2);
		stp2.addMember(m3);
		stp2.addMember(m4);
		stp2.addMember(m5);
		
		stp1.createNewProject("OZON");
		stp1.createNewProject("ACTION");
		
		stp2.createNewProject("20th");
		
		Project sp1=stp1.getProject(0);
		Project sp2=stp1.getProject(1);
		Project sp3=stp2.getProject(0);
		
		Member mm1=stp1.getMember(0);
		stp1.setProjectMember(sp1,mm1);
		Member mm2=stp1.getMember(1);
		stp1.setProjectMember(sp2,mm2);
		Member mm3=stp2.getMember(0);
		stp2.setProjectMember(sp3,mm3);
		Member mm4=stp2.getMember(1);
		stp2.setProjectMember(sp3,mm4);
		Member mm5=stp2.getMember(2);
		stp2.setProjectMember(sp3,mm5);
		stp1.releaseProject(stp1.getProject(1));
		
		System.out.println("Startup-1 : ");
		System.out.println(stp1.getMember(0).toString());
		System.out.println(stp1.getMember(1).toString());
		System.out.println(stp1.getProject(0).toString());
		System.out.println(stp1.getProject(1).toString());
		System.out.println("Number of Released Project : "+stp1.getReleasedProject());
		
		System.out.println();
		
		System.out.println("Startup-2 : ");
		System.out.println(stp2.getMember(0).toString());
		System.out.println(stp2.getMember(1).toString());
		System.out.println(stp2.getMember(2).toString());
		System.out.println(stp2.getProject(0).toString());
		System.out.println("Number of Released Project : "+stp2.getReleasedProject());
		
	}
}
