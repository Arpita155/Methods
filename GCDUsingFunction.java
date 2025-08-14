package Methods.Method_PdfQuestion;

import java.util.Scanner;

public class GCDUsingFunction {

    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int x = sc.nextInt();
        System.out.println("enter the second number:");
        int y = sc.nextInt();
        int z = gcd(x,y);
        System.out.println("gcd of "+x+" and "+y+" is "+z);
    }
}
