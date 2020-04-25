/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rems;

import java.util.ArrayList;

public class Commercial {
    private int Hotel_no;
    
    
   void checkHotel(ArrayList<Property>pl){
       for(Property ch:pl){
            if(ch.gettype().equals("Hotel")|| ch.getCity().equals("Feni"))
           System.out.println("This is Commercial Panel");
       }
       
   }
    
}
