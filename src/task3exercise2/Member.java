package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301154525 
    // NAMA : Karina Hasya Utami Dewi 
    //
    private String Name;
    private String Specialization;
    private int projectwork;
   
    
    // 2. Declare your 2 Constructor here:
    // NIM : 1301154525
    // NAMA : Karina Hasya Utami Dewi 
    //
    public Member (){
        this.Name = "Name";
        this.Specialization = "Specialization";
        this.projectwork = 0;
    }
    
    public Member (String Name, String Specialization){
        this.Name = "Name";
        this.Specialization = "Specialization";
        this.projectwork = 0; 
    }
    public String getName() {   
       return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public int getProjectwork() {
        return projectwork;
    }

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154525
    // NAMA : Karina Hasya Utami Dewi 
    //
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
       String a = "Member "+Name+" specialized in  "+Specialization+" and already worked on "+projectwork+" projec(s) ";
        
        return a; 
               
    }

}  

