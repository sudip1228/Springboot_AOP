package atm_project;

import java.util.Scanner;

public class Atm_runner{

	
	static int pincode=7531;
	
	
	public static void main(String[] args) {
		System.out.println("Enter pin number \n");
		 
		pincodechecker();
	}
	
		public static void pincodechecker()
		
	
		{
			try {
			Scanner  in=new Scanner(System.in);
			 int pin= in.nextInt();
			if(pin==pincode) {
				Atm_transactions atm= new Atm_transactions();
				atm.option_menu();
			}
			else {
				try_pincode_again();
			}
			in.close();
			}catch(Exception e) {
				try_pincode_again();
				
			}
		}
		{
			System.out.println("invalid number");
		}
		public static void try_pincode_again() {
			
				System.out.println("wrong pin number");
				System.out.println("try again");
				pincodechecker();
		}
	}
	
