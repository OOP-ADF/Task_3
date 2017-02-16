package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154404, 
    // NAMA : Muhammad Rifky Putra Ananda, 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
        private String projectName;
        private Member[5] teamMember;
        private int nTeam = 0;
        private boolean releaseStatus = false;
        
        public boolean isRelease(){
            return releaseStatus;
        }
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154404, 
    // NAMA : Muhammad Rifky Putra Ananda 
    //
    //------------------- your code here-----------------------
        public Project(String projectName){
            this.projectName = projectName;
            Member a = new Member[5];
            releaseStatus = false;
        }
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154404, 
    // NAMA : Muhammad Rifky Putra Ananda 
    //
    //------------------- your code here-----------------------
        
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154404, 
    // NAMA : Muhammad Rifky Putra Ananda 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
        public addMember(Member m){
            Member mm = new Member();
            for(nTeam = 0; i<5; nTeam++){
                teamMember[i] = mm;
            }
        }
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301154404, 
    // NAMA : Muhammad Rifky Putra Ananda 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
        public void releaseApp(){
            releaseStatus = true;
        }
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301154404, 
    // NAMA : Muhammad Rifky Putra Ananda 
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    //------------------- your code here-----------------------
        String a = "Project "+projectName+" is in progress with team member of "+nTeam;
        return a;
    
    //---------------------------------------------------------
    }
}