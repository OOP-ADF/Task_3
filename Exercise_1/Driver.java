public class Driver {
	public static void main(String[] args) {
        AppStore aps=new AppStore();
        aps.createNewApp("app1",50);
        System.out.println(aps.toString());
        SmartPhone sm=new SmartPhone();
        sm.setMemory(200);
        
        sm.addApplication(aps, 0);
        System.out.println(sm.toString());
    }
}
