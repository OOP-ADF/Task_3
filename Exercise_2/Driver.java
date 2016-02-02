//Aliya Nur Rezkita (1301144161)
//IF-38-01

public class Driver2{
	public static void main(String[] args){
		StartUp stp = new StartUp();
		Member m1 = new Member("Alex");
		Member m2 = new Member("Beni");
		Member m3 = new Member("Cakra");
		Member m4 = new Member("Deni");
		Member m5 = new Member("Eric");
		stp.addMember(m1);
		stp.addMember(m2);
		stp.addMember(m3);
		stp.addMember(m4);
		stp.addMember(m5);
		stp.createNewProject("project1");
		stp.createNewProject("project2");
		Project p = stp.getProject(0);
        Member mp1 = stp.getMember(0);
        Member mp2 = stp.getMember(1);
        Member mp3 = stp.getMember(3);
        stp.setProjectMember(p, mp1);
        stp.setProjectMember(p, mp2);
        stp.setProjectMember(p, mp3);
        
        Project p2 = stp.getProject(1);
        Member mp4 = stp.getMember(1);
        Member mp5 = stp.getMember(2);
        Member mp6 = stp.getMember(3);
        Member mp7 = stp.getMember(4);
        stp.setProjectMember(p2, mp4);
        stp.setProjectMember(p2, mp5);
        stp.setProjectMember(p2, mp6);
        stp.setProjectMember(p2, mp7);
        
        stp.releaseProject( stp.getProject( 1 ) ); 
        System.out.println( stp.getMember( 1 ).toString() ); 
        System.out.println( stp.getProject( 0 ).toString() );
	}
}
