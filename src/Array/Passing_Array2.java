package Array;

public class Passing_Array2 {
    public static void change (int x){

            x = 7;
        System.out.println(x);

    }

    static void main() {

        int x = 5 ;
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
}
