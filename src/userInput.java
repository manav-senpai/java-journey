import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name : ");
//        String name = scanner.nextLine();

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name : ");
        String naam = scanner.nextLine();
        System.out.println("What is you gpa: ");
        double gpa = scanner.nextDouble();


        System.out.println("hello "+ naam);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa  );
        scanner.close();
    }
}
