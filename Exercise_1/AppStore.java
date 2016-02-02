// SELVI WIDYAPRADITIA PANGESTI, 1301144041, IF3801

public class AppStore {
    private Application[] appList=new Application[100];
    private int totalApp;

    public void createNewApp(String appName, int appSize) {
        Application p = new Application(appName, appSize);
        appList[totalApp]=p;
        totalApp++;
    }

    public Application getApp(int id) {
        return appList[id];
    }

    public int getTotalApp() {
        return totalApp;
    }

    public Application[] getAppList() {
        return appList;
    }

    public String toString() {
        return "There are " + getTotalApp() + " applications ready to install";
    }
}
