package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Math.ceil(0);

		System.out.println("Please enter the price of the item being purchased: ");
		double price = sc.nextDouble();

		System.out.println("Please enter the amount of money tendered by the customer: ");
		double paid = sc.nextDouble();

		if (paid == price) {
			System.out.println("Thank you for your patronage!");
		} else if (paid < price) {
			System.out.println("The amount of money paid is less than the amount owed. Please try again.");
		} else {
			paid *= 100;
			price *= 100;
			System.out.println("Please give back: ");
			changeTendered((int) price, (int) paid);
			System.out.println("");
			System.out.println("Thank you for your patronage!");
		}
	}

	public static void changeTendered(int price, int paid) {

		int lm = (paid - price);
		int changeNeeded = lm;
//		System.out.println("change needed first initilization = " + changeNeeded);
//		System.out.println("change needed first initilization = " + lm);
		int changeRemaining = changeNeeded;
//		System.out.println("change remaining first initilization = " + changeRemaining);
		int changeTendered = 0;
//		System.out.println("change tendered first initilization = " + changeTendered);
		if (changeTendered < changeNeeded) {
//				changeTendered++;
//				System.out.println(changeTendered)

			changeTendered = moneyTake(changeRemaining, 2000);

			changeRemaining = (changeRemaining) - (changeTendered);

			changeTendered = moneyTake(changeRemaining, 1000);

			changeRemaining -= changeTendered;
			changeTendered = moneyTake(changeRemaining, 500);
			changeRemaining -= changeTendered;
			changeTendered = moneyTake(changeRemaining, 100);
			changeRemaining -= changeTendered;
			changeTendered = moneyTake(changeRemaining, 25);
			changeRemaining -= changeTendered;
			changeTendered = moneyTake(changeRemaining, 10);
			changeRemaining -= changeTendered;
			changeTendered = moneyTake(changeRemaining, 5);
			changeRemaining -= changeTendered;
			changeTendered = moneyTake(changeRemaining, 1);
			changeRemaining -= changeTendered;

//					System.out.println(changeRemaining);

		}

	}

	public static int moneyTake(int changeRem, int denom) {
//		double changeRemaining = changeRem % denom;
		int count = (changeRem / denom);

		if (count > 0) {
			System.out.print(count + " " + currencyName(denom) + amountCheck(denom, count) + commaPeriod(changeRem));
		}
//		System.out.println(count);

		return (count * denom);
	}

	public static String currencyName(int denom) {
		String type = " ";

		switch (denom) {
		case 2000:
			type = "Twenty dollar bill";
			break;
		case 1000:
			type = "Ten dollar bill";
			break;
		case 500:
			type = "Five dollar bill";
			break;
		case 100:
			type = "One dollar bill";
			break;
		case 25:
			type = "Quarter";
			break;
		case 10:
			type = "Dime";
			break;
		case 5:
			type = "Nickle";
			break;
		case 1:
			type = "Penn";
			break;
		default:
			break;
		}

		return type;
	}

	public static String amountCheck(int denom, int count) {
		String ending = "";
		if (denom == 1) {
			ending = "y";
		}
		if (count > 1) {
			switch (denom) {
			case 2000:
				ending = "s";
				break;
			case 100:
				ending = "s";
				break;
			case 25:
				ending = "s";
				break;
			case 10:
				ending = "s";
				break;
			case 5:
				ending = "s";
				break;
			case 1:
				ending = "ies";
				break;
			default:
				break;
			}

		}
		return ending;
	}
	public static String commaPeriod(int changeRemaining) {
		
		String punct = "";
//		System.out.print("#" + changeRemaining);
		
//		if (changeRemaining > 4 || changeRemaining == 5 || changeRemaining == 10 || changeRemaining == 25|| changeRemaining == 100|| changeRemaining == 500|| changeRemaining == 1000|| changeRemaining == 2000) {
		if (changeRemaining>5) {
		punct = ", ";
		} else {

			punct = ". ";
		}
		
		return punct;
	}
}
//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
