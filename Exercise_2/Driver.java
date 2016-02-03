/*
*name  : I Putu Prima Ananda
*class : IF-38-01
*NIM   : 1301144291
*/
import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		StartUp stp = new StartUp();
		Member m1 = new Member("alex");
		stp.addMember(m1);
		Member m2 = new Member("Beni");
		stp.addMember(m2);
		Member m3 = new Member("Cakra");
		stp.addMember(m3);
		Member m4 = new Member("Deni");
		stp.addMember(m4);
		Member m5 = new Member("Eric");
		stp.addMember(m5);
		stp.createNewProject("project1");
		Project p1 = stp.getProject(0);
		stp.createNewProject("project2");
		Project p2 = stp.getProject(1);
		m1 = stp.getMember(0);
		m2 = stp.getMember(1);
		m3 = stp.getMember(2);
		m4 = stp.getMember(3);
		m5 = stp.getMember(4);
		m1.setSpecialization("project1");
		m2.setSpecialization("project1 and project2");
		m3.setSpecialization("project1 and project2");
		m4.setSpecialization("project1 and project2");
		m5.setSpecialization("project2");
		m1.setProjectWorked();
		m2.setProjectWorked();
		m2.setProjectWorked();
		m3.setProjectWorked();
		m3.setProjectWorked();
		m4.setProjectWorked();
		m4.setProjectWorked();
		m5.setProjectWorked();
		stp.setProjectMember(p1,m1);
		stp.setProjectMember(p1,m2);
		stp.setProjectMember(p1,m4);
		stp.setProjectMember(p2,m2);
		stp.setProjectMember(p2,m3);
		stp.setProjectMember(p2,m4);
		stp.setProjectMember(p2,m5);
		stp.releaseProject(stp.getProject(1));
		for(int i =0; i<5; i++){
			System.out.println(stp.getMember(i).toString());
		}
		for(int i =0; i<2; i++){
			System.out.println(stp.getProject(i).toString());
		}
		System.out.println();
		System.out.println("Number of Released Project : "+stp.getNumReleasedProject());
	}
}
