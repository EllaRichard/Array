/*Question*: you are making a program for a vending machine that provides drinks. The menu of the drinks is stored
             in an array called menu:
             String [] menu = {"tea", "Espresso", "Americano", "Water", "Hot chocolate"};
             Take the choice of the customer as an integer from input and output the corresponding menu item.
             Also check for errors: in case the input is out of range of the array, output "invalid"
* */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String [] menu = {"tea", "Espresso", "Americano", "Water", "Hot chocolate"};
        int length = menu.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice from (1-5): ");
        int choice = sc.nextInt();

        if (choice > 0 && choice <= length){
            System.out.println(menu[choice-1]);
        } else {
            System.out.println("invalid");
        }
    }
}