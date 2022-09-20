import java.util.*;
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

/*
Test 1
Verdict: ACCEPTED

input
7

correct output
7 22 11 34 17 52 26 13 40 20 1...

user output
7 
22 
11 
34 
17 
...

Test 2
Verdict: ACCEPTED

input
15

correct output
15 46 23 70 35 106 53 160 80 4...

user output
15 
46 
23 
70 
35 
...

Test 3
Verdict: ACCEPTED

input
27

correct output
27 82 41 124 62 31 94 47 142 7...

user output
27 
82 
41 
124 
62 
...

Test 4
Verdict: ACCEPTED

input
255

correct output
255 766 383 1150 575 1726 863 ...

user output
255 
766 
383 
1150 
575 
...

Test 5
Verdict: ACCEPTED

input
447

correct output
447 1342 671 2014 1007 3022 15...

user output
447 
1342 
671 
2014 
1007 
...

Test 6
Verdict: ACCEPTED

input
138367

correct output
138367 415102 207551 622654 31...

user output
138367 
415102 
207551 
622654 
311327 
...

Test 7
Verdict: ACCEPTED

input
159487

correct output
159487 478462 239231 717694 35...

user output
159487 
478462 
239231 
717694 
358847 
...

Test 8
Verdict: ACCEPTED

input
270271

correct output
270271 810814 405407 1216222 6...

user output
270271 
810814 
405407 
1216222 
608111 
...

Test 9
Verdict: ACCEPTED

input
665215

correct output
665215 1995646 997823 2993470 ...

user output
665215 
1995646 
997823 
2993470 
1496735 
...

Test 10
Verdict: ACCEPTED

input
704511

correct output
704511 2113534 1056767 3170302...

user output
704511 
2113534 
1056767 
3170302 
1585151 
...

Test 11
Verdict: ACCEPTED

input
5

correct output
5 16 8 4 2 1 

user output
5 
16 
8 
4 
2 
...

Test 12
Verdict: ACCEPTED

input
1

correct output
1 

user output
1 

Test 13
Verdict: ACCEPTED

input
2

correct output
2 1 

user output
2 
1 

Test 14
Verdict: ACCEPTED

input
114514

correct output
114514 57257 171772 85886 4294...

user output
114514 
57257 
171772 
85886 
42943 
...

*/
