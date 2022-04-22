package bank.client;

import java.util.Scanner;

import bank.entity.Account;
import bank.entity.Branch;
import bank.entity.Customer;
import bank.entity.User;
import bank.manager.AccountManager;
import bank.manager.AccountManagerImpl;
import bank.manager.BranchManager;
import bank.manager.BranchManagerImpl;
import bank.manager.CustomerManager;
import bank.manager.CustomerManagerImpl;
import bank.manager.UserManager;
import bank.manager.UserManagerImpl;

public class BankClient {
	public static void main(String[] args) {
		
		System.out.println("Enter your choice \n1. Add a cutomer\n2. Add a branch"
				+ "\n3. create an user\n4. create an account \n5. Exit");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		while (choice != 5) {
			switch (choice) {
			case 1:
				System.out.println(" Add a customer ");
				System.out.print("Enter customerId :-");
				long customerId = scan.nextLong();
//				if (!validationPlayer.isPlayerNameValid(playerName))
//					throw new DuplicateEntryException("Player details already exist in the database");
//				else
//					playerDetails1.setPlayerName(playerName);
				System.out.print("Enter Name :-");
				String name = scan.next();
//				if (validationPlayer.validateCategory(category) == false) {
//					throw new InvalidCategoryException("Invalid category name please check your input");
//				} else
//					playerDetails1.setCategory(category);
				System.out.print("Enter Account Number :-");
				long accountNumber = scan.nextLong();
//				if (category.equalsIgnoreCase("Batsman")) {
//					if (validationPlayer.validateHighestScore(highestScore) == false)
//						throw new NotABatsmanException("Invalid Batsman, please check your input");
//					else
//						playerDetails1.setHighestScore(highestScore);
//				} else
//					playerDetails1.setHighestScore(highestScore);
				System.out.print("Enter Address :-");
				String custAddress = scan.next();
//				if (validationPlayer.validateCategory(category) == false) {
//					throw new InvalidCategoryException("Invalid category name please check your input");
//				} else
//					playerDetails1.setCategory(category);
				System.out.print("Enter UserId :-");
				Integer UserId = scan.nextInt();
				Customer customer = new Customer(customerId, name, accountNumber, custAddress, UserId);
				CustomerManager customerMgr = new CustomerManagerImpl();
				System.out.println(customerMgr.insertCustomer(customer));
				break;
			case 2:
				System.out.println(" Add a Branch ");
				System.out.print("Enter Branch Code :-");
				String branchCode = scan.next();
//				if (!validationPlayer.isPlayerNameValid(playerName))
//					throw new DuplicateEntryException("Player details already exist in the database");
//				else
//					playerDetails1.setPlayerName(playerName);
				System.out.print("Enter Address :-");
				String branchAddress = scan.next();
//				if (validationPlayer.validateCategory(category) == false) {
//					throw new InvalidCategoryException("Invalid category name please check your input");
//				} else
//					playerDetails1.setCategory(category);
				System.out.print("Enter IFSC Code :-");
				String ifscCode = scan.next();
//				if (category.equalsIgnoreCase("Batsman")) {
//					if (validationPlayer.validateHighestScore(highestScore) == false)
//						throw new NotABatsmanException("Invalid Batsman, please check your input");
//					else
//						playerDetails1.setHighestScore(highestScore);
//				} else
//					playerDetails1.setHighestScore(highestScore);
				System.out.print("Enter Branch Type :-");
				String branchType = scan.next();
				Branch branch = new Branch(branchCode, branchAddress, ifscCode, branchType);
				BranchManager branchMgr = new BranchManagerImpl();
				
				System.out.println(branchMgr.insertBranch(branch));
//				

				break;
			case 3:
				System.out.println(" Create a user ");
				String userId = null;
				System.out.print("Enter User Name :-");
				String userName = scan.next();
//				if (!validationPlayer.isPlayerNameValid(playerName))
//					throw new DuplicateEntryException("Player details already exist in the database");
//				else
//					playerDetails1.setPlayerName(playerName);
				System.out.print("Enter Password :-");
				String password = scan.next();
//				if (validationPlayer.validateCategory(category) == false) {
//					throw new InvalidCategoryException("Invalid category name please check your input");
//				} else
//					playerDetails1.setCategory(category);
				System.out.print("Enter Type :-");
				String userType = scan.next();
				User user = new User(userName, password, userType);
				UserManager userMgr = new UserManagerImpl();
				System.out.println(userMgr.insertUser(user));
				break;
			case 4:
				System.out.println(" create an account ");
				System.out.print("Enter Account Number :-");
				long accountNumber1 = scan.nextLong();
//				if (!validationPlayer.isPlayerNameValid(playerName))
//					throw new DuplicateEntryException("Player details already exist in the database");
//				else
//					playerDetails1.setPlayerName(playerName);
				System.out.print("Enter Account type :-");
				String type = scan.next();
//				if (validationPlayer.validateCategory(category) == false) {
//					throw new InvalidCategoryException("Invalid category name please check your input");
//				} else
//					playerDetails1.setCategory(category);
				System.out.print("Enter Branch Code :-");
				String branchCode1 = scan.next();
//				if (category.equalsIgnoreCase("Batsman")) {
//					if (validationPlayer.validateHighestScore(highestScore) == false)
//						throw new NotABatsmanException("Invalid Batsman, please check your input");
//					else
//						playerDetails1.setHighestScore(highestScore);
//				} else
//					playerDetails1.setHighestScore(highestScore);
				System.out.print("Enter Balance :-");
				Integer balance = scan.nextInt();
//				if (bestFigure.matches("[\\d]+[/][\\d]+"))
//					if (category.equalsIgnoreCase("Bowler")) {
//						if (validationPlayer.validateBestFigure(highestScore, bestFigure) == false)
//							throw new NotABowlerException("Invalid Batsman, please check your input");
//						else
//							playerDetails1.setBestFigure(bestFigure);
//					} else
//						playerDetails1.setBestFigure(bestFigure);
//				else
//					throw new InvalidBestFigureException("Inavalid bestfigure, please check your input");
//				System.out.print("Enter Team Name :-");
//				String teamName = scan.next();
//				if (validationTeam.validateTeamName(teamName) == false) {
//					throw new InvalidTeamNameException("Invalid team name, please check your input");
//				} else
//					team1.setTeamName(teamName.toUpperCase());
//				playerDetails.insertPlayers(playerDetails1);
				System.out.print("Enter Status :-");
				String status = scan.next();
				Account account = new Account(accountNumber1, type, branchCode1, balance, status);
				AccountManager accountMgr = new AccountManagerImpl();
				System.out.println(accountMgr.insertAccount(account));
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("you entered a wrong choice");
			}
			System.out.println("Enter your choice \n1. Add a cutomer\n2. Add a branch"
					+ "\n3. create an user\n4. create an account \n5. Exit");
			choice = scan.nextInt();
		}


	}
}
