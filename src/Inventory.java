import java.util.ArrayList;

public class Inventory 
{
	private ArrayList<Item_List> Inventory_List = new ArrayList<Item_List>();
	private ArrayList<Order> Outstanding_Orders = new ArrayList<Order>();
	private ArrayList<Order> Order_History = new ArrayList<Order>();
	private final int ONE_YEAR = 365;
	//ArrayList<Item_List> Bad_Inventory_List = new ArrayList<Item_List>();
	
	public void AddToInventory(Item_List list_that_holds_new_item, Item new_item)
	{
		if(Inventory_List.contains(list_that_holds_new_item))
		{
			list_that_holds_new_item.AddToItemList(new_item);
		}
		else
		{
			Inventory_List.add(list_that_holds_new_item);
			list_that_holds_new_item.AddToItemList(new_item);
		}
	}
	
	public void RemoveItemFromInventory(Item_List list_that_holds_item, Item existing_item)
	{
		list_that_holds_item.RemoveFromItemList(existing_item);
		
		if(list_that_holds_item.GetSize() == 0)
		{
			Inventory_List.remove(list_that_holds_item);
		}
	}
	
	public void AddToOrderHistory(Order new_order)
	{
		Order_History.add(new_order);
	}
	
	public void RemoveFromOrderHistory()
	{
		for(int i = 0; i < Order_History.size(); i++)
		{
			if(Order_History.get(i).GetNumberOfDaysSinceOrder() <= ONE_YEAR)
			{
				Order_History.remove(i);
			}
		}
	}
	
	public void AddToOutstandingOrder(Order nOrder)
	{
		Outstanding_Orders.add(nOrder);
	}
	
	public void RemoveFromOutstandingOrder(Order nOrder)
	{
		Outstanding_Orders.remove(nOrder);
	}
	
	public void PrintInventoryList()
	{
		//print inventory list
	}
	
	public void PrintOutStandingOrders()
	{
		//print outstanding order list
	}
	
	public void PrintOrderHistory()
	{
		//print order history
	}
	
	
	
}
