package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301154544, 
    // NAMA : NISA NURHARDINI, 
    //
    //------------------- your code here-----------------------
    private String name;
    private String specialization;
    private int projectWorked = 0;
    //---------------------------------------------------------
    
    // 2. Declare your 2 Constructor here:
    // NIM : 1301154544, 
    // NAMA : NISA NURHARDINI, 
    //
    //------------------- your code here-----------------------
    public Member (String name){
        this.name = name;
        
    }
    
    public Member (String name, specialization){
        this.name = name;
        this.specialization = specialization;
    }
    
    //---------------------------------------------------------
    public String getName() {
        return name;
    }    

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getProjectWorked() {
        return projectWorked;
    }

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154544,
    // NAMA : NISA NURHARDINI, 
    //
    //------------------- your code here-----------------------
    public void setProjectWorked(int projectWorked) {    
        this.projectWorked = projectWorked;
    }

    //---------------------------------------------------------
    // 4. Create method toString() : String here:
    // NIM : 1301154544,
    // NAMA : NISA NURHARDINI, 
    //
    // returns String that contains member name, specialization,
    // and number of project worked
    //
    // example : "Member Alex specialized in Java Programming, 
    //            worked on 5 project(s)"
    public String toString() {
        //------------------- your code here-----------------------
        String b = "Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project(s)";
        return b;
        
        //---------------------------------------------------------
    }

}
