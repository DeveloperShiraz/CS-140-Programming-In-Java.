// Created On 03-09-2019
//Created By Mohammed Shiraz
import java.util.Scanner;
public class Project03_Mohammed_Shiraz
{
    public static void main(String[]args)
    {
        //delcare needed variables
        int Users_Choice;
        int[]Numbers = new int[2];
        Scanner input = new Scanner(System.in);

        //keep performing the operation till user chooses to stop
        do
        {

            Users_Choice = displayMenu_MakeChoice();
            if (Users_Choice == -1)
            { // -1 to exit
                System.out.println("\nYou have decided to quit!");
                break;
            }

            // request two positive integers & check validation
            do
            {
                requestOperands(Numbers);//call request method

            } while(Numbers[0] <= 0 || Numbers[1] <= 0);

            // perform the chosen operation & output the result


            performOperation(Numbers,Users_Choice);//call operations method

        } while (true);
    }
    public static int displayMenu_MakeChoice()
    {
        int Users_Choice;
        Scanner input = new Scanner(System.in);
        // display message for the program
        System.out.println("\nThis program performs some operation on 2 positive integers");
        System.out.println("User should enter the integers & choose what operation to perform!\n");

        // display the menu for operations
        System.out.println("\t 1. Addtion");
        System.out.println("\t 2. Subtraction");
        System.out.println("\t 3. Multiplication");
        System.out.println("\t 4. Division");
        System.out.println("\t 5. Modulo");
        System.out.println("\t-1. Exit");

        // Request the operation to perform & check validation
        do{
            System.out.print("\nPlease choose operation to perform: ");
            Users_Choice = input.nextInt();

        } while(Users_Choice != -1 && Users_Choice != 1 && Users_Choice !=2 && Users_Choice != 3 && Users_Choice !=4 && Users_Choice !=  5);
        return Users_Choice;

    }
    public static void requestOperands(int[] ns)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter a positive integer: ");
        ns[0] = input.nextInt();
        System.out.print("Please enter another positive integer: ");
        ns[1] = input.nextInt();


    }
    public static void performOperation(int[]ns,int cs)
    {
        switch (cs) {
            case 1:
                System.out.println("\nThe sum of these two integers is " + (ns[0] + ns[1]));
                break;
            case 2:
                System.out.println("\nThe difference of these two integers is " + (ns[0] - ns[1]));
                break;
            case 3:
                System.out.println("\nThe product of these two integers is " + (ns[0] * ns[1]));
                break;
            case 4:
                System.out.println("\nThe quotient of the division of these two integers is " + (ns[0] / ns[1]));
                break;
            case 5:
                System.out.println("\nThe remainder of the division of these two integers is " + (ns[0] % ns[1]));
                break;
            default: // should never be here
                System.out.println("\nSomething is wrong!");
        } // end switch
    }


}
