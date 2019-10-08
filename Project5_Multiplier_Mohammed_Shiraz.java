/**********************************************************
 * Project Assignment 5: Project5_Multiplier.java         *
 * Program generates single digit multiplication problems *
 * Created By Mohammed Shiraz, Created On 04/21/2019      *
 **********************************************************/
import java.util.*;
import java.util.Random;

public class Project5_Multiplier_Mohammed_Shiraz {
    private int answer; //for holding the correct answer
    private Random randomNumbers = new Random(); //for creating random numbers
    //A public method to ask the user to work on multiplication problems
    public void quiz(){
        int guess; //for holding the user's guess
        Scanner input = new Scanner(System.in);
        /* TODO#1: write code to call method createQuestion to display the question */
        createQuestion();
            do{
            System.out.println("Enter your answer (-1 to exit):");
            guess = input.nextInt();
            if(guess == -1){
                System.out.println("You have decided to exit!");
                break;
            }
			/* TODO#2: write code to call the method checkResponse to check the user's answer,
						the user's answer should be passed into the method */
			checkResponse(guess);
        } while(guess != answer);
    } //end quiz method

    //A private method to print a new question and store the corresponding answer
    /* TODO#3: write method header for the createQuestion method */
    private void createQuestion(){
        //get two random numbers between 0 and 9, inclusively
        /* TODO#4: write code to get two random numbers and store them in variables digit1 and digit2 */
            int digit1 = randomNumbers.nextInt(10);
            int digit2 = randomNumbers.nextInt(10);
        /* TODO#5: write code to multiply the two variables and store the result in the instance variable answer */
        answer = digit1*digit2;
        System.out.printf("How much is %d times %d?\n", digit1, digit2);
    } //end createQuestion method

    //A private method to check if the user has answered correctly
    /* TODO#6: write method header for checkResponse */
    private void checkResponse(int guess){
        /* TODO#7: write the header of the structure to test whether the user's answer is correct */
        if(guess == answer){
            System.out.println("Very good!");
            /* TODO#8: write code to call method createQuestion again to display another question */
            createQuestion();
        } //end if branch.
		else{
            /* TODO#9: write code to tell the user to try again if answer is incorrect */
            System.out.println("Apologies, That Isn't Correct! Try again.");
        } //end else branch.
    } //end checkResponse method.
} //end class Project5_Multiplier.