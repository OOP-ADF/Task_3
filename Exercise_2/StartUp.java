/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3_2;

/**
 *
 * @author iqbal
 */
public class StartUp {
    private Member [] member = new Member[50];
    private Project[] projectList = new Project[50];
    private int nMember;
    private int nProject;
    
    public void addMember(Member m){
        member[nMember]= m;
        nMember++;
    }
    public Member getMember(int id){
        return member[id];
    }
    public void createNewProject(String projectName){
        projectList[nProject] = new Project(projectName);
        nProject++;
    }
    public Project getProject(int id){
        return projectList[id];
    }
    public void setProjectMember(Project p, Member m){
        p.addMember(m);
    }
    public void releaseProject(Project p){
        p.releaseApp();
    }
    public int getNumReleaseProject(){
        int c;
        c=0;
        for (int i=0;i<nProject;i++){
            if (projectList[i].isRelease()==true){
                c++;
            }
        }
        return c;
    }
}
