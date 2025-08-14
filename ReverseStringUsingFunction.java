package Methods. Method_PdfQuestion;

import java.util.Scanner;

public class ReverseStringUsingFunction {
    public static void Reverse(String str){
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String a = sc.nextLine();
        Reverse(a);
    }
}
