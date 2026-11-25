public class finnobaci{
    public static void main(String[] args) {
        int count = 10;
        int num1 = 0;
        int num2 = 1;

        System.out.print("First " + count + " numbers: ");

        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");

            // Calculate the next number in the sequence
            int nextNum = num1 + num2;

            // Shift values forward for the next loop iteration
            num1 = num2;
            num2 = nextNum;
        }
    }
}
