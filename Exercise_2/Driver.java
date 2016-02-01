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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StartUp stp = new StartUp();
        Member m = new Member("Alex", "Java Programming");
        stp.addMember(m);
        m = new Member("Beni", "Web Developing");
        stp.addMember(m);
        m = new Member("Cakra", "Software Engineering");
        stp.addMember(m);
        m = new Member("Deni");
        stp.addMember(m);
        m = new Member("Eric");
        stp.addMember(m);

        stp.createNewProject("Project1");
        stp.createNewProject("Project2");

        stp.setProjectMember(stp.getProject(1), stp.getMember(1));
        stp.setProjectMember(stp.getProject(1), stp.getMember(2));
        stp.setProjectMember(stp.getProject(1), stp.getMember(4));
        stp.setProjectMember(stp.getProject(2), stp.getMember(2));
        stp.setProjectMember(stp.getProject(2), stp.getMember(3));
        stp.setProjectMember(stp.getProject(2), stp.getMember(4));
        stp.setProjectMember(stp.getProject(2), stp.getMember(5));

        stp.getMember(1).setProjectWorked(1);
        stp.getMember(2).setProjectWorked(2);
        stp.getMember(3).setProjectWorked(1);
        stp.getMember(4).setProjectWorked(2);
        stp.getMember(5).setProjectWorked(1);

        stp.releaseProject(stp.getProject(2));

        int count = 1;
        while (stp.getMember(count) != null) {
            System.out.println(stp.getMember(count).toString());
            count++;
        }
        System.out.println();
        count = 1;
        while (stp.getProject(count) != null) {
            System.out.println(stp.getProject(count).toString());
            count++;
        }
        System.out.println();
        System.out.println("Number of released project : " + stp.getNumReleasedProject());
    }

}
