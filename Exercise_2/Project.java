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
public class Project {
    private String projectName;
    private Member [] teamMember = new Member[5];
    private int nTeam=0;
    private boolean releaseStatus = false;
    
    public Project(String projectName){
        this.projectName = projectName;
    }
    public void addMember(Member m){
        teamMember[nTeam]=m;
        nTeam++;
    }
    public boolean isRelease(){
        return releaseStatus;
    }
    public void releaseApp(){
        releaseStatus = true;
    }
    public String toString(){
        if(releaseStatus==false){
            return ("Project "+projectName+" status is in progress with team member of"+nTeam);
        }else{
            return ("Project "+projectName+" status is done with team member of"+nTeam);

        }
    }
}
