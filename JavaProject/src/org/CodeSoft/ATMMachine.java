package org.CodeSoft;
import java.util.Scanner;
public class ATMMachine {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ATM obj=new ATM();
		obj.checkpin();
	}
}
class ATM{
	Scanner sc=new Scanner(System.in);
	float Balance;
	int PIN=5674;
	
	public void checkpin() {
		System.out.println("Enter your pin: ");
		int enteredpin=sc.nextInt();
		if(enteredpin==PIN) {
			menu();
		}else
		{
			System.out.println("Enter a valid pin: ");
			checkpin();
		}
	}
	public void menu()
	{
		System.out.println("Enter your choice: ");
		System.out.println("1. Check A/C Balance: ");
		System.out.println("2. Withdraw Money: ");
		System.out.println("3. Deposit Money: ");
		System.out.println("4. EXIT: ");
		int opt=sc.nextInt();
		if(opt==1) {
			checkBalance();
		}
		else if(opt==2)
		{
			withdrawMoney();
		}else if(opt==3) {
			depositMoney();
		}
		else if(opt==4) {
			return;
		}
		else{System.out.println("Enter a valid choice ");}
	}
	public void depositMoney() {
		System.out.println("Enter the Amount: ");
		float amount=sc.nextFloat();
		Balance=Balance+amount;
		System.out.println("Money Deposited Successfully"); 
		menu();
		
	}
	public void withdrawMoney() {
		System.out.println("Enter amount: ");
		float amount=sc.nextFloat();
		if(amount>Balance)
			System.out.println("Insufficient balance"); 
		else
		{
			Balance=Balance-amount;
			System.out.println("Money withdrawl Succeccful");
		}
		menu();
		
	}
	public void checkBalance() {
		System.out.println("Balance: "+Balance);
		menu();
	}
	
}
