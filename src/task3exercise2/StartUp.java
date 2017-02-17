package task3exercise2;


public class StartUp {

    // 1. Declare your private attributes here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih 
    //
    //------------------- your code here-----------------------
    private Member[] member = new Member[50];
    private Project[] projectList = new Project[50];
    private int nMember = 0;
    private int nProject = 0;
    private int getNum = 0;
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    //
    // add an object Member m into array member, then
    // increment integer nMember+1
    //
    //------------------- your code here-----------------------
    public void addMember(Member m){
        if(nMember <= member.length){
            m = member[nMember];
            nMember++;
        }
        else{
            System.out.println("Member is Full");
        }
    }
    //---------------------------------------------------------
    
    
    // 5. Declare method getMember( id : int ) : Member here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    //
    // returns Member object from array member with array index = id
    //
    //------------------- your code here-----------------------
    public Member getMember(int id){
        return member[id];
    }
    //---------------------------------------------------------
    
    
    // 6. Declare method createNewProject( projectName : String ) here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    //
    // instantiate new Project object and insert it in array projectList, then
    // increment integer nProject+1
    //
    //------------------- your code here-----------------------
    public void createNewProject(String projectName){
        if(nProject <= projectList.length){
            Project p = new Project(projectName);
            projectList[nProject] = p;
            nProject++;
        }
    }
    //---------------------------------------------------------
    
    
    // 7. Declare method getProject( id : int ) : Project here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    //
    // returns Project object from array projectList with array index = id
    //
    //------------------- your code here-----------------------
    public Project getProject(int id){
        return projectList[id];
    }
    //---------------------------------------------------------
    
    
    // 8. Declare method releaseProject( p : Project ) here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    //
    // set release status of object Project p by invoking method releaseApp()
    //
    //------------------- your code here-----------------------
    public void releaseProject(Project p){
        p.releaseApp();
    }
    //---------------------------------------------------------
    
    
    // 9. Declare method getNumReleasedProject() : int here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    //
    // returns number of project with status is released
    //
    //------------------- your code here-----------------------
    public int getNumReleasedProject(){
        for (int i = 0; i <= projectList.length; i++) {
            if(getProject(i).isReleased()==true){
                getNum++;
            }
        }
        return getNum;
    }
    //---------------------------------------------------------
    
    
}