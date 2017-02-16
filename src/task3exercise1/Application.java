package task3exercise1;

public class Application {

    // 1. Declare your private attributes here:
    // NIM : 1301154455 
    // NAMA : AYLA PUTERI YANZA 
    //
        private String AppName;
        private int AppSize;
    
    //---------------------------------------------------------
    
    // 2. Declare Constructor here:
    // NIM : 130115445 
    // NAMA : AYLA PUTERI YANZA
    //
       /*public Application(){}
       public Application(String a){
           this.AppName = a; 
        }*/
       public Application(String a, int b){
           this.AppName = a;
           this.AppSize = b;
       }
   
   
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154455
    // NAMA : AYLA PUTERI YANZA
    //
     public void setAppName(String a){
            this.AppName = a;
        }
     public String getAppName(){
            return AppName;
        }
     public void setAppSize(int b){
            this.AppSize = b;
     }
     public int getAppSize(){
            return AppSize;
     }
    
    // 4. Create method toString() : String here:
    // NIM : 1301154455
    // NAMA : AYLA PUTERI YANZA
    //
    // returns String that contains application name and application size 
    // 
    // example : "Application name: App1, with size: 3MB"
    public String toString() {
        String a = "Application Name : " + getAppName() + "with size : " + getAppSize();
        return null;
    }
    
}
