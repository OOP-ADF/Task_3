package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301154525 
    // NAMA : Karina Hasya Utami Dewi 
    //
    private String name;
    private String specialization;
    private int projectwork;
   
    
    // 2. Declare your 2 Constructor here:
    // NIM : 1301154525
    // NAMA : Karina Hasya Utami Dewi 
    //
    public Member (String name){
        this.name = name;
    }
    
    public Member (String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154525
    // NAMA : Karina Hasya Utami Dewi 
    //
     public String getName() {   
       return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getProjectwork() {
        return projectwork;
    }
    public void setProjectwork(int projectwork) {    
        this.projectwork = projectwork;
    }

    // 4. Create method toString() : String here:
    // NIM : 1301154525
    // NAMA :   Karina Hasya Utami Dewi  
    //
    // returns String that contains member name, specialization,
    // and number of project worked
    //
    // example : "Member Alex specialized in Java Programming, 
    //            worked on 5 project(s)"
    @Override
    public String toString() {
       String a = "Member "+name+" specialized in  "+specialization+" and already worked on "+projectwork+" projec(s) ";
        
        return a; 
               
    }

}  

