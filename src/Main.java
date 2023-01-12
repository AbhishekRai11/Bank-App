import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your name password balance to creaate account");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);
        String message= user.addMoney(10000);
        System.out.println(message);
        System.out.println("enter amount you want to withdraw");
        int money=sc.nextInt();
        System.out.println("enter password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));
        System.out.println(user.calculateInterest(10));
    }
}