package day_15_10;

public class InventoryMainELC {

	public static void main(String[] args) {
		InventoryItem item1=new InventoryItem("Apples",15,10);
        double total=item1.calculateTotalValue();
        System.out.println(item1);
        System.out.println("Total Value of Apples in Stock: "+total);
        
        item1=new InventoryItem("Oranges",-5.0,20);
        double total1=item1.calculateTotalValue();
        System.out.println(item1);
        System.out.println("Total Value of Oranges in Stock: "+total1);
        
        item1=new InventoryItem("Bananas",5.0,-10);
        double total2=item1.calculateTotalValue();
        System.out.println(item1);
        System.out.println("Total Value of Apples in Stock: "+total2);
        
        item1=new InventoryItem("",8.0,10);
        double total3=item1.calculateTotalValue();
        System.out.println(item1);
        System.out.println("Total Value of Apples in Stock: "+total3);
	}

}
