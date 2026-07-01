package Array;

public class Max_In_Array2 {
    static void main() {

        int [] arr = {-5,-2,-64};

     //   int max = -1;

        int max = arr [0];

        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max)   max =  arr[i];

        }

        System.out.println(max);

    }
}

