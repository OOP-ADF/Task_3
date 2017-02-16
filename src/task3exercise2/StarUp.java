package exercise2;
public class StarUp {
    private Member[] member = new Member[50];
    private Project[] projectList = new Project[50];
    private int nMember = 0;
    private int nProject = 0;
    private int getNum = 0;
    
    public void addMember(Member a){
        if(nMember <= member.length){
            a = member[nMember];
            nMember++;
        }
        else{
            System.out.println("Member Full");
        }        
    }
    
    public Member getMember(int id){
        return member[id];
    }
    
    public void createNewProject(String projectName){
        if(nProject <= projectList.length){
            Project b = new Project(projectName);
            projectList[nProject] = b;
            nProject++;
        }
        else{
            System.out.println("Project Full");
        }
    }
    
    public Project getProject(int id){
        return projectList[id];       
    }
    
    public void releaseProject(Project b){
        b.releaseApp();
    }
    
    public int getNumReleasedProject(){
        for(int i=0; i <= projectList.length; i++){
            if(getProject(i).isReleased() == true){
                getNum++;
            }
        }
        return getNum;
    }
}