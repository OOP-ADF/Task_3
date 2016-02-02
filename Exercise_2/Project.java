//Vicha Octavia Tama_1301144209_IF-38-09
  
 public class Project 
 {
 	private String projectName;
	private int nTeam=0;
 	private boolean releaseStatus;
 	private Member[] teamMember;
 	
 	public Project (String projectName) 
	{
 		this.projectName = projectName;
 		teamMember = new Member[5];
 		releaseStatus = false;
 	}
 	
 	public void addMember(Member mm)
	{
 		teamMember[nTeam]=mm;
 		nTeam++;
 	}
 	
 	public boolean isReleased () 
	{
 		return releaseStatus;
	}
 	
 	public void releaseApp() 
	{
 		releaseStatus = true;
 	}
 	
 	public String toString() 
	{
         String status;
         if(releaseStatus = true) 
		 {
             status="Released";
         }
         else 
		 {
             status="in Progress";
         }
 		return ("Project "+projectName+" status is "+status+" with team member of "+nTeam);
 	}
 }
