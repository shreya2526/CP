import java.util.Scanner;
public class input{
    public static void main(String[] args){
        String mystring;
        int a;
        Scanner scanner= new Scanner(System.in);
        mystring=scanner.next();
        a=scanner.nextInt();
        scanner.close();
        System.out.println("Mystring is: "+mystring);
        System.out.println("Myint is: "+a);
    }
}