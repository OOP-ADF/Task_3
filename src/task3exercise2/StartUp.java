package task3exercise2;


public class StartUp {

    // 1. Declare your private attributes here:
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson 
    //
    private Member[] member = new Member[100];
    private Project[] projectList = new Project[100];
    private int nMember = 0;
    private int nProject = 0;
    private int getNum = 0;
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson  
    //
    public void StartUp(int nMember, int nProject, int getNum){
            this.nMember = nMember;
            this.nProject = nProject;
            this.getNum = getNum;
        }
    
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson  
    //
    public int nMember() {
        return nMember;
    }    

    public void setNMember(int nMember) {
        this.nMember = nMember;
    }

    public int getNProject() {
        return nProject;
    }
    public void setNProject(int nProject) {        
        this.nProject = nProject;
    }

    public int getGetNum() {
        return getNum;
    }

    public void setGetNum(int getNum) {
        this.getNum = getNum;
    }
    
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson 
    public void addMember(Member m){
        if(nMember <= member.length){
            m = member[nMember];
            nMember++;
        }
        else{
            System.out.println("Member Full");
        }        
    }
    
    //---------------------------------------------------------
    
    
    // 5. Declare method getMember( id : int ) : Member here:
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson 
    public Member getMember(int id){
        return member[id];
    }
    
    //---------------------------------------------------------
    
    
    // 6. Declare method createNewProject( projectName : String ) here:
    // NIM : 1301154152
    // NAMA : Valentino Wahyu Gusti Arson  
    public void createNewProject(String projectName){
        if(nProject <= projectList.length){
            Project p = new Project(projectName);
            projectList[nProject] = p;
            nProject++;
        }
        else{
            System.out.println("Project Full");
        }
    }
    
    //---------------------------------------------------------
    
    
    // 7. Declare method getProject( id : int ) : Project here:
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson  
    public Project getProject(int id){
        return projectList[id];       
    }
    
    //---------------------------------------------------------
    
    
    // 8. Declare method releaseProject( p : Project ) here:
    // NIM : 1301154152
    // NAMA : Valentino Wahyu Gusti Arson  
    public void releaseProject(Project p){
        p.releaseApp();
    }
    
    //---------------------------------------------------------
    
    
    // 9. Declare method getNumReleasedProject() : int here:
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson    
    public int getNumReleasedProject(){
        for(int i=0; i <= projectList.length; i++){
            if(getProject(i).isReleased() == true){
                getNum++;
            }
        }
        return getNum;
    }
    
}