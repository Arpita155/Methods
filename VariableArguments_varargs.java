package Methods;

public class VariableArguments_varargs {

    int add(float a, char c, int... momos){
        int sum=0;
        System.out.println("begumi lagbe = "+a);
        System.out.println("singara lagbe = "+c);
        for(int i=0;i<momos.length;i++){
            sum+=momos[i];
        }
        return  sum;
    }

    public static void main(String [] args){
        float beguni =10.6f;
        char singara = 's';
        VariableArguments_varargs butterscotch = new VariableArguments_varargs();
        int papod=butterscotch.add(beguni,singara, 1,2,3,4,5);
        System.out.println("papod lagbe = "+papod);
    }
}
