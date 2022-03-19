package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the price of the item being purchased: ");
		double price = sc.nextDouble();
		
		System.out.println("Please enter the amount of money tendered by the customer: ");
		double paid = sc.nextDouble();
		
		if (paid == price) {
			System.out.println("Thank you for your patronage!");
		}else if (paid < price) {
			System.out.println("The amount of money paid is less than the amount owed. Please try again.");
		}
		else {
			changeTendered(price, paid);
			System.out.println("Thank you for your patronage!");
		}
	}
	
		public static void changeTendered(double price, double paid) {
			 
			double changeNeeded = paid - price;
			System.out.println("change needed first initilization = " + changeNeeded);
			double changeRemaining = changeNeeded;
			System.out.println("change remaining first initilization = " + changeRemaining);
			double changeTendered = 0;
			System.out.println("change tendered first initilization = " + changeTendered);	
			if (changeTendered < changeNeeded) {
//				changeTendered++;
//				System.out.println(changeTendered);
					changeTendered = moneyTake(changeRemaining, 20);
					changeRemaining -= changeTendered; 
					changeTendered = moneyTake(changeRemaining, 10);
					changeRemaining -= changeTendered; 
					changeTendered = moneyTake(changeRemaining, 5);
					changeRemaining -= changeTendered; 
					changeTendered = moneyTake(changeRemaining, 1);
					changeRemaining -= changeTendered; 
					changeTendered = moneyTake(changeRemaining, .25);
					changeRemaining -= changeTendered; 
					changeTendered = moneyTake(changeRemaining, .10);
					changeRemaining -= changeTendered; 
					changeTendered = moneyTake(changeRemaining, .05);
					changeRemaining -= changeTendered; 
					changeTendered = moneyTake(changeRemaining, .01);
					changeRemaining -= changeTendered; 
					
					
					
//					System.out.println(changeRemaining);
			
				
			}
			 
			
		 }
		
		public static double moneyTake(double changeRem, double denom)  {
					double changeRemaining = changeRem % denom;
					int count = (int)(changeRem / denom); 
//					System.out.println(changeRemaining);
					System.out.println(count + "  " + currencyName(denom));
				
			
			 return (count*denom);
		}
		
		public static String currencyName(double denom) {
			String type = " ";
			denom *= 100;
			switch ((int)denom) {
			case 2000:
				type = "Twenties";
				break;
			case 1000:
				type = "Tens";
				break;
			case 500:
				type = "Fives";
				break;
			case 100:
				type = "Ones";
				break;
			case 25:
				type = "Quarters";
				break;
			case 10:
				type = "Dimes";
				break;
			case 5:
				type = "Nickles";
				break;
			case 1:
				type = "Pennies";
				break;
			default:
				break;
			}
			
			return type;
		}
//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
		
		
}

