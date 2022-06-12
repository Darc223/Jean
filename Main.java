import java.util.*;

public class Main {
    Scanner scan = new Scanner(System.in);
    String ch;
    int a,b,c;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ch;
        int a;
        int b;
        int c;

        do{
            System.out.print("1. A_M_Bank 1\n2. BPR 2\n3. KCB 3\n4. Interbank 4\n\n Choose your company: ");
            ch=scan.nextLine();
            System.out.print("Enter your deposit: ");
            a= Integer.parseInt(scan.nextLine());

            switch (ch) {
                case "1" -> {
                    System.out.println("This is A_M_Bank company 1\n");
                    Company company = new A_M_Bank();
                    System.out.println("Company's interest is: "+company.interestRate());
                    System.out.println("The minimum duration is 3years");
                    System.out.print("1. Deposit \n2.Withdraw \n3 History \n Choose your Company: ");
                }
                case "2" -> {
                    System.out.println("This is BPR company 2\n");
                    Company company = new BPR();
                    System.out.println("Company's interest is: "+company.interestRate());
                    System.out.println("The minimum duration is 4years");
                    System.out.print("1. Deposit \n2.Withdraw \n3 History \n Choose your Company: ");

                }

                case "3" -> {
                    System.out.println("This is KCB company 3\n");
                    Company company = new KCB();
                    System.out.println("Company's interest is: "+company.interestRate());
                    System.out.println("The minimum duration is 1years");
                    System.out.print("1. Deposit \n2.Withdraw \n3 History \n Choose your Company: ");

                }
                case "4" -> {
                    System.out.println("\nThis is Interbank company 4\n");
                    Company company = new Interbank();
                    System.out.println("Company's interest is: "+company.interestRate());
                    System.out.println("The minimum duration is 1year");
                    System.out.print("1. Deposit \n2.Withdraw \n3 History \n Choose your Company: ");

                }
            }


        }while(!ch.equals("0"));
    }
}