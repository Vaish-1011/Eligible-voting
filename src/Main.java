import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculate c=new calculate();
        System.out.println("Enter your age:");
        int num=sc.nextInt();
        System.out.println(c.check(num));
    }
}
class calculate
{
    String check(int n)
    {
        if(n>=18){
            return("You are eligible to vote");
        }
        else{
            return("You aren't eligible to vote");
        }
    }
}