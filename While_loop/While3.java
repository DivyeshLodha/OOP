package While_loop;

public class While3 {
    public static void main(String[] args) {
        int x = 1, sum = 0;

        //exit when x becomes greater than 4

        while(x<=10){
            //summing up x
            sum = sum + x;

            /* increment the value of x
            * for
            * next iteration*/

            x++;

        }
        System.out.println("Summation" +sum);
    }
}
