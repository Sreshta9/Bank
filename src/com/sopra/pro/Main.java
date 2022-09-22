package com.sopra.pro;

public class Main 
{
private double balance=1000;
double deposit (int amount)
{
	
	balance =balance+amount;
	return balance;
	
}
double withdraw(int withdraw)
{
	if(balance>=withdraw)
	{
		balance=balance-withdraw;
		return balance;
	}
	else
	{
		System.out.println("amount insufficient");
	}
	return 0;
}
void display()
{
	System.out.println(balance);
}
	public static void main(String[] args) {
		Bank b=new Bank(56,"AB","5788");
		System.out.println(b);
		Main m=new Main();
		m.display();
		m.deposit(2000);
		m.display();
		m.withdraw(2500);
		m.display();
		
	}

}
