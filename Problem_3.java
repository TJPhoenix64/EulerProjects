public class Problem_3 
{
    public static void main(String[] args) {
        int answer = 0;
        long i;
        long bigNumber = 600851475143L;
        Long[] factorsOfBigNumber = new Long[10000];
        int locationOfStuff = 0; 
        for (i = 2; i < bigNumber / i; i++) {
            if (bigNumber % i == 0) {
                factorsOfBigNumber[locationOfStuff] = i;
                locationOfStuff++;
                factorsOfBigNumber[locationOfStuff] = bigNumber / i;
                locationOfStuff++;
                System.out.println(i + " " + bigNumber / i);
            }
        }
        //finds the prime factors of the big number
        for(int l = 0; l < locationOfStuff; l++){
            for(int y = 0; y < factorsOfBigNumber[locationOfStuff]; y++){
                int numOfNonFactors = 0;
                if(factorsOfBigNumber[l] % y != 0){
                    numOfNonFactors++;
                }
                if(factorsOfBigNumber[l] % y == 0){
                    break;
                }
            }
        }
        System.out.println("Yay! The answer is: " + answer);
        
    }
}
