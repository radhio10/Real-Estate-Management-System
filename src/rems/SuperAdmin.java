
package rems;


public class SuperAdmin extends NAdmin {
     private double salary;
    void assign(Admin a){
        if(a.getid()<=9){
            System.out.println("This is Super Admin Panel");
        }
    }
}
