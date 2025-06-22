package com.ChrisMeshack;
import java.util.*;

public class MainClass {
    public static void main(String[]args){
        AtmOperationIntaf operation = new AtmOparationImplemn();
        int accountnumber = 123456;
        int accountpin = 1234;
        
        //Asking for user to input accountnumber and pin
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter your Account Number: ");
        int accountNumber = inputs.nextInt();
        System.out.print("Enter your pin: ");
        int accountPin = inputs.nextInt();
        
        //Validation Credentials using if--else
        if((accountNumber==accountnumber)&&(accountPin==accountpin)){
            while (true){
                System.out.println("1.Balance\n2.Withdraw\n3.Deposit\n4.Mini Statement\n5.Exit");
                System.out.println("Enter your Choice");
                int choice = inputs.nextInt();
                
                //Checking What the user wants to do
                switch (choice){
                    case 1:
                        operation.viewBalance();
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = inputs.nextDouble();
                        operation.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Enter amount to deposit: ");
                        double depositeAmount = inputs.nextDouble();
                        operation.depositAmount(depositeAmount);
                        break;
                    case 4:
                        operation.viewMinistatement();
                        break;
                    case 5:
                        System.out.println("Thank You for Using Our ATM\nCome again");
                        inputs.close();
                        System.exit(0);
                    default:
                        System.out.println("Enter a choice");
                        
                    
                        
                }
            }
        }
        else{
            System.out.println("Access denied");
            inputs.close();
            System.exit(0);
        }
        
    }
}