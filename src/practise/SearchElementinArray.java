package practise;

public class SearchElementinArray {

    public static void main(String[] args){

        //Search element in array

        int a[] = {200, 400, 500, 300, 800, 400};
        int search_element = 800 ;
        boolean status = false;
//        for( int i=0; i< a.length; i++)
//        {
//            if(a[i] == search_element){
//
//                System.out.println("Found element : " + a[i]);
//                status = true;
//                break;
//            }
//        }
        for(int x : a) {             // enhanced for loop
            if (x == search_element) {
                System.out.println("Found element : " + x);
                status = true;
                break;
            }
        }

        if(status == false){
            System.out.println("Elements not found");
        }
    }
}


