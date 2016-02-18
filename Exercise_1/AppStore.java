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
public class AppStore {
    private Application[] appList=new Application[100];
    private int totalApp=0;
    
    public void createNewApp(String appName, int appSize) {
    Application app=new Application(appName,appSize);
    appList[totalApp]=app;
    totalApp++;
    }
    public Application getApp(int id){
	return appList[id];
    }
    public int getTotalApp(){
	return totalApp;
    }
    public Application[] getAppList(){
	return appList;
    }
    public String toString() {
	return ("There are "+getTotalApp()+"applications ready to install");
    }
}
