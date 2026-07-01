package Array;

public class Pass_by_Reference {
    public static void swap (int [] a , int [] b){

        int temp = a[0];
        a[0] = b[0] ;
        b[0] = temp ;

    }

    static void main() {

        int [] a = {10};
        int [] b = {20};
        System.out.println(a[0] + " " + b[0]);
        swap(a,b);
        System.out.println(a[0] + " " + b[0]);

    }
}
