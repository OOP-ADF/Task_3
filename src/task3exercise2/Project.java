package exercise2;

public class Project {
    private String projectName;
    private Member[] teamMember;
    private int xTeam = 0;
    private boolean releaseStatus = false;

    public Project(String projectName) {
        this.projectName = projectName;
        teamMember = new Member [5];
    }
    
    public void addMember(Member a){
    if(xTeam <= teamMember.length){
    a = teamMember[xTeam];
    xTeam++;
}
    else if(xTeam > teamMember.length){
    System.out.println("Team Full");
}
    else{
    System.out.println("ERROR");
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
            return "Project " + projectName + " status is released with team member of " + xTeam;
        }
        else{
            return "Project " + projectName + " status is in progress with team member of " + xTeam;
        }
}
}