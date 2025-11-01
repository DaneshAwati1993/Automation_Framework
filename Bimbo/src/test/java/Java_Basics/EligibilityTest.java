package Java_Basics;

public class EligibilityTest {
	
	public static void main(String[] args)
	{
		AccountHolder tom=new AccountHolder();
		AccountHolder henry=new AccountHolder();
		AccountHolder sarah=new AccountHolder();
		
		tom.FirstName="Tom";
		tom.LastName="Smith";
		tom.Age=21;
		tom.AccountBalance=10000;
		tom.testeligibilityforCreditCard();
		System.out.println("Is Tom Eligible for the CC : " +tom.eligibleforCreditCard);
		
		henry.FirstName="Henryy";
		henry.LastName="Hil";
		henry.Age=31;
		henry.AccountBalance=20000;
		henry.testeligibilityforCreditCard();
		System.out.println("Is Tom Eligible for the CC : " +henry.eligibleforCreditCard);
		
		sarah.FirstName="Sarah";
		sarah.LastName="Miller";
		sarah.Age=41;
		sarah.AccountBalance=30000;
		sarah.testeligibilityforCreditCard();
		System.out.println("Is Tom Eligible for the CC : " +sarah.eligibleforCreditCard);
	}

}
