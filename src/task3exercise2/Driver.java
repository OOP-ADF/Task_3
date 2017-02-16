package exercise2;
 /** 
     * NIM 1 : 1301150082
     * NIM 2 : 1301154320
     * NIM 3 : 1301154474
    */
public class Driver {
public static void main(String[] args) {
    StarUp Ganteng = new StarUp();
    Member a;
    Project b;
    // 5 new member object
    // name = Alex, Alwi, Ipul, Doni, Yogs;
    // add to StarUp stp
    a = new Member("Alex");
    Ganteng.addMember( a );
    Member m = new Member("Alwi");
    Ganteng.addMember( a );
    
    Ganteng.createNewProject ("project1");
    Ganteng.createNewProject ("project2");
    
    b = Ganteng.getProject(0);
    a = Ganteng.getMember(0);
    b.addMember(a);
    a = Ganteng.getMember (1);
    b.addMember(a);
    
    //add Alwi, Ipul, Doni, Yogs
    b = Ganteng.getProject (1);
    a = Ganteng.getMember (1);
    b.addMember(a);
    a = Ganteng.getMember(2);
    b.addMember(m);
    
    b = Ganteng.getProject(1);
    Ganteng.releaseProject(b);
    
    System.out.println(Ganteng.getMember(0));
    System.out.println(Ganteng.getMember(1));
    
    System.out.println(Ganteng.getProject(0));
    System.out.println(Ganteng.getProject(1));
    }
    
}
