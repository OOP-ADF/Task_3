package task3exercise2;


public class StartUp {

    // 1. Declare your private attributes here:
    // NIM : 1301154259 
    // NAMA : Anggi Pratama Nasution
    //
    //------------------- your code here-----------------------
    private Member[] member = new Member[50];
    private Project[] projectList = new Project [50];
    private int nMember = 0;
    private int nProject = 0;
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154259 
    // NAMA : Anggi Pratama Nasution
    //
    //------------------- your code here-----------------------
        
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154259 
    // NAMA : Anggi Pratama Nasution 
    //
    //------------------- your code here-----------------------
    public void setMember(Member[] member) {
        this.member = member;
    }

    public void setProjectList(Project[] projectList) {
        this.projectList = projectList;
    }

    public void setnMember(int nMember) {
        this.nMember = nMember;
    }

    public void setnProject(int nProject) {
        this.nProject = nProject;
    }
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154259 
    // NAMA : Anggi Pratama Nasution
    //
    // add an object Member m into array member, then
    // increment integer nMember+1
    //
    //------------------- your code here-----------------------
    public void addMember (Member m)
    {
        this.member[nMember] = m;
        nMember++;
    }
    //---------------------------------------------------------
    
    
    // 5. Declare method getMember( id : int ) : Member here:
    // NIM : 1301154259 
    // NAMA : Anggi Pratama Nasution
    //
    // returns Member object from array member with array index = id
    //
    //------------------- your code here-----------------------
    public Member getMember (int id)
    {
       return member[id];
    }
    //---------------------------------------------------------
    
    
    // 6. Declare method createNewProject( projectName : String ) here:
    // NIM : 1301154259 
    // NAMA : Anggi Pratama Nasution
    //
    // instantiate new Project object and insert it in array projectList, then
    // increment integer nProject+1
    //
    //------------------- your code here-----------------------
    public void createNewProject (String projectName)
    {
        Project proj = new Project(projectName);
        projectList[nProject] = proj;
        nProject++;
    }
    //---------------------------------------------------------
    
    
    // 7. Declare method getProject( id : int ) : Project here:
    // NIM : 1301154259 
    // NAMA : Anggi Pratama Nasution
    //
    // returns Project object from array projectList with array index = id
    //
    //------------------- your code here-----------------------
    public Project getProject (int id)
    {
        return projectList[id];
    }
    //---------------------------------------------------------
    
    
    // 8. Declare method releaseProject( p : Project ) here:
    // NIM : 1301154259 
    // NAMA : Anggi Pratama Nasution
    //
    // set release status of object Project p by invoking method releaseApp()
    //
    //------------------- your code here-----------------------
    public void releaseProject (Project p)
    {
       p.releaseApp();
    }
    //---------------------------------------------------------
    
    
    // 9. Declare method getNumReleasedProject() : int here:
    // NIM : 1301154259 
    // NAMA : Anggi Pratama Nasution
    //
    // returns number of project with status is released
    //
    //------------------- your code here-----------------------
    public int getNumReleasedProject()
    {
        int numb = 0;
        
        for (int i = 0; i < nProject; i++){
            
            if (projectList[i].isReleaseStatus() != false){
                numb += 1;
            }
        }
        return numb;                
    }
    //---------------------------------------------------------


}