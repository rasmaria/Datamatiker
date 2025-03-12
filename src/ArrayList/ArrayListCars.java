package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCars {

        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            System.out.println(cars);

            //You can also add an item at a specified position by referring to the index number:

            cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
            System.out.println(cars);

            //To access an element in the ArrayList, use the get() method and refer to the index number:
            cars.get(0);
            System.out.println(cars.get(0));

            //To modify an element, use the set() method and refer to the index number:
            cars.set(0, "Opel");
            System.out.println(cars);

            //To remove an element, use the remove() method and refer to the index number:
            cars.remove(0);
            System.out.println(cars);

            //To remove all the elements in the ArrayList, use the clear() method:
            //cars.clear();

            //To find out how many elements an ArrayList have, use the size method:
            cars.size();
            System.out.println(cars.size());

            //Loop through the elements of an ArrayList with a for loop,
            // and use the size() method to specify how many times the loop should run:
            System.out.println();
            System.out.println("For-loop:");

            for (int i = 0; i < cars.size(); i++) {
                System.out.println(cars.get(i));
            }

            //You can also loop through an ArrayList with the for-each loop:
            System.out.println();
            System.out.println("New loop");
            for (String i : cars) {
                System.out.println(i);
            }

            //Another useful class in the java.util package is the Collections class,
            //which include the sort() method for sorting lists alphabetically or numerically:
            System.out.println();
            System.out.println("Sorted alphabetically");
            
            Collections.sort(cars);  // Sort cars
            for (String i : cars) {
                System.out.println(i);
            }







        }
    }

