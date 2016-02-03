public class Project {
    private String projectName;
    private Member[] teamMember = new Member[5];
    private int nTeam=0;
    private boolean releaseStatus = false;

    public Project(String projectName) {
        this.projectName = projectName;
    }
    
    public void addMember(Member m){
        if (nTeam <= teamMember.length) {
            teamMember[nTeam] = m;
            nTeam++;
            m.setProjectWorked(m.getProjectWorked()+1);
        }
        else {
            System.out.println("Team full");
        }
          
    }
    
    public boolean isRelease (){
        return releaseStatus;
    }
    
    public void releaseApp(){
        releaseStatus = true;
    }
    
    public String toString(){
        String stat;
        if (isRelease()) {
            stat = "was finished ";
        }
        else{
            stat = "is in progress ";
        }
        return("Project "+projectName+" status "+stat+" with team member of "+nTeam);
    }
}
