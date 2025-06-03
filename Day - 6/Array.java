import java.util.Scanner;
import java.util.Arrays;
public class Array{
    public static void Createarr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
    public static void Arreve(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for (int i : a) {
            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
    }
    public static void Arraymul(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int max;
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int len =sc.nextInt();
        int b[]=new int[len];
        for(int i=0;i<len;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(b));
        if(len>size){
            max = len;
        }else{
            max = size;
        }
        int c[]=new int[max];
        for(int i=0;i<len;i++){
            c[i]=a[i]*b[i];
        }
        System.out.println(Arrays.toString(c));
    }
    public static void main(String[] args){
        Arraymul();
    }
}