import java.util.*;

class Repetitions {
    public static void main(String[] args) {
        char current = '\0';
        int count = 0, answer = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != current) {
                current = s.charAt(i);
                count = 0;
            }
            if (s.charAt(i) == current) {
                count++;
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }
}