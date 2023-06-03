# Exp-09-Write-a-program-to-add-retrieve-and-remove-the-element-from-the-ArrayList...

## AIM:

To write a java program to add, retrieve and remove the element from the ArrayList.

## ALGORITHM:

### Step 1:

Import the necessary packages.

### Step 2:

Create an ArrayList and add elements in it.

### Step 3:

Create another ArrayList and add elements in it.

### Step 4:

Perform add, retrieve and remove operations in the ArrayList.

### Step 5:

Print the result.

### Step 6:

End the program.

## PROGRAM:

``` java

Name   : Anto Richard. S
Reg No : 212221240005

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

```

## OUTPUT:

![g4](https://github.com/anto-richard/Exp-09-Write-a-program-to-add-retrieve-and-remove-the-element-from-the-ArrayList.../assets/93427534/b518338d-46ce-4929-8a02-d290cab7b754)

## RESULT:

Thus the java program to add, retrieve and remove the element from the ArrayList is executted successfully.

