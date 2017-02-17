package task3exercise2;


public class StartUp {

    // 1. Declare your private attributes here:
    // NIM : 1301154222 
    // NAMA : Faishal Wafi N
    private Member[] member = new Member[50];
    private Project[] projectList = new Project[50];
    private int nMember = 0;
    private int nProject = 0;
    private int getNum = 0;
    
    public void addMember(Member m){
        if(nMember <= member.length){
            m = member[nMember];
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
            Project p = new Project(projectName);
            projectList[nProject] = p;
            nProject++;
        }
        else{
            System.out.println("Project Full");
        }
    }
    
    public Project getProject(int id){
        return projectList[id];       
    }
    
    public void releaseProject(Project p){
        p.releaseApp();
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