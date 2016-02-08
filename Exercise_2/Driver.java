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
public class Driver {
    public static void main(String [] args){
        StartUp stp = new StartUp();
        Member m1 = new Member("Ales");
        Member m2 = new Member("Beni");
        Member m3 = new Member("Cakra");
        Member m4 = new Member("Deni");
        Member m5 = new Member("Eric");
        stp.addMember(m1);
        stp.addMember(m2);
        stp.addMember(m3);
        stp.addMember(m4);
        stp.addMember(m5);
        stp.createNewProject("project1");
        stp.createNewProject("project2");
        Project p1 = stp.getProject(0);
        stp.setProjectMember(p1, m1);
        stp.setProjectMember(p1, m2);
        stp.setProjectMember(p1, m4);
        Project p2 = stp.getProject(1);
        stp.setProjectMember(p2, m2);
        stp.setProjectMember(p2, m3);
        stp.setProjectMember(p2, m4);
        stp.setProjectMember(p2, m5);
        stp.releaseProject(stp.getProject(1));
        System.out.println(stp.getMember(0).toString());
        System.out.println(stp.getProject(0).toString());
        System.out.println(stp.getNumReleaseProject());
    }
}
