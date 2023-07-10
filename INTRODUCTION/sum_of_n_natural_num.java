import java.util.*;
public class sum_of_n_natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n");
        int n= sc.nextInt();
        // int sum = 0;
        // for(int i=1;i<=n;i++) {
        //     sum+=i;
           
        // }
        int sum = n*(n+1)/2;

        System.out.println("Sum is "+sum );
    }
}