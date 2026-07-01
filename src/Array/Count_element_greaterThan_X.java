package Array;

public class Count_element_greaterThan_X {
    static void main() {

        int [] arr = {3,8,1,15,7,22,4};
        int x = 10;
        int count = 0;

        for (int num : arr){
            if (num>x){
                count ++;
            }
        }

        System.out.println();
        System.out.println("Number of elements greater than " + x + " is : " + count);
    }
}
