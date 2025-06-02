import java.util.Scanner;
public class Numpattern{
    public static void pt1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print(row+" " );
            }System.out.println();
        }
    }
    public static void pt2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=n;row>=1;row--)
        {
            for(int spc=1;spc<=n-row;spc++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }System.out.println();
        }
    }
    public static void pt3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(n-row+1+" ");
            }
            System.out.println();
        }
    }
    public static void pt4(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        for(int row=1;row<=n;row++){
            k=k+(row-1);
            int current = k+row-1;
            for(int col=1;col<=row;col++){
                System.out.print(current-- +" ");
            }System.out.println();
        }

    }
    public static void pt5(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+ " ");
            }
            for(int col=row-1;col>=1;col--){
                System.out.print(col+ " ");
            }System.out.println();
        }
    }
    public static void pt6(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print(col + " ");
            }
            for(int col=1;col<row;col++){
                System.out.print(col + " ");
            }System.out.println();
        }
    }
    public static void main(String[] args){
        pt4();
    }
}