import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size:");
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            System.out.println(list.get(list.size() - 2));
        }
    }

}