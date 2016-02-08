/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author iqbal
 */
public class Application {
    private String appName;
    private int appSize;
    
    public Application( String appName, int appSize){
        this.appName = appName;
        this.appSize = appSize;
    }
    public String getAppName(){
        return appName;
    }
    public int getAppSize(){
        return appSize;
    }
    public String toString(){
        return ("Application name : "+appName+", with size : "+appSize+"MB");
    }
}
