package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301154250
    // NAMA : DJODY FAZA RAHARDIAN 
    //
    //------------------- your code here-----------------------
    private String name;
    private String specialization;
    private int projectWorked = 0;
    //---------------------------------------------------------
    
    // 2. Declare your 2 Constructor here:
    // NIM : 1301154250
    // NAMA : DJODY FAZA RAHARDIAN 
    //
    //------------------- your code here-----------------------
    public Member(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    
    public Member (String name){
        this.name = name;
    }
    
    //---------------------------------------------------------
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154250
    // NAMA : DJODY FAZA RAHARDIAN 
    //
    //------------------- your code here-----------------------
    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getProjectWorked() {
        return projectWorked;
    }
    
    
    //---------------------------------------------------------
    
    // 4. Create method toString() : String here:
    // NIM : 1301154250
    // NAMA : DJODY FAZA RAHARDIAN 
    //
    // returns String that contains member name, specialization, 
    // and number of project worked  
    // 
    // example : "Member Alex specialized in Java Programming, 
    //            worked on 5 project(s)"
    public String toString() {
    //------------------- your code here-----------------------
        
        return "Nama : " + name + '\n' + "Spesialisasi : " + specialization + '\n' + "Hasil Proyek : " + projectWorked + '\n'; 
    
        /*return null;*/
    
    //---------------------------------------------------------
    }

}
