package task3exercise2;
/**
 *
 */

public class Project {
    
    private String projectName;
    private Member[] teamMember;
    private int nTeam = 0;
    private boolean releaseStatus;
    
    public Project (String projectName)
    {
        this.projectName = projectName;
        this.releaseStatus = false;
        this.teamMember = new Member[5];
    }
    
    public boolean isReleased()
    {
        return releaseStatus;
    }
    
    public void addMember (Member m)
    {
        this.teamMember[nTeam] = m;
        nTeam++;
        m.setProjectWorked(m.getProjectWorked() + 1);
    }

    
    public void releaseApp()
    {
        this.releaseStatus = true;
    }

    public String toString() {
    
        
        String stat;
        if (releaseStatus == false)
            stat = "unknow";
        else
            stat = "in progress";
            
         return  "Project " + projectName + " status is " + stat + " with team member of " + nTeam;
       
    
    }
}