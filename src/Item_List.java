import java.util.ArrayList;

public class Item_List
{
	ArrayList<Item> ItemList = new ArrayList<Item>();
	
	public ArrayList<Item> GetItemList()
	{
		return ItemList;
	}
	
	public int GetSize()
	{
		return ItemList.size();
	}
	
	public void AddToItemList(Item item)
	{
		ItemList.add(item);
	}
	
	public void RemoveFromItemList(Item item)
	{
		ItemList.remove(item);
	}
	
}
