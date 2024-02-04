import java.sql.SQLOutput; //I don't even know where this one imported from, I'll research about it
import java.util.ArrayList;
public class WorkingWithArrayLists {
    public static void main(String[] args) {

        //ArrayLists
        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Donkey");

//        checking the size of the arraylist
        System.out.println("size: " + animals.size());
        System.out.println();

        //looping through by listing all the elements in the array

        for (int i = 0; i < animals.size(); i++){
            System.out.println("Animals: " + animals.get(i));
        }
        System.out.println();

        //a better way to do it is

        for (String i : animals) {
            System.out.println("Animals: "+ i);
        }
        System.out.println();

        //checking if the arraylist is empty
        if (animals.isEmpty()) {
            System.out.println("Animals is empty");
        } else {
            //showing all the animals using the for loop above
            for (String i : animals) {
                System.out.println("Animals: "+ i);
            }
        }
        System.out.println();
        //to remove elements from the arraylist
        animals.remove(0);
        animals.remove("cat");
        System.out.println();

  //      to check if an element is in our arraylist

        if (animals.contains("dog")) {
            animals.remove("Dog");
        } else {
            animals.add("chicken");
        }
    }
}