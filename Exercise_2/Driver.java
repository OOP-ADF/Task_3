/*Nama : Zulvan Firdaus Imanullah
NIM : 1301142292*/

public class Driver {
	public static void main(String[] args) {
		StartUp stp=new StartUp();
		
		Member m1=new Member("Alex","Menghitung");
		Member m2=new Member("Beni","Lari");
		Member m3=new Member("Cakra","Ngoding");
		Member m4=new Member("Deni","Makan");
		Member m5=new Member("Eric","Jalan-jalan");
		stp.addMember(m1); //0
		stp.addMember(m2); //1
		stp.addMember(m3); //2
		stp.addMember(m4); //3
		stp.addMember(m5); //4
		
		stp.createNewProject("project1");
		stp.createNewProject("project2");
		
		Project p = stp.getProject(0);
		Member m = stp.getMember(0);
		stp.setProjectMember(p,m);
		
		p = stp.getProject(0);
		m = stp.getMember(1);
		stp.setProjectMember(p,m);
		
		p = stp.getProject(0);
		m = stp.getMember(3);
		stp.setProjectMember(p,m);
		
		p = stp.getProject(1);
		m = stp.getMember(1);
		stp.setProjectMember(p,m);
		
		p = stp.getProject(1);
		m = stp.getMember(2);
		stp.setProjectMember(p,m);
		
		p = stp.getProject(1);
		m = stp.getMember(3);
		stp.setProjectMember(p,m);
		
		p = stp.getProject(1);
		m = stp.getMember(4);
		stp.setProjectMember(p,m);
		
		stp.releaseProject(stp.getProject(0));
		
		for(int i=0;i<5;i++) {
			System.out.println(stp.getMember(i).toString());
		}
		for(int i=0;i<2;i++) {
			System.out.println(stp.getProject(i).toString());
		}
		System.out.println("released project: "+stp.getNumReleasedProject());
	}
}
