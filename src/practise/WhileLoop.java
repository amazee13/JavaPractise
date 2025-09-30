package practise;

public class WhileLoop {
    public static void main(String[] args){

        //print from 1 to 10
//        int i = 0;
//        while(i<=10)
//        {
//            System.out.println(i);
//            i++;
//        }

        //print from 10 to 1
//        int m = 10;
//        while(m>=1)
//        {
//            System.out.println(m);
//            m--;
//        }
      // print even numbers

//        int e = 0;
//        while(e<=10)
//        {
//            System.out.println(e);
//            //e=e+2;
//            e+=2;
//        }

//        int o = 12;
//        while(o<=20)
//        {
//            if(o%2==0)
//            {
//                System.out.println(o);
//            }
//
//            //e=e+2;
//            o+=2;
//        }
//
        // Take numbers and specify either these are even or odd

        int num = 1;
        while (num<= 10)
        {
            if(num%2==0){
                System.out.println("Even number: " + num);
            }
            else {
                System.out.println("Odd number: " + num);
            }
            num++;

        }











    }
}
