public class Driver {
    public static void main(String[] args) {
 		AppStore apps = new AppStore();
 		apps.createNewApp("Aplikasi 1",50);
 		apps.createNewApp("Aplikasi 2",200);
 		apps.createNewApp("Aplikasi 3",100);
 		apps.createNewApp("Aplikasi 4",500);
 		System.out.println(apps.toString());
        System.out.println(apps.getApp(2).toString());
        SmartPhone sp = new SmartPhone();
        sp.setMemory(400);
        System.out.println(sp.toString());
        sp.addApplication(apps, 1);
        System.out.println(sp.toString());
        sp.addApplication(apps, 2);
        System.out.println(sp.toString());
 	}
 }