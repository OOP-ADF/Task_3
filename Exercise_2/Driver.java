//Name : Luthfi Fauzani Ahmad
//NIM  : 130140029
//Class: IF-38-09

public class Driver {
 	public static void main(String[] args) {
 		StartUp stp = new StartUp();
 		Member m1 = new Member("Alex", "Programmer");
 		Member m2 = new Member("Beni", "Designer");
 		Member m3 = new Member("Cakra", "Manager");
 		Member m4 = new Member("Deni");
 		Member m5 = new Member("Eric");
 
 		stp.addMember(m1);
 		stp.addMember(m2);
 		stp.addMember(m3);
 		stp.addMember(m4);
 		stp.addMember(m5);
 		stp.createNewProject("Project1");
 		stp.createNewProject("Project2");
 
 		stp.getMember(4).setSpecialization("Programmer");
 		stp.getMember(5).setSpecialization("Designer");
 
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
 
 		int flag = 1;
 		while(stp.getMember(flag) != null) {
 			System.out.println(stp.getMember(flag).toString());
 			flag++;
 		}
 		System.out.println();
 		flag = 1;
 		while(stp.getProject(flag) != null) {
 			System.out.println(stp.getProject(flag).toString());
 			flag++;
 		}
 		System.out.println();
 		System.out.println("Released project number : " + stp.getNumReleasedProject());
 	}
 }

