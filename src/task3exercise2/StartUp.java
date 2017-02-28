package task3exercise2;
/**
 *
 */
public class StartUp {
    
    private Member[] member = new Member[50];
    private Project[] projectList = new Project [50];
    private int nMember = 0;
    private int nProject = 0;
   
    public void addMember (Member m)
    {
        this.member[nMember] = m;
        nMember++;
    }
    
    public Member getMember (int id)
    {
       return member[id];
    }
    
    public void createNewProject (String projectName)
    {
        Project prj = new Project(projectName);
        projectList[nProject] = prj;
        nProject++;
    }

    public Project getProject (int id)
    {
        return projectList[id];
    }

    public void releaseProject (Project p)
    {
        p.releaseApp();
    }
    
    public int getNumReleasedProject()
    {
        int numRelease = 0;
        for (int i = 0; i < nProject; i++)
            if (projectList[i].isReleased() != false)
                numRelease += 1;
        
        return numRelease;
                
    }
       
}