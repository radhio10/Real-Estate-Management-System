
package rems;


public class WillBuyer extends Customer {
   
    public WillBuyer(String n, int no) {
        super(n, no);
        
    }
    
    public void checkbuyer(int id){
        if(id>=5){
            System.out.println("This is will Buyer Panel");
        }
    }
     void checkbuyer(double cash){
        if(cash>=50000.00){
            System.out.println("This is will Buyer Panel");
        }
        
    }
    
}
