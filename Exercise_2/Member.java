/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver32;

/**
 *
 * @author mahasiswabelajar7[1301144342]
 * Class : IF 38 02
 * Date : 2/2/2016
 */
public class Member {
    private String name;
	private String specialization;
	private int projectWorked=0;
	public Member(String name) {
		this.name=name;
	}
	public Member(String name,String specialization){
		this.name=name;
		this.specialization=specialization;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSpesialization(String specialization){
		this.specialization=specialization;
	}
	public String getSpesialization(){
		return specialization;
	}
	public void setProjectWorked(int projectWorked){
		this.projectWorked=projectWorked;
	}
	public int getProjectWorked(){
		return projectWorked;
	}
	public String toString(){
		return ("Member "+getName()+" specialized in "+getSpesialization()+" and already worked on "+getProjectWorked()+" project(s)");
	}
}
