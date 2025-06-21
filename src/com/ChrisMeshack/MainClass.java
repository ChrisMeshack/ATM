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
                if(choice==1){
                    operation.viewBalance();
            } else if (choice==2) {
                    System.out.println("Enter Amount to Withdraw: ");
                    double withdrawAmount = inputs.nextDouble();
                    operation.withdrawAmount(withdrawAmount);

                } else if (choice==3) {
                    System.out.println("Enter Amount to Deposit: ");
                    double depositAmount = inputs.nextDouble();
                    operation.depositAmount(depositAmount);

                } else if (choice==4) {
                    operation.viewMinistatement();

                } else if (choice==5) {
                    System.out.println("Thank You For Using Our ATM\nCan again");
                    inputs.close();
                    System.exit(0);
                }
                else {
                    System.out.println("Enter avalid choice");
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
