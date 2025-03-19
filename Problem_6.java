
public class Problem_6 {

    public static void main(String[] args) {
        int difference = 0;
        int sumOfSquare = 0;
        int sum = 0;
        int squareOfSum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        squareOfSum = sum * sum;
        for (int i = 0; i <= 100; i++) {
            sumOfSquare += i * i;
        }
        difference = squareOfSum - sumOfSquare;
        System.out.println(difference);
    }
}
