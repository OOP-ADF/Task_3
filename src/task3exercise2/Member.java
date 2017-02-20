package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301154133
    // NAMA : Afif Darmawan
    // Kelas : IF 39-07
    //------------------- your code here-----------------------
    private String name;
    private String specialization;
    private int projectWorked;
    //---------------------------------------------------------
    
    // 2. Declare your 2 Constructor here:
    // NIM : 1301154133
    // NAMA : Afif Darmawan
    // Kelas : IF 39-07
    //------------------- your code here-----------------------
    public Member(String name){
        this.name = name;
    }
    public Member(String name, String special){
        this.name = name;
        this.specialization = special;
    }
    
    //---------------------------------------------------------
    

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154133
    // NAMA : Afif Darmawan
    // Kelas : IF 39-07
    //------------------- your code here-----------------------
    public int getProjectWorked() {
        return projectWorked;
    }
    public String getName() {
        return name;
    
    }    

    public String getSpecialization() {
        return specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setProjectWorked(int projectWorked) {
        this.projectWorked = projectWorked;
    }
    

    //---------------------------------------------------------
    // 4. Create method toString() : String here:
    // NIM : 1301154133
    // NAMA : Afif Darmawan
    // Kelas : IF 39-07
    // returns String that contains member name, specialization,
    // and number of project worked
    //
    // example : "Member Alex specialized in Java Programming, 
    //            worked on 5 project(s)"
    public String toString() {
        //------------------- your code here-----------------------
        return "Member "+name+" specialized in "+specialization+" Programming, worked on "+projectWorked+" project(s)";
        
        //---------------------------------------------------------
    }

}

