//This program has been created by Mohammed Sultan Shiraz
//This was created on 04/03/2019
//Enjoy Using this program.
//Thank You.

//Java Util Scanner.
import java.util.Scanner;

public class Project04_BankAccount_Mohammed_Sultan_Shiraz_Demo {
    public static void main(String[] args){
        double User_Choice;
        
        Project04_BankAccount_Mohammed_Sultan_Shiraz theAcct;
        theAcct = new Project04_BankAccount_Mohammed_Sultan_Shiraz();
        
        //initial Value To The Instance Variabls:
        theAcct.setBalance(500);
        theAcct.displayMessage();
        theAcct.withdraw(200);
        theAcct.displayMessage();
        System.out.println("\n");
        
        Project04_BankAccount_Mohammed_Sultan_Shiraz myAcct;
        myAcct = new Project04_BankAccount_Mohammed_Sultan_Shiraz();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter Your Initial Balance: ");
        User_Choice = input.nextDouble();
        myAcct.setBalance(User_Choice);
        myAcct.displayMessage();
        myAcct.withdraw(200);
        myAcct.displayMessage();
        
        input.close();
    }
}