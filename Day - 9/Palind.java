import java.util.Scanner;
public class Palind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        if(n<0){
            return false;
        }
        String num=String.valueOf(n);
        StringBuilder sb=new StringBuilder(num);
        return num.equals(sb.reverse().toString());
    }
}