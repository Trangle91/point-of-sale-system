
public class Register 
{
	private String logInTime;
	private String logOutTime;
	private double salesAmount;
	private String employeeUser;
	private int registerNumber;

	public Register() 
	{

	}

	public void returnItem(Item item) 
	{
		//Add item to inventory item list
		//subtract salesAmount by item value
	}

	public void sellItem(Item item) 
	{
		//Add item to temp list because we want to allow cancellation (once they hit complete order it will remove these items from the inventory)
		//add salesAmount by item value
	}

	public void cancelOrder() 
	{
		//GUI button action that will delete the temp buffer
		//remove price of temp list cost value from salesAmount
	}

	public String getLogInTime() 
	{
		return logInTime;
	}

	public void setLogInTime(String logInTime) 
	{
		this.logInTime = logInTime;
	}

	public String getLogOutTime() 
	{
		return logOutTime;
	}

	public void setLogOutTime(String logOutTime) 
	{
		this.logOutTime = logOutTime;
	}

	public double getSalesAmount() 
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

	public String getEmployeeUser() 
	{
		return employeeUser;
	}

	public void setEmployeeUser(String employeeUser) 
	{
		this.employeeUser = employeeUser;
	}

	public int getRegisterNumber() 
	{
		return registerNumber;
	}

	public void setRegisterNumber(int registerNumber) 
	{
		this.registerNumber = registerNumber;
	}
}
