import java.util.Scanner;
import java.lang.Math;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i =0;
        for(i=0;i<=31;i++){
            if(n==Math.pow(4,i))
                break;
        }
        if(i<32) 
            System.out.println("True");  //signifies that n is any of power 4 
        else
            System.out.println("False");

    }
}
