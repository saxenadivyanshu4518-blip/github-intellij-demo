package Array;

public class Passing_Arrays1 {
    public static void change (int x){

        x = 7;
    }

    static void main() {
        int x = 5;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
