package Methods;

import java.util.Scanner;

public class HowtoHandleException {
    public static int AddTwoNumbers(int a, int b) throws Exception{          // Here we use static method
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int c = sc.nextInt();

        a = a+5; //10+5=15
        b = b+10;  //15+10=25
        return a+b+c;  // 15+25+c=40+c
    }

    public static  void main(String [] args){
        int a=10;
        int b=15;
        try{
            int c =AddTwoNumbers(a,b);
            System.out.println("akta complecated calculation korlam "+c);
        }catch (Exception busno81){
            System.out.println("aktu problem ase geche tai terminate korte hochhe");
        }
        System.out.println("program sesh!");
    }
}
