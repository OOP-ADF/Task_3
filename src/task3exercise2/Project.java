package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154315
    // NAMA : Niko Novian Pratama
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    private String projectName;
    private member[] teamMember = new member[5];
    private int nTeam = 0;
    private boolean releaseStatus = false;
    
    
    
    // 2. Declare your Constructor here:
    // NIM : 1301154315 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    public Project (String projectName) 
    {
        this.projectName = projectName;
    }
    
    public void addMember(member m)
    {
        this.teamMember [nTeam++]=m;
    }
    
    public String toString() {
        String b ="Project Exodus status is in progress with team member of "+nTeam;
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
        return null;
    
    //---------------------------------------------------------
    }
}