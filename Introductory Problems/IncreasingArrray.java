import java.util.*;
/*
https://cses.fi/problemset/task/1094
*/

class IncreasingArrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), comp = sc.nextInt(), temp = 0;
        long result = 0;
        for (int i = 1; i < n; i++) {
            temp = sc.nextInt();
            if (temp < comp)
                result += comp - temp;
            else
                comp = temp;
        }
        System.out.println(result);
    }
}
