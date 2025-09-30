package practise;

public class jarrays {
    public static void main(String[] args) {
        int a[] = {100, 200, 300, 400, 500};

        System.out.println("Length of array: " + a.length);

        // for loop
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        System.out.println("****************************");
        // another approach using enhanced for loop
        for (int x : a) {
            System.out.println(x);
        }
    }

}
