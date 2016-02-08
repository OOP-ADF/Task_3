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
public class Member {
    private String name;
    private String specialization;
    private int projectWorked = 0;
    
    public Member(String name){
        this.name = name;
    }
    public Member(String nama, String specialization){
        this.name = name;
        this.specialization = specialization;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public int getProjectWorked(){
        return projectWorked;
    }
    public void setProjectWorked(int projectWorked){
        this.projectWorked = projectWorked;
    }
    public String toString(){
        return ("Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project(s)");
    }
}
