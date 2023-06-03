import java.util.ArrayList;
public class Add_Rem {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();

//Adding the elements
        arr1.add("Apple");
        arr1.add("Banana");
        arr1.add("Carrot");
        System.out.println("Elements of first  ArrayList: " + arr1);

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Red");
        arr2.add("Yellow");
        arr2.add("Orange");
        System.out.println("Elements of second ArrayList: " + arr2);

//Adding the both array
        arr2.addAll(arr1);
        System.out.println("Elements of second ArrayList after adding :" + arr2);

//remove the element
        arr2.remove("Orange");
        System.out.println("Elements of ArrayList after deletion: " + arr2);
        System.out.println("Size of ArrayList: " + arr2.size());

//Retriving 2nd index element
        System.out.println("The element at 4th  index is: " + arr2.get(4));
    }
}