/*
Nama:	Aryaditya Hendri Pratama
Kelas:	IF3802
NIM:	1301144162
*/

public class Driver {
 	public static void main(String[] args) {
 		StartUp stp = new StartUp();
 		Member m = new Member("Alex","Pilot");
 		stp.addMember(m);
 		m = new Member("Rangga","Fighter");
 		stp.addMember(m);
 		m = new Member("Beni");
 		stp.addMember(m);
 		m = new Member("Dion");
 		stp.addMember(m);
 		stp.createNewProject("Project1");
 		stp.createNewProject("Project2");
         
         Project p = stp.getProject(0);
         m = stp.getMember(2);
         stp.setProjectMember(p, m);
         p = stp.getProject(1);
 		m = stp.getMember(1);
         stp.setProjectMember(p, m);
         p = stp.getProject(0);
         m = stp.getMember(3);
         stp.setProjectMember(p, m);
         
         stp.releaseProject(stp.getProject(1));
         
         System.out.println(stp.getMember(0).toString());
         System.out.println(stp.getMember(3).toString());
         System.out.println(stp.getProject(0).toString());
         System.out.println(stp.getProject(1).toString());
         System.out.println("Project released : "+stp.getNumReleasedProject());
 	}
 }
