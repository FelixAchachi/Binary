public class DecimalConversion {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 31, 100, 255, 256};

        for (int number : numbers) {

            String binary = Integer.toBinaryString(number);

            String hex = Integer.toHexString(number);

            System.out.println(number + " in binary is: " + binary + " and in hexadecimal is: " + hex);
        }
    }
}

