package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM :    1301154306 
    // NAMA : M.Widadio Ilham 
     private Application[] appList = new Application[100];
     private int totalApp;
     private int j;
    
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154306 
    // NAMA : M.Widadio Ilham 
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : 1301154306
    // NAMA : M.Widadio Ilham 
    // instantiate new Application object and insert it in array appList
    //
    public void createNewApp(String appName, int appSize){
         Application newApp = new Application(appName, appSize);
         appList [totalApp] = newApp;
         totalApp++;}
    
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301154306 
    // NAMA : M.Widadio Ilham
    // returns Application object from array appList with array index = id
    //
   public Application getApp(int id){
         return appList[id];
     }
     
     public int getTotalApp(){
         return totalApp;
     }
     
     public Application getAppList(){
         for (int i = 0; i <= this.j; i++){
             return appList[i];
         }
         return null;
     }

        
    
    // 5. Create method toString() : String here:
    // NIM :1301154306 
    // NAMA : M.Widadio Ilham 
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
         for (int i = 1; i <= 100; i++){
             if (appList[i] != null){
                 String nama = "App Name "+i+": "+appList[i].getAppName();
                 String size = "App Size "+i+": "+appList[i].getAppSize();
                 System.out.println(nama);
                 System.out.println(size);
                 System.out.println("");
             }else{
                 break;
             }
         }

        return null;
    
    //---------------------------------------------------------
    }
}
