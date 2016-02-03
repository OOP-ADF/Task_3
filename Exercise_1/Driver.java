/*
Gentur Cipto Tri Atmaja
1301140239
IF 38-09
*/

public class Driver 
{
    public void main(String[] args)
    {
        AppStore aps = new AppStore();
        aps.createNewApp("app1,100");
        aps.createNewApp("app1,200");
        aps.createNewApp("app1,300");
        aps.createNewApp("app1,400");
        
        System.out.println();
        System.out.println(aps.toString());
        System.out.println();
        System.out.println(aps.getApp(1).toString());
        System.out.println(aps.getApp(2).toString());
        
        SmartPhone smart = new SmartPhone();
        smart.setMemory(300);
        System.out.println();
        System.out.println(smart.toString());
        smart.addAplication(aps, 0);
        smart.addAplication(aps, 1);
        System.out.println();
        System.out.println(smart.toString());       
    }
}

