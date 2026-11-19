public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");


        for (int num = 1; num <= 500; num++) {
            if (num <= 1) {
                continue;
            }

            boolean isPrime = true;


            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
