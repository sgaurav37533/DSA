import java.util.Scanner;

class MinLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans[] = new String[n];
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (t % 2 == 0) {
                ans[i] = t / 2 + " " + t / 2;
            } else {
                ans[i] = ((t / 2) - 1) + " " + ((t / 2) + 2);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}