package Array;

public class Passing_Array4 {
   public static void change(int [] raghav){

       raghav [1] = 54;

    }
    static void main() {

       int [] arr = {12,23,34,45};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);

    }
}
