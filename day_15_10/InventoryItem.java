package day_15_10;

public class InventoryItem {
	String itemName;
	double pricePerUnit;
	int quantityInStock;
	public InventoryItem(String itemName,double pricePerUnit,int quantityInStock)
	{
		this.itemName=itemName;
		this.pricePerUnit=pricePerUnit;
		this.quantityInStock=quantityInStock;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	public double calculateTotalValue()
	{
		return pricePerUnit*quantityInStock;
	}
	@Override
	public String toString() {
		if(pricePerUnit<=0)
		{
			return "Error message indicating invalid price.";
		}
		else if(quantityInStock<=0)
		{
			return "Error message indicating invalid quantity.";
		}
		else if(itemName=="")
		{
			return " Error message indicating invalid item name.";
		}
		else
		{
		return "InventoryItem [itemName=" + itemName + ", pricePerUnit=" + pricePerUnit + ", quantityInStock="
				+ quantityInStock + "]";
		}
	}
	
}
