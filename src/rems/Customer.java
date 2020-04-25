
package rems;


public class Customer {
    private String name;
    private int con_no;

    public Customer(String name, int con_no) {
        this.name = name;
        this.con_no = con_no;
    }
  
    
    public void buy(){
        System.out.println("This is Customer panel");
    }
    
    String getname(){
        return name;
    }
    
}
