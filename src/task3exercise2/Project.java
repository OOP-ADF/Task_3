package task3exercise2;




public class Project {
    private String projectName;
    private Member[] teamMember;
    private int nTeam = 0;
    private boolean releaseStatus = false;
    

    // 1. Declare your private attributes here:
    // NIM : Faza Ahda
    // NAMA : 1301154292 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
    public Project(String projectName){
        this.projectName = projectName;
        teamMember = new Member[5];
        this.releaseStatus = false;
    }
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    public void addMember(Member m) {
        if(nTeam <= teamMember.length){
            m = teamMember[nTeam];
            nTeam++;
        }
        else if(nTeam > teamMember.length){
            System.out.println("The Team is Full");
        }
    }

    public void releaseApp() {
        if(releaseStatus == false){
            releaseStatus = true;
        }
    }

    public boolean isReleased(){
        return releaseStatus;
    }

    
    
    //---------------------------------------------------------
    // 3. Declare your Setter and Getter method here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    //---------------------------------------------------------
    // 4. Declare method addMember( m : Member ) here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    //---------------------------------------------------------
    // 5. Declare method releaseApp() here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
    //---------------------------------------------------------
    // 6. Create method toString() : String here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // returns String that contains Project name, number of team member,
    // and release status
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
        //------------------- your code here-----------------------
        if (releaseStatus==true){
            return "Project "+this.projectName+", status is in progress, with team member of "+this.nTeam;
        } else {
            return "Project "+this.projectName+", status is not in progress, with team member of "+this.nTeam;
        }
        
        //---------------------------------------------------------
    }

    boolean isReleaseStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}