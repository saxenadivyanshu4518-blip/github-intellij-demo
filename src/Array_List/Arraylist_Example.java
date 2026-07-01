package Array_List;


   import java.util.*;

public class Arraylist_Example {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(15);
        l2.add(16);
        l2.add(19);


        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);

        l1.add(0, 5);

        l1.addAll(l2);

        System.out.println(l1.contains(9));  // true , false

        System.out.println(l1.indexOf(6));

        System.out.println(l1.lastIndexOf(6));

        //  l1.clear(); // Sab data clear Karna ho Toh use karo

      //  l1.set(1,566); // replace kardo element ko (1 index 6 , 1 index 566 ho jayega )

        for (int i = 0; i < l1.size(); i++) {

            System.out.print(l1.get(i));
            System.out.print(", ");

        }
    }
}
