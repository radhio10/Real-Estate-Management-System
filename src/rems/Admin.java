
package rems;


public  class Admin {
    private int id;
    private String name;
    
    Admin(int i,String n){
        id=i;
        name=n;
    }
    public void manage(){
        System.out.println("This is Admn Panel");
    }
    int getid(){
       return id;
   }

    
}
