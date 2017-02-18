package task3exercise1;
// Tugas Rakha
public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301154124 
    // NAMA : Muhammad Rakha, 
    //
    //------------------- your code here-----------------------
    private Application applist[] = new Application[100];
    private int totalapp = 0;
    

    //---------------------------------------------------------
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154124,
    // NAMA : Muhammad Rakha, 
    //
    //------------------- your code here-----------------------
    public void setTotalapp(int totalapp) {    
        this.totalapp = totalapp;
    }
    
    public Application[] getApplist() {
        return applist;
        
    }

    public void setApplist(Application[] applist) {
        this.applist = applist;
    }

    public int getTotalapp() {
        return totalapp;
    }

    //---------------------------------------------------------
    // 3. Create method createNewApp( appName, appSize
    // NIM : 1301154124,
    // NAMA : Muhammad Rakha, 
    // instantiate new Application object and insert it in array appList
    //
    //------------------- your code here-----------------------
    public void createNewApp (String appname, int appsize){
        applist[totalapp].setAppName(appname);
        applist[totalapp].setAppSize(appsize);
        totalapp++;
    }
    //---------------------------------------------------------
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301154124,
    // NAMA : Muhammad Rakha, 
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
    public int getTotalApp (){
        return totalapp;
    }
    //---------------------------------------------------------
    
    // 5. Create method getApp:
    // NIM : 1301154124,
    // NAMA : Muhammad Rakha, 
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
    public Application getApp (int id){
        return applist[id];
    }
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301154124,
    // NAMA : ........................., 
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    
    public String toString() {
        //------------------- your code here-----------------------
        
        return ("There are "+ getTotalApp() +" Ready to install ");
        
        //---------------------------------------------------------
    }    
}

