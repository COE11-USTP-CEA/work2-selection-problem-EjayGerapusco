import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("Tindahan ni Ejay");
        List<Item> prod = new ArrayList();
        float total = 0.0f;

        Item n1 = new Item("Johnson's", "Powder", 15.00f);
        Item f2 = new Item("Magic", "Soda cracker", 6.00f);
        Item g2 = new Item("Champion", "Detergent", 6.00f);
        Item t4 = new Item("Clover", "Chicheria", 20.00f);
        Item r5 = new Item("Sunsilk", "Conditioner", 12.00f);
       

        inv.add(n1);
        inv.add(f2);
        inv.add(g2);
        inv.add(t4);
        inv.add(r5);
      
        for(Item i: inv){
           
           if(e.Getname()=="Conditioner"){
                System.out.println("Naa!");
            }
            
            else{
                System.out.println("Wala!");
            }
            total = total + e.Getprice();
        }
        
        System.out.println(total);
    }
}
