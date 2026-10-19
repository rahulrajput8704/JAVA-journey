
    public class  Animal{
    public void run(){
        System.out.println("I am running");
        
    }
        public void speak(){
            System.out.println("cat :meow");
        }
        public void speak2(){
            System.out.println("barks");
        }
    public static void main(String []args)
    {
        Animal jumbo= new Animal();
        Animal cat = new Animal();
        Animal dog= new Animal();
        jumbo.run();
        cat.speak();
        dog.speak2();
    }
}
