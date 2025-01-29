import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a digit:");
        int a=sc.nextInt();
        sc.close();
        System.out.println(a%2==0?"even":"odd");
    }
}
