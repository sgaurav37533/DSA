import java.util.HashSet;

public class SumPresentHash {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, -8 };
        calculate(arr, -16);
    }

    public static void calculate(int[] arr, int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int r = sum - arr[i];
            if (s.contains(r)) {
                System.out.println("YES");
                return;
            }
            s.add(arr[i]);
        }
        System.out.println("NO");
    }
}
