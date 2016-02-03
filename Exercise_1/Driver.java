public class Driver {
    public static void main(String[] args) {
        AppStore aps=new AppStore();
        aps.createNewApp("app1",100);
	    	aps.createNewApp("app2",200);
		    aps.createNewApp("app3",300);
		    aps.createNewApp("app4",400);
        System.out.println(aps.toString());
		    System.out.println(aps.getApp(0).toString());
		    System.out.println(aps.getApp(1).toString());
		    System.out.println(aps.getApp(2).toString());
		    System.out.println(aps.getApp(3).toString());
        SmartPhone sm=new SmartPhone();
        sm.setMemory(300);
        sm.addApplication(aps, 0);
		    sm.addApplication(aps, 1);
		    sm.addApplication(aps, 2);
		    sm.addApplication(aps, 3);
        System.out.println(sm.toString());
    }
}
