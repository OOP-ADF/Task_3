package task3exercise1;

public class AppStore {
    
     // 1. Declare your private attributes here:
      // NIM : 1301154152 
      // NAMA : Valentino Wahyu Gusti Arson 
      private Application[] appList = new Application[100];
      private int totalApp;
      private int i;
      
     // NIM : 1301154152
     // NAMA : Valentino Wahyu Gusti Arson  
     //---------------------------------------------------------
     
     // 2. Declare your Setter and Getter method here:
     // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson 
      public void AppStore(int totalApp, int i){
             this.totalApp = totalApp;
             this.i = i;
         }
      public int totalApp() {
         return totalApp;
     }    
 
     public void setTotalApp(int totalApp) {
         this.totalApp = totalApp;
     }
 
     public int getI() {
        return i;
     }
     public void seti(int i) {        
         this.i = i;
     }
     //---------------------------------------------------------
     
     
     // 3. Create method createNewApp( appName, appSize ) here:
     // NIM : 1301154152 
     // NAMA : Valentino Wahyu Gusti Arson 
      public void createNewApp(String appName, int appSize){
          Application newApp = new Application(String appName, int appSize);
          for(int i = 1; i < appList.length; i++){
             if(appList[i] == null){
                 appList[i] = newApp;
                 this.totalApp = i;
                 break;
             }
          }
      }
      
 
     
     
     // 4. Create method getApp( id ) : Application here:
      // NIM : 1301154152
      // NAMA : Valentino Wahyu Gusti Arson  
      public Application getApp(int id){
         public Application getAppList(){
          return null;
      }
      
     //---------------------------------------------------------
         
     
     // 5. Create method toString() : String here:
      // NIM : 1301154152 
      // NAMA : Valentino Wahyu Gusti Arson 
      @Override
      public String toString() {
          return  ("Terdapat "+totalApp+" Aplikasi yang siap diinstall");
     }
    }    
     //---------------------------------------------------------
  }
}
