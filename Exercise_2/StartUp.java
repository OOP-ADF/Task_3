// SELVI WIDYAPRADITIA PANGESTI, 1301144041, IF3801

public class StarUp {

    private Member[] member = new Member[50];
    private Project[] projectList = new Project[50];
    private int nMember;
    private int nProject;
    
    public void addMember(Member m) {
        member[nMember] = m;
        nMember++;
    }    
    
    public Member getMember(int id) {
        return member[id];
    }
    
    public void createNewProject(String projectName) {
        Project p = new Project(projectName);
        projectList[nProject] = p;
        nProject++;
    }
    
    public Project getProject(int id) {
        return projectList[id];
    }
    
    public void setProjectMember(Project p, Member m) {
        int x = m.getProjectWorked();      
        p.addMember(m);        
        m.setProjectWorked(x);
    }
    
    public void releaseProject(Project p) {
        p.releaseApp();
    }
    
    public int getNumReleasedProject() {
        return nProject;
    }
}
