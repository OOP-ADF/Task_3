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
public class Application {
    private String appName;
    private int appSize;
	
    public Application(String appName, int appSize) {
	this.appName=appName;
	this.appSize=appSize;
    }
    public String getAppName() {
	return appName;
    }
    public int getAppSize() {
	return appSize;
    }
	
    public String toString() {
	return  ("Application Name: "+appName+ ", with size"+appSize+"MB");
    }
}
