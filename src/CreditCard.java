
public class CreditCard {
	
	private Money balance;
	private Money creditLimit;
	private Person owner;
	
	
	public CreditCard(Person NewcardHolder, Money limit)
	{
	owner = NewcardHolder;
	balance = new Money(0);
	creditLimit = new Money(limit);
	
	}
	
	public Money getBalance()
	{
		return new Money(balance);
		
	}
	public Money getCreditLimit()
	{
		return new Money(creditLimit);
	}
	public String getPersonal()
	{
		return owner.toString();
	}
	
	public void charge(Money amount)
	{
		Money temp = new Money(balance.add(amount));
		
		if (temp.compareTo(creditLimit) > 0)
			System.out.println("Error: Your credit limit is exceeded.");
		else
			balance = temp;
			System.out.println("Your balance.");
	}
	
	public void payment (Money amount) 
	{
		balance = balance.subtract(amount);
		System.out.println("");
	}
	

}
