import java.util.Scanner;

public class cf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter take amount : ");
        int take = sc.nextInt();
        
        System.out.println("Enter Balance: ");
        double balance = sc.nextInt();

       
        double newb = balance - take-0.5;

        System.out.println(newb);
    }
}
