public class AppStore {
    private Application[] listApp = new Application[100];
    private int totalApp;
    public void createNewApp(String NamaApp, int SizeApp){
        totalApp++;
        listApp[totalApp]= new Application (NamaApp, SizeApp);        
    }
    public Application getApp(int id){
        return listApp[id];
    }
    public int getTotalApp(){
        return totalApp;
    }
    public Application gettListApp(){
        return listApp[100];
    }
    public String toString(){
        return "there are "+totalApp+" Application ready to install";
    }
    
}
