import java.util.Arrays;
public class SortaStringArray {
    public static void main(String[] args){
        char c[] = {'A','D','K', 'Z', 'H'};

        String s[] = {"john", "amna", "khan", "poppy", "toppy"};

        System.out.println("Before Sorting...  " + Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("After Sorting...  " + Arrays.toString(c));

        System.out.println("#################################################");
        System.out.println("Before Sorting... " + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting...  " + Arrays.toString(s));

    }
}
