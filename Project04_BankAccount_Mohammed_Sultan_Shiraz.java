//This program has been created by Mohammed Sultan Shiraz
//This was created on 04/03/2019
//Enjoy Using this program.
//Thank You.

public class Project04_BankAccount_Mohammed_Sultan_Shiraz {

    void setBalance(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void withdraw(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setBalance(double User_Choice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class BankAccount{
        //Private Classes:
        private static final double lowBalance = 1000;
        private double Balance;

        //Public Classes:        
        public BankAccount(){
        }
        public BankAccount(double Balan){
            Balance = Balan;            
        }
        public double getbalance(){
            return Balance;
        }
        public void setbalance(double balance){
            
        }
        public void deposit(double amount){
            Balance = Balance + amount;
            System.out.printf("Deposit $%.2f to balance!\n", amount);
        }
        public void withdraw(double amount){
            Balance = Balance - amount;
            System.out.printf("Withdraw $%.2f to balance!\n", amount);
        }
        public void displayMessage(){
            System.out.printf("The current balance is $%.2f.\n", Balance);
            if (Balance < lowBalance){
                System.out.println("This account has been overdrawn.");
            }
        }

    }
}