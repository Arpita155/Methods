package Methods;

import java.util.Scanner;

public class InstanceMethod {

    private void show(int [] phuchka){
        for(int i=0;i<phuchka.length;i++){
            phuchka[i] = phuchka[i] * 5;
        }
    }

    public static void main(String [] args){
        int thela[] = {1,2,3,4,5,6,7,8};

        InstanceMethod obj =new InstanceMethod();
        obj.show(thela);
        for(int i:thela){
            System.out.print(i+" ");
        }

    }
}
