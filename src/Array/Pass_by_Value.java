package Array;

public class Pass_by_Value {
    public static void swap (int a , int b){
        int temp = a;
         a = b;
         b = temp;

    }
    
    static void main() {
        int a = 10;
        int b = 20;

        System.out.println(a+ " " +b);
        swap(a,b);
        System.out.println(a+ " " +b);
    }
}
