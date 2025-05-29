import java.util.Scanner;
public class Pattern {
    public static void A() {
        for(int row=0;row<7;row++)
        {
            for(int col=0;col<5;col++)
            {
                if(col==0 && row!=0 || row==3 || col==4 && row!=0 || row==0 && col!=0 && col!=4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void B() {
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(col==0 || row==0 && col!=4 || row==6 && col!=4 || row==3 && col!=4 || col==4 && row!=0 && row!=3 && row!=6)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void G() {
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(col==0 || row==0 || row==6 || row==3 && col!=1 && col!=2 || col==4 && row!=1 && row!=2)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void J(){
        for(int row=0;row<7;row++){
            for(int col=0;col<5;col++){
                if(row==0 || col==2 || row==6 && col!=3 && col!=4 || row==5 && col==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void Q(){
        for(int row=0;row<6;row++){
            for(int col=0;col<6;col++){
                if(col==0 && row!=5 || row==0 && col!=5 || row==4 && col!=5 || col==4 && row!=5 || col==2 && row==2 || col==3 && row==3 || row==5 && col==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    public static void V(){
        for(int row=0;row<6;row++){
            for(int col=0;col<11;col++){
                if(row==col || row+col==10){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    public static void W(){
        for(int row=0;row<4;row++){
            for(int col=0;col<7;col++){
                if(col==0 || col==6 ||col+row==3 || row-col==-3){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    public static void X(){
        for(int row=0;row<7;row++){
            for(int col=0;col<7;col++){
                if(row==col || row+col==6){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    public static void Rect(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out .print("*");
            }System.out.println();
        }
    }
    public static void halft(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void revht(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void halfd(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<n*2;row++)
        {
            int totalCol=(row>n)?2*n-row:row;
            for(int col=1;col<=totalCol;col++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void sidehalft(){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int spc=0;spc<n-row;spc++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void revhalft(){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0;row<n;row++){
            for(int spc=1;spc<=row;spc++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row;col++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void halfp(){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int spc=0;spc<n-row;spc++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void revhalfp(){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=n;row>=1;row--){
            for(int spc=0;spc<n-row;spc++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void timel(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0;row<n;row++){
            for(int spc=1;spc<=row;spc++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row;col++){
                System.out.print("* ");
            }System.out.println();
        }
        for(int row=2;row<=n;row++){
            System.out.print(" ");
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void abcd(){
        int n=5;
        
        char c='E';
        char t=c;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(t++ +" ");
            }c--;
            t=c;
            System.out.println();
        }
    }
    public static void main (String[] args){
        abcd();
    }
}