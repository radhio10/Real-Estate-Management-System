
package rems;


public class WillSeller extends Seller implements check {
    private String Address;

    public WillSeller(String n, int no,String a) {
        super(n, no);
        Address=a;
    }

  public void willmust(Seller s){
      if(Address.equals("Dhanmondi")){
          System.out.println("This is will Seller Panel");
      }
  }
 
   
    
}
