
package rems;


public class MustBuyer extends Customer {
    private int cash;
    public MustBuyer(String n, int no) {
        super(n, no);
        
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
    
    public void checkcash(Customer cs){
        if(cs.getname().equals("Sagar")){
            System.out.println("Name: " + cs.getname());
        }
    }
    
}
