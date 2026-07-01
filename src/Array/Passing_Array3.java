package Array;

public class Passing_Array3 {
    public static void change(int [] arr){

        arr [1] = 54;

    }
    static void main() {

        int [] arr = {12,23,34,45};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);

    }
}
