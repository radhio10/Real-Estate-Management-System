
package rems;

import java.util.ArrayList;


public class Residential  {
    private int House_no;
   
    void res(ArrayList<Property> p){
        for(Property a:p){
            if(a.gettype().equals("Home")|| a.getCity().equals("Dhaka")){
                System.out.println("This is Residantial Panel");
            }
        }
    }
}
