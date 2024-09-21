package bankacount;

public class BankAccount {
    private int balance = 0;
    private int minBalance = -1000;
    private String owner = " ";
    
    /**
     * @param balance account initial balance - cannot be less then minimum
     * @param minBalance minimum balance
     */
    public BankAccount(int balance, int minBalance, String owner) {
        this.balance = balance;
        this.minBalance = minBalance;
        this.owner = owner;
    }
    
    public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
    
    public int deposit(int ammount) {
    	balance = balance + ammount;
    	return balance;
    }
    
    public boolean transfer(BankAccount target, int amount) {
    	if (withdraw(amount) == true) {
    		target.deposit(amount);
    		return true;
    	}
    	else {
    		return false;
    	}	
    }
    
    public String toString() {
    	return "balance of " + this.owner + "=" + balance + " minBalance= " + this.minBalance;
    }

    public int getBalance() {
    	return balance; 
    	
    }

    public int getminBalance() {
    	return minBalance; 
    }
    
    public void setBalance(int balance) {
    	if(balance> minBalance) {
    		this.minBalance = balance;
    	}
    }
}
