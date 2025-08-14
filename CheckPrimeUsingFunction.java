package Methods.Method_PdfQuestion;

import java.util.Scanner;

public class CheckPrimeUsingFunction {
    public static void Prime(int a){
        int count=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                count+=1;
            }
        }
        if(count==0){
            System.out.println(a+" is prime number");
        }else{
            System.out.println(a+" is not prime number");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int b = sc.nextInt();
        Prime(b);
    }

}


