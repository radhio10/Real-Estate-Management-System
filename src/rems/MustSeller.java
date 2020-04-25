
package rems;


public class MustSeller extends Seller implements check {
    private String Product;

    public MustSeller(String n, int no, String p) {
        super(n, no);
        Product=p;
    }
      public void willmust(Seller s){
      if(Product.equals("Laptop")){
          System.out.println("This is must Seller Panel");
      }
  }
}
