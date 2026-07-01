package Array;

public class Max_In_Array {
    static void main() {

        int [] arr = {5,7,3,5,23,34,31,54,12};

        int max = -1;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max)   max =  arr[i];   // 5>-1 , 7>5 , 3>7 , 5>7 , 23>7 , 34>23 , 31>34 , 54>34 , 12>54

        }

        System.out.println(max);

    }
}
