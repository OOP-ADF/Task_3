
/*
Gentur Cipto Tri Atmaja
1301140239
IF 38-09
*/

public class Project 
{
    private String projectName;
    private Member[] teamMember = new Member[5];
    private int nTeam = 0;
    private boolean releaseStatus = false;
 	
    public Project(String projectName)
    {
 	this.projectName = projectName;
 	teamMember = new Member[5];
 	releaseStatus = false;
    }
 	
    public void addMember(Member m)
    {
 	if(nTeam<teamMember.length)
        {
            teamMember[nTeam] = m;
            nTeam++;
            System.out.println("accepted");
 	}
 	
        else
        {
            System.out.println();
            System.out.println("full array");
 	}
    }
 
    public void releaseApp()
    {
 	releaseStatus = true;
    }
    
    public boolean isReleased()
    {
 	return releaseStatus;
    }
 	
    public String toString()
    {
 	return "Project "+projectName+" status is in progress with team member of "+nTeam;
    }
    
}
