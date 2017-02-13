package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154245 
    // NAMA : GABE DIMAS WICAKSANA
    // 
    //------------------- your code here-----------------------
        private Application appList[] = new Application[10];
        private int totalApp;
        private int memory;
    //---------------------------------------------------------
    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154245 
    // NAMA : GABE DIMAS WICAKSANA
    // 
    //------------------- your code here-----------------------
        public void setMemory(int memory) {
            this.memory = memory;
        }

        public int getMemory() {
            return memory;
        }        
    //--------------------------------------------------------- 
    
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301154245 
    // NAMA : GABE DIMAS WICAKSANA
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
        public addApplication(AppStore appStore, int appId) {
            
        }
    //---------------------------------------------------------
    
        
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301154245 
    // NAMA : GABE DIMAS WICAKSANA
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
        public int getRemainingSize() {
            return appSize;
        }
    //---------------------------------------------------------
        
    
    // 
    // 5. Create method toString() : String here:
    // NIM : 1301154245 
    // NAMA : GABE DIMAS WICAKSANA
    // 
    // returns String that contains the smart phone total memory size, 
    // number of application installed, and remaining memory size 
    // 
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
    //------------------- your code here-----------------------
        return ("Memory size " + getMemory() + ", " + getApp() + " applications installed, remaining memory size: " + getRemainingSize());
    
    //---------------------------------------------------------
    }
}
