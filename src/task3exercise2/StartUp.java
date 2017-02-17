package task3exercise2;


public class StartUp {

    // 1. Declare your private attributes here:
    // NIM : M. Anugrah A 
    // NAMA : 1301154348 
    //
    private Member[] member = new Member[50];
    private Project[] projectList = new Project[50];
    private int nMember = 0;
    private int nProject = 0;
    private int getNum = 0;
    
    // 2. Declare your Constructor here:
    // NIM : M. Anugrah A 
    // NAMA : 1301154348 
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    //NIM : M. Anugrah A 
    // NAMA : 1301154348
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    //NIM : M. Anugrah A 
    // NAMA : 1301154348 
    //
    // add an object Member m into array member, then
    // increment integer nMember+1
    //
    public void addMember(Member m){
        if(nMember <= member.length){
            m = member[nMember];
            nMember++;
        }
        else{
            System.out.println("Member Penuh");
        }        
    }
    
    
    // 5. Declare method getMember( id : int ) : Member here:
    //NIM : M. Anugrah A 
    // NAMA : 1301154348 
    //
    // returns Member object from array member with array index = id
    //
    public Member getMember(int id){
        return member[id];
    }
    
    
    // 6. Declare method createNewProject( projectName : String ) here:
    //NIM : M. Anugrah A 
    // NAMA : 1301154348 
    //
    // instantiate new Project object and insert it in array projectList, then
    // increment integer nProject+1
    //
    public void createNewProject(String projectName)
    {
        if(nProject <= projectList.length){
            Project a = new Project(projectName);
            projectList[nProject] = a;
            nProject++;
        }
        else
        {
            System.out.println("Project Full");
        }
    }
    
    
    
    // 7. Declare method getProject( id : int ) : Project here:
    //NIM : M. Anugrah A 
    // NAMA : 1301154348 
    //
    // returns Project object from array projectList with array index = id
    //
    public Project getProject(int id)
    {
        return projectList[id];       
    }
    
    
    // 8. Declare method releaseProject( p : Project ) here:
    // NIM : M. Anugrah A 
    // NAMA : 1301154348 
    //
    // set release status of object Project p by invoking method releaseApp()
    //
     public void releaseProject(Project a){
        a.releaseApp();
    }
    
    
    // 9. Declare method getNumReleasedProject() : int here:
    // NIM : M. Anugrah A 
    // NAMA : 1301154348 
    //
    // returns number of project with status is released
    //
    public int getNumReleasedProject()
    {
        for(int a=0; a <= projectList.length; a++){
            if(getProject(a).isReleased() == true){
                getNum++;
            }
        }
        return getNum;
    }
}