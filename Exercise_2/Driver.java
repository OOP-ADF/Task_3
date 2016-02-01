/* 
Nama 	: Kevin Prakarsa B R
NIM  	: 1301144169
Kelas	: IF-38-09 
*/

public class Driver {
	public static void main(String[] args) {
		StartUp stp = new StartUp();
		member M = new member("Steve", "Apple");
		stp.addmember(M);
		
		M = new member("Mark","Facebook");
		stp.addmember(M);
		
		M = new Member("Bill", "Windows");
		stp.addmember(M);
		
		M= new member("Hastings", "Netflix");
		stp.addmember(M);
		
		stp.createNewProject("New Project 1");
		stp.createNewProject("New Project 2");
        
        project P = stp.getProject(0);
        M = stp.getmember(0);
        stp.setProjectMember(P, M);
        P = stp.getProject(0);
        
        stp.releaseProject(stp.getProject(1));
        
        System.out.println(stp.getmember(0).toString());
        System.out.println(stp.getmember(1).toString());
		System.out.println(stp.getmember(2).toString());
		System.out.println(stp.getmember(3).toString());
		System.out.println(stp.getmember(4).toString());
        System.out.println(stp.getProject(0).toString());
        System.out.println(stp.getProject(1).toString());
		System.out.println(stp.getProject(2).toString());
        System.out.println("Project released : "+stp.getNumReleasedProject());
	}
}
