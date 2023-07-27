import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String customerName = "";
        int money = 0;
        boolean validInput = false;
        while(!validInput){
            System.out.println("***************************************************************************\n");
            System.out.println("  Hello Hungry Customer Please Enter Your Name to Begin Your Order: " + "\n");
            System.out.println("***************************************************************************\n");
            customerName = input.nextLine();
            try{
                System.out.println("***************************************************************************\n");
                System.out.println("Nice to Meet You, " + customerName + "!\n    How Much Would You Like to Deposit Into Your Account: \n");
                System.out.println("***************************************************************************\n");
                money = input.nextInt();
                if(money <= 0){
                    throw new InputMismatchException();
                } else {
                    System.out.println("***************************************************************************\n");
                    System.out.println("Great! $" + money + " Has Been Deposited Into Your Account\n");
                    System.out.println("***************************************************************************\n");
                    validInput = true;
                }
            } catch (InputMismatchException ime){
                System.out.println("***************************************************************************\n");
                System.out.println("Sorry Please Enter a Valid Whole Dollar Amount: ");
                System.out.println("***************************************************************************\n");
                input.nextLine();
            }
        }

        Customer customer = new Customer(customerName, money);
        TakeOutSimulator tos = new TakeOutSimulator(customer, input);
        tos.startTakeoutSimulator();
    }
}