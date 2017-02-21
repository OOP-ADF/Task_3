package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301154567, 
    // NAMA : Nindia Cahyaning Putri, 
    //
    //------------------- your code here-----------------------

    private String name; //nama member
    private String specialization;  //spesialisasi
    private int projectWorked;  //lama bekerja

    //---------------------------------------------------------

    // 2. Declare your 2 Constructor here:
    // NIM : 1301154567, 
    // NAMA : Nindia Cahyaning Putri, 
    
    //------------------- your code here-----------------------
    
    public Member (String name){
        this.name = name;
    }
            
     public Member (String name, String specialization) {
         this.name = name;
         this.specialization = specialization;
     }

    //---------------------------------------------------------       
     
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154567, 
    // NAMA : Nindia Cahyaning Putri, 
    //
    //------------------- your code here-----------------------

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

    public void setProjectWorked(int projectWorked) {
        this.projectWorked = projectWorked;
    }
    
    //---------------------------------------------------------     
    
    // 4. Create method toString() : String here:
    // NIM : 1301154567, 
    // NAMA : Nindia Cahyaning Putri, 
    //
    // returns String that contains member name, specialization, 
    // and number of project worked  
    // 
    // example : "Member Alex specialized in Java Programming, 
    //            worked on 5 project(s)"
 
    @Override
    public String toString() {
    //------------------- your code here-----------------------
       
	 return "Member " +getName()+ "specialized in " +getSpecialization()+ ", worked on " +getProjectWorked();
    
    //---------------------------------------------------------
    }

}