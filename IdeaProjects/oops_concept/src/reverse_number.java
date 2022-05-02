import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int rev=0;
        while (num!=0)
        {
            rev=num%10;
            num=num/10;
            num++;
        }
        System.out.println(rev);
    }
}
