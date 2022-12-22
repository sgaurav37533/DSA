import java.util.HashMap;
import java.util.Scanner;

class Repeated
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int max=0;
        for (int i = 0; i < n; i++) {
            int t=sc.nextInt();
            
            if(map.containsKey(t))
            {
                map.put(t, map.get(t)+1);
                if(map.get(t)>max)
                    max=map.get(t);
            }
            else
            {
                map.put(t,1);
            }
        }
        for (int t : map.keySet())
        {
            if(max==map.get(t))
            {
                System.out.println(t);
                System.exit(0);
            }
        }
        
    }//end of main function
}