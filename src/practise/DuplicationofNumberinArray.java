package practise;

public class DuplicationofNumberinArray {
    public static void main(String[] args){

        int a[] = {10,20,30,10,10,50,40,35,10};
        int srch_num = 10;
        int count =0;

//        for(int i=0; i<a.length;i++){
//            if(a[i] == srch_num){
//                count++;
//
//            }
//        }

        for(int value:a){
            if(value== srch_num)
            {
                count++;
            }
        }

        System.out.println("Element found and it occurs at: " + count );




    }
}
