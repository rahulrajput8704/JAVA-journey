public class Main {
    public static void main(String[] args) {
        String name = "Rahul";
        int marks = 75;
        if (marks >= 90) {
            System.out.println(name + " ka Grade: A hai");
        } else if (marks >= 70 && marks <= 89) {
            System.out.println(name + " ka Grade: B hai");
        } else if (marks >= 33 && marks <= 69) {
            System.out.println(name + " ka Grade: C hai");
        } else {
            System.out.println(name + " Fail hai, Grade: F");
        }
    }
}