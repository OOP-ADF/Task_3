/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *Aristya Wirawan-1103134329-IF3809
 * @author aris
 */
public class StartUp {
    private Member[] member=new Member[50];
    private Project[] projectList=new Project[50];
    private int nMember,nProject;
    
    public void addMember(Member m){
        
    }
    public Member getMember(int id){
        return member[id];
    }
    public void createNewProject(String projectName){
        Project pr=new Project(projectName);
        if (nProject<projectList.length) {
            projectList[nProject]=pr;
            nProject++;
        }
    }
    public Project getProject(int id){
        return projectList[id];
    }
    public void setProjectMember(Project p,Member m){
        p.addMember(m);
    }
    public void releaseProject(Project p){
        p.releaseApp();
    }
    public int getNumReleasedProject(){
        int a = 0,b=0;
        while (a<projectList.length) {
            if (projectList[a].isReleased()==true) {
                b=a+1;
                a=projectList.length;
            }
            a++;
        }
        return b;
    }
}
