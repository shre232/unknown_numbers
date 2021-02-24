

public class stringCalculator {


    public static int Add(String input) {

        String[] numbers = input.split(",|\n");
        int sum = 0;


        if (input.isEmpty()) {
            return 0;
        }
        if (input.length() == 1) {
            return Integer.parseInt(input);
        }
        else {
            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);

            }
            return sum;

        }


    }}




