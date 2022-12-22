import java.util.Arrays;

class SumPresentArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, -8 };
        calculate(arr, -15);

    }

    public static void calculate(int[] arr, int sum) {
        Arrays.sort(arr);
        int f = 0, l = arr.length - 1, s = 0;
        while (l >= f) {
            s = arr[f] + arr[l];
            if (s < sum)
                f++;
            else if (s > sum)
                l--;
            else
                break;
        }
        if (s == sum)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}