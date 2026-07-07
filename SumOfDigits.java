public class SumOfDigits {

    public int findSum(int number) {

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        return sum;
    }
}