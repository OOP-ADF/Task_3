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
public class Project {

    private String projectName;
    private Member[] teamMember = new Member[5];
    private int nTeam = 0;
    private boolean releaseStatus = false;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public void addMember(Member m) {
        if (nTeam < teamMember.length) {
            teamMember[nTeam] = m;
            nTeam++;
        }
    }

    public boolean isReleased() {
           return releaseStatus;
    }

    public void releaseApp() {
        releaseStatus = true;
    }

    @Override
    public String toString() {
        return "Project{" + "projectName=" + projectName + "status in progress with Team Member of" + nTeam + '}';
    }

}
