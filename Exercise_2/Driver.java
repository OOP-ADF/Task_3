//Name 		 : Mohammad Zakie Faiz Rahiemy
//Student ID : 1301144422
//Class 	 : IF-38-02

public class Driver {
	public static void main(String[] args) {
		StartUp movelutionLab=new StartUp();
		Member faiz = new Member("Faiz");
		Member ubay = new Member("Ubay");
		Member ryan = new Member("Ryan");
		Member jek = new Member("Jek");
		Member kromeng =new Member("Kromeng");
		movelutionLab.addMember(faiz);
		movelutionLab.addMember(ubay);
		movelutionLab.addMember(ryan);
		movelutionLab.addMember(jek);
		movelutionLab.addMember(kromeng);
		movelutionLab.createNewProject("Indirect");
		movelutionLab.createNewProject("Revolusi");
		Project p = movelutionLab.getProject(0);
		Member m = movelutionLab.getMember(0);
		movelutionLab.setProjectMember(p,m);
		p = movelutionLab.getProject(0);
		m = movelutionLab.getMember(1);
		movelutionLab.setProjectMember(p,m);
		p = movelutionLab.getProject(0);
		m = movelutionLab.getMember(3);
		movelutionLab.setProjectMember(p,m);
		p = movelutionLab.getProject(1);
		m = movelutionLab.getMember(1);
		movelutionLab.setProjectMember(p,m);
		p = movelutionLab.getProject(1);
		m = movelutionLab.getMember(2);
		movelutionLab.setProjectMember(p,m);
		p = movelutionLab.getProject(1);
		m = movelutionLab.getMember(3);
		movelutionLab.setProjectMember(p,m);
		p = movelutionLab.getProject(1);
		m = movelutionLab.getMember(4);
		movelutionLab.setProjectMember(p,m);
		movelutionLab.releaseProject(movelutionLab.getProject(1));
		for (int i=0;i<movelutionLab.getNMember();i++){
			System.out.println(movelutionLab.getMember(i).toString());
		}
		for (int i=0;i<movelutionLab.getNProject();i++){
			System.out.println(movelutionLab.getProject(i).toString());
		}
		System.out.println("Number of released project: "+movelutionLab.getNumReleasedProject());
	}
}
