
package rems;


public class Property {
    private String type;
    private String city;

    public String getCity() {
        return city;
    }
    
    Property(String t,String ci){
        type=t;
        city=ci;
    }
    public void pro(){
        System.out.println("This is Property panel");
    }
    public String gettype(){
        return type;
    }
}
