
public class Problem_3 {

    public static void main(String[] args) {
        int answer = 0;
        long i;
        for (i = 300425737572L; i > 0; i--) {
            if (i % 1000000000 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Yay! The answer is: " + answer);
    }
}
