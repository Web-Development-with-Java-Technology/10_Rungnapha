import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) throws Exception {
        //workshop3.2
        System.out.println("---------Menu-------");
        System.out.println(" 1 : Spaghetti");
        System.out.println(" 2 : Green Curry");
        System.out.println(" 3 : Hambergur");
        System.out.println(" 4 : Pizza");
        System.out.println(" 5 : Sushi");
        System.out.println("--------------------");

         Scanner menu = new Scanner(System.in);
         System.out.print("Please enter number for select menu : ");
         int mn = menu.nextInt();
         switch (mn) {
            case 1 -> System.out.println("You select : Spaghetti");
            case 2 -> System.out.println("You select :Green curry");
            case 3 -> System.out.println("You select :Hamberger");
            case 4 -> System.out.println("You select :Pizza");
            case 5 -> System.out.println("You select :Sushi");
            default -> System.out.println("You select :ERROR");

         }
}
}