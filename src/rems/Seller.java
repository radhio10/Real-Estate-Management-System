
package rems;


public class Seller {
    private String name;
    private int con_no;
    
    Seller(String n, int no){
        name=n;
        con_no=no;
    }
    void sell(){
        System.out.println("This is Seller Panel");
    }
    
}

interface check{
    public void willmust(Seller s);
}
