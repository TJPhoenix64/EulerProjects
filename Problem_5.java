
public class Problem_5 {

    public static void main(String[] args) {
        int num = 0;
        boolean isWrong = true;
        while (isWrong) {
            num++;
            int i;
            for (i = 1; i <= 20; i++) {
                if (num % i != 0) {
                    //System.out.println(num + " " + i);
                    i = 25;
                    //System.out.println(num + " " + i);
                }
            }
            if (i != 26) {
                isWrong = false;
            }
            //System.out.println(num + " " + i + " ");
        }
        System.out.println("Yay! The solution is: " + num);

    }
}
