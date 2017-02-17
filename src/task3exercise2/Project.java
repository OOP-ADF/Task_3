package task3exercise2;

    // Nama : Muhammad Marchell
    // NIM  : 1301154278

public class Project {
    private String projectName;
    private Member[] teamMember;
    private int nTeam = 0;
    private boolean releaseStatus = false;
    
    public Project(String projectName){
        this.projectName = projectName;
        teamMember = new Member[5];        
    }
    
    public void addMember(Member m){
        if(nTeam <= teamMember.length){
            m = teamMember[nTeam];
            nTeam++;
        }
        else if(nTeam > teamMember.length){
            System.out.println("Project team full");
        }
        else{
            System.out.println("Error");
        }            
    }
    
    public boolean isReleased(){
        return releaseStatus;
    }
    
    public void releaseApp(){
        if(releaseStatus == false){
            releaseStatus = true;
        }
    }
    
    @Override
    public String toString(){
        if(releaseStatus == true){
            return "Project " + projectName + " status is released with team member of " + nTeam;
        }
        else{
            return "Project " + projectName + " status is in progress with team member of " + nTeam;
        }
    }
    
    
    
    
    
}
