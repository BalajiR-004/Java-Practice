import java.util.Scanner;
public class Powcheck {
    public static boolean isPowerTwo(int n){
        /*if(n==0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        return(n==1);*/
        return(n!=0 &&(n&(n-1))==0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerTwo(n));
    }
}
