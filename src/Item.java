
public class Item 
{
	protected String name;
	protected int uniqueID;
	protected String supplier;
	protected double price;
	//protected String state;

	public Item() 
	{

	}
	
	public void SetName(String n_name)
	{
		name = n_name;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public void GenerateUniqueID(int value)
	{
		uniqueID = value; //value will be a counter in the main gui that will increment everytime we create a new item
	}
	
	public int GetUniqueID()
	{
		return uniqueID;
	}
	
	public void SetSupplier(String supp)
	{
		supplier = supp;
	}
	
	public String GetSupplier()
	{
		return supplier;
	}
	
	public void SetPrice(double value)
	{
		price = value;
	}
	
	public double GetPrice()
	{
		return price;
	}
	
}
