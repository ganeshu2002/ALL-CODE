import java.util.*;
public class remainder_a_div_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num ");
        int dividend = sc.nextInt();
        int divisor= sc.nextInt();
        // if(a>b){
        //     System.out.println(a%b);
        // }
        int quotient = dividend/divisor;
        int rem = dividend-(divisor*quotient);
        System.out.println(rem);


            

    }
}
