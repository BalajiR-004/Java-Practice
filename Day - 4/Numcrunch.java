import java.util.Scanner;
public class Numcrunch {
    public static void count(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();
        int cnt=0;
        while(n!=0){
            n=n/10;
            cnt++;
        }System.out.println("Number of digits: " + cnt);
    }
    public static void divisor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();
        int div=2;
        while(div<=n/2){
            if (n%div==0) {
                System.out.print(div+ " ");
            }div++;
        }
    }
    public static void primen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();
        int j=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                j=0;
                break;
            }
        }System.out.println(j==0 ? "Not a prime number" : "Is a prime number");
    }
    public static double Exponen(double base,double power){
        double j=1;
        base = (power<0)?1/base:base;
        power=(power<0)?-(power):power;
        for(int i =0;i<power;i++){
            j=j*base;
        }
        return j;
    }
    public static boolean Neonnum(int n){
        int sum=0, r;
        int expo = (int)Exponen(n,2);
        while(expo>0){
            r = expo%10;
            sum += r;
            expo /= 10;
        }
        return sum==n;
    }
    public static boolean Spynum(int n){
        int sum=0, mul=1, r;
        while(n>0){
            r = n%10;
            sum += r;
            mul *= r;
            n /= 10;
        }
        return sum==mul;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Spynum(n));
    }
}
