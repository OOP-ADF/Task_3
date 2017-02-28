/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3exercise1;

/**
 *
 * 
 */
public class Application {
    
private String appName;
    private int appSize;
    
    
    public Application(String appName, int appSize) 
    {
        this.appName = appName;
        this.appSize = appSize;
    }
    
    public int getAppSize() {
        return appSize;
    }

    public void setAppSize(int appSize) {
        this.appSize = appSize;
    }
       
    public String toString() {
        
        String p = "Application Name : " + appName + ", With size : " + appSize;
        return p;
    
  
    }

}
