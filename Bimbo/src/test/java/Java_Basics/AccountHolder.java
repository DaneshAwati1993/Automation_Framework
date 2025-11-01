package Java_Basics;

public class AccountHolder {
	
	private static final Boolean True = null;
	String FirstName;
	String LastName;
	int Age;
	float AccountBalance;
	Boolean eligibleforCreditCard;

	public  void testeligibilityforCreditCard()
	{
		if (Age>25 && AccountBalance>=20000)
		{
			eligibleforCreditCard=true;
			
		}	
		else
		{
			eligibleforCreditCard=false;
		}
		
	}

}
