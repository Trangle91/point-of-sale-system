
public class Order 
{
	private int number_of_days = 0;
	private Item_List Item_Order = new Item_List();
	private int unique_order_number;
	
	public int GetNumberOfDaysSinceOrder()
	{
		return number_of_days;
	}
	
	public void IncrementNumberOfDaysSinceOrder()
	{
		number_of_days++;
	}
	
	public void GenerateUniqueOrderNumber(int num)
	{
		unique_order_number = num;
	}
	
	public void AddToOrder(Item new_item)
	{
		//Add new_item to Item_Order List
	}
	
	public void RemoveFromOrder(Item existing_item)
	{
		//Remove existing_item from Item_Order List
	}
	
	public void Print()
	{
		//print the Item_Order List
	}
	
	
}
