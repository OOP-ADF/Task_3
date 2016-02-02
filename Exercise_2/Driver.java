/*
	Riksa Meidy Karim
	1301142289
	IF-38-09
*/

public class Driver{
	public static void main(String[] args){
		StartUp idrain = new StartUp();
		Member m1 = new Member("Dodi");
		Member m2 = new Member("Joni");
		Member m3 = new Member ("Grace");
		Member m4 = new Member ("Yusuf");
		Member m5 = new Member ("Terry");
		
		idrain.addMember(m1);
		idrain.addMember(m2);
		idrain.addMember(m3);
		idrain.addMember(m4);
		idrain.addMember(m5);
		
		idrain.createNewProject("Project One");
		idrain.createNewProject("Project Two");
		Project p0 =idrain.getProject(0);
		Project p1 = idrain.getProject(1);
		
		Member me0 = idrain.getMember(0);
		Member me1 = idrain.getMember(1);
		Member me2 = idrain.getMember(2);
		Member me3 = idrain.getMember(3);
		Member me4 = idrain.getMember(4);
		
		idrain.setProjectMember(p0,me0);
		idrain.setProjectMember(p0,me4);
		
		idrain.setProjectMember(p1,me2);
		idrain.setProjectMember(p1,me3);
		idrain.setProjectMember(p1,me1);
		
		idrain.releaseProject(idrain.getProject(1));
		
		for(int i=0;i<idrain.getMemberCount();i++){
			System.out.println(idrain.getMember(i).toString());
		}
		
		for(int i=0;i<idrain.getProjectCount();i++){
			System.out.println(idrain.getProject(i).toString());
		}
		System.out.println("Number of Released Project: " + idrain.getNumReleasedProject());
	
	
	//my scenario
		idrain.createNewProject("Project Ex");
		Project p2 = idrain.getProject(2);
		idrain.setProjectMember(p2,me0);
		idrain.setProjectMember(p2,me1);
		idrain.setProjectMember(p2,me2);
		idrain.setProjectMember(p2,me3);
		idrain.releaseProject(idrain.getProject(2));
		for(int i=0;i<idrain.getMemberCount();i++){
			System.out.println(idrain.getMember(i).toString());
		}
		
		for(int i=0;i<idrain.getProjectCount();i++){
			System.out.println(idrain.getProject(i).toString());
		}
		System.out.println("Number of Released Project: " + idrain.getNumReleasedProject());
	}
		
		
		
}
