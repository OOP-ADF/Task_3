/* Deta Kurnia Soundra 1301140109 - IF 38 09 */
public class Driver {
	public static void main(String[] args) {
		StartUp stp = new StartUp();
		Member m = new Member("Alex","Udin");
		stp.addMember(m);
		m = new Member("Asep","Usman");
		stp.addMember(m);
		m = new Member("Danu");
		stp.addMember(m);
		m = new Member("Abah");
		stp.addMember(m);
		stp.createNewProject("Rekayasa Perangkat Lunak");
		stp.createNewProject("Algoritma Struktur Data");
        
        Project p = stp.getProject(0);
        m = stp.getMember(2);
        stp.setProjectMember(p, m);
        p = stp.getProject(1);
		m = stp.getMember(1);
        stp.setProjectMember(p, m);
        p = stp.getProject(0);
        m = stp.getMember(3);
        stp.setProjectMember(p, m);
        
        stp.releaseProject(stp.getProject(1));
        
        System.out.println(stp.getMember(0).toString());
        System.out.println(stp.getMember(3).toString());
        System.out.println(stp.getProject(0).toString());
        System.out.println(stp.getProject(1).toString());
        System.out.println("Project released : "+stp.getNumReleasedProject());
	}
}
