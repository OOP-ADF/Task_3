package task3exercise2;

public class StartUp {

    // 1. Declare your private attributes here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    private Member Member[] = new Member[50];
    private Project projectList[] = new Project[50];
    private int nMember;
    private int nProject;

    // 2. Declare your Constructor here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    public StartUp() {
        nMember = 0;
    }

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //

    public void setMember(Member[] Member) {
        this.Member = Member;
    }

    public Project[] getProjectList() {
        return projectList;
    }

    public void setProjectList(Project[] projectList) {
        this.projectList = projectList;
    }

    public int getnMember() {
        return nMember;
    }

    public void setnMember(int nMember) {
        this.nMember = nMember;
    }

    public int getnProject() {
        return nProject;
    }

    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    // add an object Member m into array member, then
    // increment integer nMember+1
    //
    public void addMember(Member m) {
        Member[nMember] = m;
        nMember++;
    }

    // 5. Declare method getMember( id : int ) : Member here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    // returns Member object from array member with array index = id
    //
    public Member getMember(int id) {
        return Member[id];
    }

    // 6. Declare method createNewProject( projectName : String ) here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    // instantiate new Project object and insert it in array projectList, then
    // increment integer nProject+1
    //
    public void createNewProject(String projectName) {
        Project p = new Project(projectName);
        projectList[nProject] = p;
        nProject++;
    }

    // 7. Declare method getProject( id : int ) : Project here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    // returns Project object from array projectList with array index = id
    //
    public Project getProject(int id) {
        return projectList[id];
    }

    // 8. Declare method releaseProject( p : Project ) here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    // set release status of object Project p by invoking method releaseApp()
    //
    public void releaseProject(Project p) {
        p.releaseApp();
    }

    // 9. Declare method getNumReleasedProject() : int here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    // returns number of project with status is released
    //
    public int getNumReleasedProject() {
        int total = 0;
        for (int i = 0; i < nProject; i++) {
            if (projectList[i].isReleased()) {
                total++;
            }
        }

        return total;
    }
}
