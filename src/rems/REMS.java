
package rems;

import java.util.ArrayList;
public class REMS {

    
    public static void main(String[] args) {
       Admin a=new Admin(5,"Radhio");
       SuperAdmin sa=new SuperAdmin();
       
       WillSeller ws=new WillSeller("Ovi",015,"Dhanmondi");
       MustSeller ms=new MustSeller("Minhaj",01,"Laptop");
       WillBuyer wb=new WillBuyer("Aftab",012);
       MustBuyer mb=new MustBuyer("Sagar",013);
       Property p1=new Property("Home","Dhaka");
       Property p2=new Property("Hotel","Feni");
       Residential r=new Residential();
       Commercial co=new Commercial();
       ArrayList<Property>p=new ArrayList();
       ArrayList<Property>pl=new ArrayList();
       p.add(p1);
       p.add(p2);
       pl.add(p1);
       pl.add(p2);
       a.manage();
       sa.assign(a);
       sa.information(a);
       ws.sell();
       ws.willmust(ms);
       ms.willmust(ms);
       wb.buy();
       wb.checkbuyer(4);
       wb.checkbuyer(60000.00);
       mb.checkcash(mb);
       mb.setCash(100000);
       r.res(p);
       co.checkHotel(pl);

    }
    
}
