/* 
Nama 	: Kevin Prakarsa B R
NIM  	: 1301144169
Kelas	: IF-38-09 
*/
import java.util.Scanner;
	 
public class AppStore {
 private Application[] appList = new Application[100];
 private int countApp=0;
	
 public void createNewApp(String appName, int appSize) {
  Application app = new Application(appName, appSize);
   appList[sumApp] = app;
   sumApp++;
  }
	
 public Application getApp(int id) {
  return appList[id];
 }
 
 public int getSumApp() {
	 return sumApp;
 }
	
 public String toString() {
  return ("There are "+countApp+" applications ready to install");
 }
}
