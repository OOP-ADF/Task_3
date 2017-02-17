package task3exercise2;


public class StartUp {

    // 1. Declare your private attributes here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    //------------------- your code here-----------------------
    
    Member[] member = new Member[50];
    Project[] projectlist = new Project[50];
    int nMember=0;  
    int nProject=0;
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    //------------------- your code here-----------------------
    //  >>> ga ada di class diagram jadi ga usah di buat       
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    //------------------- your code here-----------------------
    //  >>> ga ada di class diagram jadi ga usah di buat   
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    // add an object Member m into array member, then
    // increment integer nMember+1
    //
    //------------------- your code here-----------------------
    
    public void addMember(Member m){
       while (nMember<=50){
           nMember=nMember+1;
           member[nMember]=m;
       }
    }
    //---------------------------------------------------------
    
    
    // 5. Declare method getMember( id : int ) : Member here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    // returns Member object from array member with array index = id
    //
    //------------------- your code here-----------------------
    
    public int getMember( int id ) {
        nMember=id;
        return nMember;
    }
     
    //---------------------------------------------------------
    
    
    // 6. Declare method createNewProject( projectName : String ) here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    // instantiate new Project object and insert it in array projectList, then
    // increment integer nProject+1
    //
    //------------------- your code here-----------------------
    public void createnewProject(String projectName){
       while (nProject<=50){
           nProject=nProject+1;
          // projectlist[nProject]=projectName;
       }
    }
    //---------------------------------------------------------
    
    
    // 7. Declare method getProject( id : int ) : Project here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    // returns Project object from array projectList with array index = id
    //
    //------------------- your code here-----------------------
    
    public int getProject( int id) {
        nProject=id;
        return nProject;
    }   
    
    //---------------------------------------------------------
    
    
    // 8. Declare method releaseProject( p : Project ) here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    // set release status of object Project p by invoking method releaseApp()
    //
    //------------------- your code here-----------------------
    public void releaseProject( Project p ){
        p.releaseApp();
    }
    //---------------------------------------------------------
    
    
    // 9. Declare method getNumReleasedProject() : int here:
    // NIM : 1301154502 
    // NAMA : Lailis Sa'adah 
    //
    // returns number of project with status is released
    //
    //------------------- your code here-----------------------
    public int getNumReleasedProject(){
        return nProject;      
    }
    //---------------------------------------------------------


    
    
}
