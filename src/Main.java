import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] elements = {-2,-1,1,2,3,4,5};
//        int[] elements = {1,2,3,4,5,6,7,8};
        System.out.println("array = "+Arrays.toString(elements));
        int k = 6;
        int x = 7;
        System.out.println("x = " + x);
        System.out.println("k = " + k);
        System.out.println("=====");
        List<Integer> list = solution.findClosestElements(elements,k,x);
        System.out.println(list.toString());
    }
}