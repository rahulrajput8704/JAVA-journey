import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Hi user! welcome to my java program");
       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter your good name");
       String name = sc.nextLine();
       System.out.println("enter your age");
       int age=sc.nextInt();
       System.out.println("Hello "+name +",tumhari age "+age +" hain");
       
       
    }
}