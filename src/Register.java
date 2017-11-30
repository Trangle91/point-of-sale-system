import java.util.ArrayList;

public class Register 
{
	private String logInTime;
	private String logOutTime;
	private double salesAmount;
	private String employeeUser;
	private int registerNumber;
	private ArrayList<Item> Return_List = new ArrayList<Item>();
	private ArrayList<Item> Sell_List = new ArrayList<Item>();

	public Register() 
	{
		
	}

	public void ReturnItem(Item item) 
	{
		//Add item to inventory item list
		Return_List.add(item);
	}

	public void sellItem(Item item) 
	{
		//Add item to temp list because we want to allow cancellation (once they hit complete order it will remove these items from the inventory)
		Sell_List.add(item);
	}

	public void CancelOrder() 
	{
		//GUI button action that will delete the temp buffer
		ClearReturnList();
		ClearSellList();
	}
	
	public void CompleteSellOrder()
	{
		if(!Sell_List.isEmpty())
		{
			for(Item i : Sell_List)
			{
				salesAmount += i.GetPrice();
			}
		}
	}
	
	public void CompleteReturnOrder()
	{
		if(!Return_List.isEmpty())
		{
			for(Item i : Return_List)
			{
				salesAmount -= i.GetPrice();
			}
		}
	}
	
	public void ClearReturnList()
	{
		Return_List.clear();
	}
	
	public void ClearSellList()
	{
		Sell_List.clear();
	}
	
	public ArrayList<Item> GetReturnList()
	{
		return Return_List;
	}
	
	public ArrayList<Item> GetSellList()
	{
		return Sell_List;
	}

	public String getLogInTime() 
	{
		return logInTime;
	}

	public void SetLogInTime(String logInTime) 
	{
		this.logInTime = logInTime;
	}

	public String GetLogOutTime() 
	{
		return logOutTime;
	}

	public void SetLogOutTime(String logOutTime) 
	{
		this.logOutTime = logOutTime;
	}

	public double GetSalesAmount() 
	{
		return salesAmount;
	}

	public void AddToSalesAmount(double value) 
	{
		salesAmount += value;
	}
	
	public void SubtractFromSalesAmount(double value)
	{
		salesAmount -= value;
	}

	public String GetEmployeeUser() 
	{
		return employeeUser;
	}

	public void SetEmployeeUser(String employeeUser) 
	{
		this.employeeUser = employeeUser;
	}

	public int GetRegisterNumber() 
	{
		return registerNumber;
	}

	public void SetRegisterNumber(int registerNumber) 
	{
		this.registerNumber = registerNumber;
	}
}
