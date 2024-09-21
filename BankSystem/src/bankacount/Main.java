package bankacount;

public class Main {

	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount(1000,-1000, "bob");
		BankAccount acct2 = new BankAccount(1000,-1000, "lisa");

		
        boolean success = acct1.withdraw(100);
        System.out.println("success=" + success + ", balance=" + acct1.getBalance());
        
        success = acct1.transfer(acct2, 400);
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());  
        
       success = acct1.transfer(acct2,1600);
       if(!success) {
    	   System.out.println("cant");
       }
       else {
    	   System.out.println(acct1.toString());
           System.out.println(acct2.toString());  
       }

	}

}
