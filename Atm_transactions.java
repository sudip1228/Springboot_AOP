package atm_project;

import java.util.Scanner;

public class Atm_transactions {
	
	private Scanner in;
	private int balance;
	
	
	public void option_menu()
	{
		System.out.println("press 1,2 or 3");
		System.out.println("1:withdrawl");
		System.out.println("2:deposit");
		System.out.println("3:balance enquiry");
		
		in=new Scanner(System.in);
		int transaction= in.nextInt();
	
		switch(transaction){
		case 1:
		withdraw();
		break;
		
		case 2:	
		deposit();
		break;
		
		case 3:
		balance_enquiry();
		break;
		
		default:
		System.out.println("Entered number is invalid");
		System.out.println("try again");
		tryagain();
		}
		
		
	}
public void withdraw() {
	System.out.println("Enter withdrawl amount:\n ");
	in=new Scanner(System.in);
	int amount= in.nextInt();
	if(balance> amount) {
		balance=balance-amount;
		System.out.println("balance is: "+ balance +"\nwithdrawl amount is: "+amount );
		another_transaction();
	}
	else {
		System.out.println("withdraw amount exceds balance");
		another_transaction();
	}
}
public void deposit() {
	System.out.println("Enter deposit amount:\n ");
	in=new Scanner(System.in);
	int amount= in.nextInt();
	balance=balance+amount;
	System.out.println("balance is: "+ balance +"\ndeposit amount is: "+amount );
	another_transaction();

}
public void balance_enquiry() {
	System.out.println("balance is: "+ balance  );
	another_transaction();
}
public void another_transaction() {
	System.out.println("1:option menu");
	System.out.println("2:exit");
	in=new Scanner(System.in);
	int number= in.nextInt();
	if(number ==1) {
	option_menu();
	}
	else if(!(number ==2||number==1)) {
		
		System.out.println("wrong selection");
	}

}
public void tryagain()
{
	option_menu();
}
}
