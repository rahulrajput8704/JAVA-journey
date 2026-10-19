import java.util.Scanner;

public class Calculator {
    
    public void add(int a,int b){
        System.out.println("addition:"+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("subtraction:"+(a-b));
    }
    public void mul(int a,int b){
        System.out.println("mutiplication:"+(a*b));
        
    }
    public void div(int a, int b){
        System.out.println("division:"+(a/b));
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
    System.out.println("enter 1st number");
    int a= sc.nextInt();
    System.out.println("enter 2nd number");
    int b= sc.nextInt();
        Calculator cal= new Calculator();
        cal.add(a,b);
        cal.sub(a,b);
        cal.mul(a,b);
        cal.div(a,b);
        
    }
}