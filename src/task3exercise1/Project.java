package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154208
    // NAMA : Irvan Nur Apendi 
    // KELAS : IF-39-12
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
    private String projectName;
    private Member[] teamMember;
    private int nTeam;
    private boolean releaseStatus;
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154208
    // NAMA : Irvan Nur Apendi
    // KELAS : IF-39-12
    //
    //------------------- your code here-----------------------
    public Project(String projectName) {
    this.nTeam = 0;
    this.teamMember = new Member[5];
    this.releaseStatus = false;
    }
    
    
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154208 
    // NAMA : Irvan Nur Apendi 
    // KELAS : IF-39-12
    //
    //------------------- your code here-----------------------
    public boolean isReleaseStatus() {
        return releaseStatus;
    }
    
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154208
    // NAMA : Irvan Nur Apendi 
    // KELAS : IF-39-12
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    public void addMember(Member m) {
        if(nTeam <= teamMember.length) {
            m = teamMember[nTeam];
            nTeam = nTeam+1;
        }
        else if(nTeam > teamMember.length){
            System.out.println("Member Project team penuh");
        }
    }
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301154208
    // NAMA : Irvan Nur Apendi
    // KELAS : IF-39-12
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
     public boolean isReleased() {
         return releaseStatus;
     }
     
     public void releaseApp() {
         this.releaseStatus = true;
     }
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301154208 
    // NAMA : Irvan Nur Apendi
    // KELAS : IF-39-12
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    //------------------- your code here-----------------------
        if(releaseStatus == true) {
            return "Project "+projectName+ "is released with team meber of "+nTeam;
        } else {
            return "Project "+projectName+ "is in progress with team member of "+nTeam;
        }
    
    //---------------------------------------------------------
    }
}