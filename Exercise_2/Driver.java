//Dzakyta Afuzagani
//1301140122
//IF 38 02

public class Driver{
		public static void main(String[] args){
			StartUp stp= new StartUp();
			Member m = new Member("Alex");
			stp.addMember(m);
			Member m1 = new Member("Beni");
			stp.addMember(m);
			Member m2 = new Member("Cakra");
			stp.addMember(m);
			Member m3 = new Member("Deni");
			stp.addMember(m);
			Member m4 = new Member("Eric");
			stp.addMember(m);
				
			stp.createNewProject("Project 1");
			stp.createNewProject("Project 2");
			
			project pro = stp.getProject(0);
			Member m = stp.getMember(0);
			stp.setProjectMember(pro,m);
			
			stp.releaseProject(stp.getProject(1));
			
			System.out.println(stp.getMember(0).toString());
			System.out.println(stp.getMember(1).toString());
			System.out.println(stp.getMember(2).toString());
			System.out.println(stp.getMember(3).toString());
			System.out.println(stp.getMember(4).toString());
			System.out.println(stp.getProject(0).toString());
			System.out.println(stp.getProject(1).toString());
			System.out.println(stp.getProject(2).toString());
			System.out.println("Number of Released Project is  ");
			
		}
		
		
		
		
}
