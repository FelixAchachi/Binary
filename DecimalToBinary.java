import java.util.Random;

public class DecimalToBinary {
    public static void main(String[] args) {
        Random rng = new Random();

        for (int i = 0; i < 30; i++) {

            double decimal = rng.nextDouble() * 1000;

            String binary = Integer.toBinaryString((int) Math.round(decimal * 1000));

            System.out.println(decimal + " in binary is: " + binary);
        }
    }
}
