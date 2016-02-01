//Anggi Agustian - 1301144149

public class Driver {
	public static void main(String[] args) {
		StartUp strup = new StartUp();
		Member a = new Member("Anggi","Insinyur");
		strup.addMember(a);
		a = new Member("Agustian","Pembangun");
		strup.addMember(a);
		a = new Member("Sutisna");
		strup.addMember(a);
		a = new Member("Uus");
		strup.addMember(a);
		strup.createNewProject("TUBES OOP");
		strup.createNewProject("TUBES PBO");
        
        Project p = strup.getProject(1);
        a = strup.getMember(2);
        strup.setProjectMember(p, a);
        p = strup.getProject(3);
		a = strup.getMember(1);
        strup.setProjectMember(p, a);
        p = strup.getProject(5);
        a = strup.getMember(1);
        strup.setProjectMember(p, a);
        
        strup.releaseProject(strup.getProject(1));
        
        System.out.println(strup.getMember(2).toString());
        System.out.println(strup.getMember(0).toString());
        System.out.println(strup.getProject(3).toString());
        System.out.println(strup.getProject(2).toString());
        System.out.println("Project released : "+strup.getNumReleasedProject());
	}
}
