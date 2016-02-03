public class Project {
    private String projectName;
    private Member[] teamMember=new Member[5];
    private int nTeam=0;
    private boolean releaseStatus=false;
    
    public Project(String projectName){
        this.projectName=projectName;
    }
    
    public void addMember(Member m){
        teamMember[nTeam]=m;
        nTeam++;
        m.setProjectWorked(m.getProjectWorked()+1);
    }
    
    public boolean isReleased(){
        return releaseStatus;
    }
    
    public void releaseApp(){
        releaseStatus=true;
    }
    
    @Override
    public String toString(){
        String status="";
        if (releaseStatus==true){
            status="Project "+projectName+" is complete with team member of "+nTeam;
        }
        else{
            status="Project "+projectName+" is in progress with team member of "+nTeam;
        }
        return status;
    }
}
