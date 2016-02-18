/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver32;

/**
 *
 * @author mahasiswabelajar7[1301144342]
 * Class : IF 38 02
 * Date : 2/2/2016
 */
public class Driver32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartUp stp1=new StartUp();
		StartUp stp2=new StartUp();
		
		Member m1=new Member("Fajar");
		Member m2=new Member("Hariyanto");
		Member m3=new Member("Aswin");
		Member m4=new Member("Agung");
		Member m5=new Member("Akmal");
		
		stp1.addMember(m1);
		stp1.addMember(m2);
		stp2.addMember(m3);
		stp2.addMember(m4);
		stp2.addMember(m5);
		
		stp1.createNewProject("DOTA");
		stp1.createNewProject("DOTO");
		
		stp2.createNewProject("DOTA REBORN");
		
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

