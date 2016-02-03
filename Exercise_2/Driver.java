public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartUp stp=new StartUp();
        Member m1=new Member("Alex","Project Manager");
        stp.addMember(m1);
        Member m2=new Member("Beni","Designer");
        stp.addMember(m2);
        Member m3=new Member("Cakra","Programmer");
        stp.addMember(m3);
        Member m4=new Member("Deni","Project Manager");
        stp.addMember(m4);
        Member m5=new Member("Eric","Programmer");
        stp.addMember(m5);
        
        stp.createNewProject("Eden");
        stp.createNewProject("Eve");
        
        Project p1=stp.getProject(0);
        Project p2=stp.getProject(1);
        
        Member mm1=stp.getMember(0);
        stp.setProjectMember(p1, m1);
        Member mm2=stp.getMember(1);
        stp.setProjectMember(p1, m2);
        Member mm3=stp.getMember(2);
        stp.setProjectMember(p1, m3);
        Member mm4=stp.getMember(0);
        stp.setProjectMember(p2, m4);
        Member mm5=stp.getMember(1);
        stp.setProjectMember(p2, m5);
        stp.releaseProject(stp.getProject(1));
        
        System.out.println("Start-up details: ");
        System.out.println(stp.getProject(0).toString());
        System.out.println("Project members: ");
        System.out.println(stp.getMember(0).toString());
        System.out.println(stp.getMember(1).toString());
        System.out.println(stp.getMember(2).toString());
        System.out.println("The number of app(s) released: "+stp.getNumReleasedProject());
        
        System.out.println();
        
        System.out.println("Start-up details: ");
        System.out.println(stp.getProject(1).toString());
        System.out.println("Project members: ");
        System.out.println(stp.getMember(3).toString());
        System.out.println(stp.getMember(4).toString());
        System.out.println("The number of app(s) released: "+stp.getNumReleasedProject());
        
    }
    
}

