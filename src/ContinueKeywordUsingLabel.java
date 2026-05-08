

public class ContinueKeywordUsingLabel {
    static void main(String[] args) {

        myloop: for (int num = 1; num <= 50; num++) {

            if (num % 3 == 0){
                continue ;
            }
            System.out.println(num);
        }
    }
}
