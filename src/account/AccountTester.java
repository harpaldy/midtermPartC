/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/**
 * date: March 2nd
 * @author Sivagama
 */
public class AccountTester {
    
    public static void main(String[] args) {
        /*here assumed that 500 accounts can be created
        for the given bank*/
        Account ac[]=new Account[500];
        
        System.out.println("Please enter the amount by which you want to open an account:");
        
        Scanner sc=new Scanner(System.in);
        double bal=sc.nextDouble();
        
        System.out.println("Please enter the unique user name:");
        sc.nextLine();
        String user=sc.nextLine();
        
        Account a=new Account(bal,user);
        ac[0]=a;
        
        if(a.validMinBalance()){     
        System.out.println("The balance is: "+a.getBalance());  
        System.out.println("The InterestRate per month is "+a.getInterestRate());
        System.out.println("how long do you want to leave your money in the bank?");
        int time = sc.nextInt();
        System.out.println("the balance after "+time+" months is: "+ a.finalInterest(time));
        }
        else{}
        
    }
}
