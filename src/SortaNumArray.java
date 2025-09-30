import java.util.Arrays;
public class SortaNumArray {
    public static void main(String[] args){

        int a[] ={10,30,40,55,34,29,77};

        System.out.println("Before sorting....");
        System.out.println(Arrays.toString(a));
//        for(int value:a){
//            System.out.println(value);
//        }
        Arrays.sort(a);
        System.out.println("After sorting....");
        System.out.println(Arrays.toString(a));

    }
}
