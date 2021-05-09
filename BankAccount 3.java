public class BankAccount {
    double balance;

    public BankAccount(double x)
    {
        balance = x;
    }

    public void withdraw(double price)
    {
        balance = balance - price;
    }

    public void deposit(double price)
    {
        balance = balance + price;
    }

    public BankAccount()
    {
        balance = 100;
    }

    public String toString()
    {
        return "The balance is" + " " + balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public double setBalance(double x)
    {
        balance = x;
        return balance;
    }	 	  	   	 	      	    	        	 	

}