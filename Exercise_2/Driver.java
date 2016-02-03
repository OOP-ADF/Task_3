/*
Gentur Cipto Tri Atmaja
1301140239
IF 38-09
 */


public class Driver
{
    public static void main(String[] args)
    {
 	StartUp start = new StartUp();
 	Member m = new Member("Alex");
 	Member m1 = new Member("Beni"," Programmer 1 ");
 	Member m2 = new Member("Cakra","Programmer 2 ");
 	Member m3 = new Member("Doni"," Programmer 3 ");
 	Member m4 = new Member("Eric"," Programmer 4 ");
 	m1.setSpecialization("Project Manager");	
 	
        start.addMember(m);
 	start.addMember(m1);
 	start.addMember(m2);
 	start.addMember(m3);
	start.addMember(m4);
        
 	start.createNewProject("Project 1");
 	start.createNewProject("Project 2");
 	
        start.setProjectMember(start.getProject(0), start.getMember(0));
 	start.setProjectMember(start.getProject(0), start.getMember(1));
 	start.setProjectMember(start.getProject(0), start.getMember(3));
 	start.setProjectMember(start.getProject(1), start.getMember(1));
	start.setProjectMember(start.getProject(1), start.getMember(2));
 	start.setProjectMember(start.getProject(1), start.getMember(3));
 	start.setProjectMember(start.getProject(1), start.getMember(4));
 
 	start.getMember(0).setProjectWorked(2);
 	start.getMember(1).setProjectWorked(2);
 	start.getMember(2).setProjectWorked(1);
 	start.getMember(3).setProjectWorked(1);
 	start.getMember(4).setProjectWorked(1);
        
 	start.releaseProject(start.getProject(1));
        
        System.out.println();
 	System.out.println(start.getMember(0).toString());
 	System.out.println(start.getMember(1).toString());
 	System.out.println(start.getMember(2).toString());
 	System.out.println(start.getMember(3).toString());
 	System.out.println(start.getMember(4).toString());
 	
        System.out.println();
 	System.out.println(start.getProject(0).toString());
 	System.out.println(start.getProject(1).toString());
 	System.out.println("Project will be release on " + start.getNumReleasedProject());
 
    }
}

