package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    private String  projectName;
	  private Member[] teamMember = new Member[5];
	  private int nTeam = 0;
	  private boolean releaseStatus = false;
    // NIM : 1301154180
    // NAMA : Rifky Maulana 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154180
    // NAMA : Rifky Maulana 
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154180
    // NAMA : Rifky Maulana 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    public void addMember (Member m) {
  		teamMember[nTeam]= m;
		nTeam++;
		m.setProjectWorked(m.getProjectWorked()+1);
	}
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301154180
    // NAMA : Rifky Maulana 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
    public boolean releaseApp() {
		releaseStatus = true;
	}
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301154180
    // NAMA : Rifky Maulana 
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    //------------------- your code here-----------------------
        String temp= "";
		if (releaseStatus==true) {
			temp="Project "+projectName+ " status is complete with team member of "+nTeam;
		}
		else {
			temp="Project "+projectName+ " status is in progress with team member of "+nTeam;
		}
		return temp;
    
    //---------------------------------------------------------
    }
