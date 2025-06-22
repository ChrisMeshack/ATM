package com.ChrisMeshack;
import java.util.*;
public class AtmOparationImplemn implements AtmOperationIntaf{
    ATM atm = new ATM();
    Map<Double,String> miniStatement = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " +atm.getBalance());
        
    }
    
    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount<=atm.getBalance()){
            miniStatement.put(withdrawAmount, "Amount Withdrawn");
            System.out.println(withdrawAmount +"has been withdrawn");
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();
        }
        else{
            System.out.println("Insufficient Funds.");
        }
        
    }
    
    @Override
    public void depositAmount(double depositAmount) {
        miniStatement.put(depositAmount, "Amount Deposited");
        System.out.println(depositAmount +"Deposited Succefully.");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
        
    }
    
    @Override
    public void viewMinistatement() {
        for(Map.Entry<Double,String>m:miniStatement.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }
        
    }
}