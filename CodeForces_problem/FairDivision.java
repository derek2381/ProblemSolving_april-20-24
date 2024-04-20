// problem link
// https://codeforces.com/problemset/problem/1472/B


import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int ones = 0, twos = 0;

            int n = sc.nextInt(), val;

            for(int i = 0;i < n;i++){
                val = sc.nextInt();
                if(val == 1){
                    ones++;
                }else{
                    twos++;
                }
            }

            if(ones%2 == 0 && twos % 2 == 0){
                System.out.println("YES");
            }else{
               if((ones+twos*2) % 2 == 0 && ones > 0){
                   System.out.println("YES");
               }else{
                   System.out.println("NO");
               }
            }

        }
    }
}
