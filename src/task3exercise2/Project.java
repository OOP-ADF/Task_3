package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
        private String projectName;
	private Member[] teamMember = new Member[5];
	
	private boolean releaseStatus=false;
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono
    //
    //------------------- your code here-----------------------
        private int n_Team=0;         
    
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono 
    //
    //------------------- your code here-----------------------

        public boolean isReleased() 
        {
		return releaseStatus;
	}
        
        public Project (String projectName) 
        {
		this.projectName = projectName;
	}
    
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
        public void addMember (Member m) 
        {
		teamMember[n_Team] = m;
		n_Team++;
	}
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
        public void releaseApp() 
        {
		releaseStatus = true;
	}
    
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    //------------------- your code here-----------------------
        if (releaseStatus == true) 
                {
                    return ("Project "+ projectName + " Status is in released with team member of "+ n_Team);
		}

	else    {
                    return ("Project "+ projectName + " Status is in progress with team member of "+ n_Team);
		}
       
    
    //---------------------------------------------------------
    }
}
