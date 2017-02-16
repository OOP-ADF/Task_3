package task3exercise2;


public class StartUp {

    // 1. Declare your private attributes here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara  
    //
    private Member[] member;  
    private Project[] projectList;
    private int nMember;
    private int nProject;
    
    // 2. Declare your Constructor here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara  
    //
    public StartUp()
    {
        member = new Member[50];
        projectList = new Project[50]; 
    }
    
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara  
    //
    public void setProjectMember(Project p, Member m)
    {
        p.addMember(m);
    }
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara  
    //
    // add an object Member m into array member, then
    // increment integer nMember+1
    //
    public void addMember(Member m)
    {
        if (nMember <= member.length)
        {
            member[nMember] = m;
            nMember ++;
        }
    }
    
    
    // 5. Declare method getMember( id : int ) : Member here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara  
    //
    // returns Member object from array member with array index = id
    //
    public Member getMember(int id)
    {
        return member[id];
    }
    
    
    // 6. Declare method createNewProject( projectName : String ) here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara 
    //
    // instantiate new Project object and insert it in array projectList, then
    // increment integer nProject+1
    //
    public void createNewProject(String projectName)
    {
        Project p = new Project(projectName);
        if (nProject <= projectList.length)
        {
            projectList[nProject] = p;
            nProject++;
        }
    }
    
    
    // 7. Declare method getProject( id : int ) : Project here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara  
    //
    // returns Project object from array projectList with array index = id
    //
    public Project getProject(int id)
    {
        return projectList[id];
    }
    
    
    // 8. Declare method releaseProject( p : Project ) here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara  
    //
    // set release status of object Project p by invoking method releaseApp()
    //
    public void releaseProject(Project p)
    {
        p.releaseApp();
    }
    
    
    // 9. Declare method getNumReleasedProject() : int here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara 
    //
    // returns number of project with status is released
    //
    public int getNumReleaseProject()
    {
        int count = 0;
        for (int i = 0; i < projectList.length; i++)
        {
            if (projectList[i] != null)
            {
                if (projectList[i].isReleaseStatus()==true)
                {
                    count++;
                }
            }
        }
        return count;
    }
    
    
}