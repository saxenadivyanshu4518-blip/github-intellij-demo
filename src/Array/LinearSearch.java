package Array;

public class LinearSearch {
    static void main(String[] args) {

        int [] arr = {2,3,7,11,25,29,26};
        int x = 25;

        boolean flag = false; // nahi mila
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                flag = true; // Mil Gaya
                break;
            }
        }
        if (flag == flag)
            System.out.println(" Nahi Mila ");
        else
            System.out.println(" Mil Gaya ");
    }
}
