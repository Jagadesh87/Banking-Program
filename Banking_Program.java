import java.util.Scanner;

public class Banking_Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //JAVA BANKING PROGRAM


        double Balance=0;
        double New_Balance;
        boolean running = true;
        int choice;

        while (running){
            System.out.println("*******************");
            System.out.println("STATE BANK OF INDIA");
            System.out.println("*******************");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit a Amount");
            System.out.println("3.Withdraw the Amount");
            System.out.println("4.Exit");
            System.out.println("*******************");
            System.out.println("Choose the Option: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> Showbalance(Balance);
                case 2 -> Balance = Balance+ Deposit();
                case 3 -> Balance = Balance - Withdraw(Balance);
                case 4 -> running = false;
                default -> System.out.println("INVALID CHOICE");

            }
            System.out.println("THANK YOU , HAVE A NICE DAY !");
        }

    }
    static void Showbalance(double Balance){
        System.out.println("*******************");
        System.out.println("RS:"+Balance);
    }

    static Double Deposit(){
        double Amount;
        System.out.print("Enter the Amount for Deposit : ");
        Amount = scanner.nextDouble();
        return Amount;
    }

    static Double Withdraw(double Balance){
        double Amount;
        System.out.print("Enter the Withdraw Amount: ");
        Amount = scanner.nextDouble();
        if(Amount > Balance){
            System.out.println("INSUFFICIENT BALANCE");
        }
        return Amount;
    }

}
