//DHIVA AZHARA 1301144101 IF-38-01

public class Driver {

    public static void main(String[] args) {
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
        
        stp.createNewProject("Project 1");
        stp.createNewProject("Project 2");
        
        Project p1 = stp.getProject(0);
        Project p2 = stp.getProject(1);
        
        m1 = stp.getMember(0);
        m2 = stp.getMember(1);
        m3 = stp.getMember(2);
        m4 = stp.getMember(3);
        m5 = stp.getMember(4);
        stp.setProjectMember(p1, m1);
        stp.setProjectMember(p1, m2);
        stp.setProjectMember(p1, m4);
        stp.setProjectMember(p2, m3);
        stp.setProjectMember(p2, m5);
        
        stp.releaseProject(stp.getProject(1)); 
        
        System.out.println(stp.getMember(0).toString());
        System.out.println(stp.getMember(1).toString());
        System.out.println(stp.getMember(2).toString());
        System.out.println(stp.getMember(3).toString());
        System.out.println(stp.getMember(4).toString());
        System.out.println();
        System.out.println(stp.getProject(0).toString());
        System.out.println(stp.getProject(1).toString());
    }
    
}
