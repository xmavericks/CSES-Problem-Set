import java.util.*;
/*
https://cses.fi/problemset/task/1068
*/
class WeirdAlgorithms { 
  public static void main(String args[]) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextInt();
	System.out.println(n+" ");
    while(n !=1){
        if(n % 2 == 0){
            n = n/2;
            System.out.println(n+" ");
        }
        else{
            n = 3*n + 1;
            System.out.println(n+" ");
        }
    }
  }
}
