package task3exercise2;


public class StartUp {

    // 1. Declare your private attributes here:
    // NIM : 1301154166 
    // NAMA : Muhammad Maulud Hidayatullah Rambe 
    private Member[] member = new Member[100];
    private Project[] projectList = new Project[100];
    private int nMember = 0;
    private int nProject = 0;
    private int getNum = 0;

    // 2. Declare your Constructor here:
    public void StartUp(int nMember, int nProject, int getNum) {
        this.nMember = nMember;
        this.nProject = nProject;
        this.getNum = getNum;
    }
    
    // 3. Declare your Setter and Getter method here:
    public int getnMember() {
        return nMember;
    }

    public void setnMember(int nMember) {
        this.nMember = nMember;
    }

    public int getnProject() {
        return nProject;
    }

    public void setnProject(int nProject) {
        this.nProject = nProject;
    }

    public int getGetNum() {
        return getNum;
    }

    public void setGetNum(int getNum) {
        this.getNum = getNum;
    }
        
    // 4. Declare method addMember( m : Member ) here:
    // add an object Member m into array member, then
    // increment integer nMember+1
    public void addMember(Member m){
        if(nMember <= member.length){
            m = member[nMember];
            nMember++;
        }
        else{
            System.out.println("Member Full");
        }        
    }
    
    // 5. Declare method getMember( id : int ) : Member here:
    // returns Member object from array member with array index = id
    public Member getMember(int id){
        return member[id];
    }
    
    // 6. Declare method createNewProject( projectName : String ) here:
    // instantiate new Project object and insert it in array projectList, then
    // increment integer nProject+1
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
    
    // 7. Declare method getProject( id : int ) : Project here:
    // returns Project object from array projectList with array index = id
    public Project getProject(int id){
        return projectList[id];       
    }
    
    // 8. Declare method releaseProject( p : Project ) here:
    // set release status of object Project p by invoking method releaseApp()
    public void releaseProject(Project p){
        p.releaseApp();
    }
    
    // 9. Declare method getNumReleasedProject() : int here:
    // returns number of project with status is released
    public int getNumReleasedProject(){
        for(int i=0; i <= projectList.length; i++){
            if(getProject(i).isReleaseStatus()== true){
                getNum++;
            }
        }
        return getNum;
    }    
}