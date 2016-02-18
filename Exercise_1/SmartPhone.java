/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver31;

/**
 *
 * @author mahasiswabelajar7[1301144342]
 * Class : IF 38 02
 * Date : 2/2/2016
 */
public class SmartPhone {
       private Application[] appList=new Application[10];
    private int totalApp=0;
    private int memory;
    public void setMemory (int memory) {
	this.memory=memory;
    }
    public void addApplication (AppStore appStore, int appId){
    	Application app=appStore.getApp(appId);
       	appList[totalApp]=app;
	totalApp++;
    }
    public Application getApp(int id){
    	return appList[id];
    }
    public int getTotalApp(){
	return totalApp;
    }
    public int getRemainingSize(){
	int c=0;
    	for(int i=0;i<appList.length;i++){
		if(appList[i]!=null){
                	c=c+appList[i].getAppSize();
		}
	}
            return (memory-c);
    }
    public String toString() {
	return ("Memory Size "+memory+"MB , "+getTotalApp()+" application installed remaining memory size "+getRemainingSize()+"MB");
    }
}
