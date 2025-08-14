package Methods.Method_PdfQuestion;

import java.util.Arrays;

public class BubbleSortUsingFunction {

    public static void Sorting(int [] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String [] args){
        int []arr = {10,5,3,14,1};
        Sorting(arr);
    }
}
