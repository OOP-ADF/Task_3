//Nama		: Febby Febriansyah
//NIM		: 1301140371
//Kelas		: IF-38-01

public class Driver{
	public static void main(String[] args){
		StartUp stp = new StartUp();
		Member m1 = new Member("Alex","AI");
		stp.addMember(m1);
		Member m2 = new Member("Beni","Java");
		stp.addMember(m2);
		Member m3 = new Member("Cakra","Python");
		stp.addMember(m3);
		Member m4 = new Member("Deni","Pascal");
		stp.addMember(m4);
		Member m5 = new Member("Eric","C++");
		stp.addMember(m5);

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
		for(int i=0;i<5;i++){
			System.out.println(stp.getMember(i).toString());
		}
		for(int j=0;j<2;j++){
			System.out.println(stp.getProject(j).toString());
		}
		System.out.println(stp.getNumReleasedProject());
	}
}
