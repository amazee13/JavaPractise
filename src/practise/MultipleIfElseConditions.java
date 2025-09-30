package practise;

public class MultipleIfElseConditions {

    public static void main(String[] args){

        int a = 10 , b = 20, c= 12;

        if (a>b && a>c)
        {
            System.out.println("A is the greater number");
        }
        else if (b>a && b>c){
            System.out.println("B is the greater number");

        }
        else
        {
            System.out.println("C is the greater number");
        }
    }
}
