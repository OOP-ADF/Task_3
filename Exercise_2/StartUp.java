/*
Gentur Cipto Tri Atmaja
1301140239
IF 38-09
 */

public class StartUp 
{
    private Member[] member = new Member[50];
    private Project[] projectList = new Project[50];
    private int nMember = 0;
    private int nProject = 0;
 	
    public void addMember(Member m)
    {
        if(nMember<member.length)
        {
            member[nMember] = m;
            nMember++;
            System.out.println("Accepted"); 
 	}
 		
        else
        {
            System.out.println();
            System.out.println("full array");
 	}
    }
 		
    public void createNewProject(String projectName)
    {
 	Project project = new Project(projectName);
 	if(nProject<projectList.length)
        {
            projectList[nProject] = project;
            nProject++;
            System.out.println("Accepted"); 
 	}
 		
        else
        {
            System.out.println();
            System.out.println("full array");
 	}
    }
	
    public void releaseProject(Project p)
    {
 	p.releaseApp();
    }
 
    public Member getMember(int id)
    {
 	return member[id];
    }
    
    public Project getProject(int id)
    {
 	return projectList[id];
    }
    
    public int getNumReleasedProject()
    {
 	int num = 0;
 	for (int i=0; i<nProject;i++)
        {
            if(projectList[i].isReleased() == true)
            {
 		num++;
            }	
 	}
    return num;
    }
    
    public void setProjectMember(Project p, Member m)
    {
 	p.addMember(m);
    }
}
