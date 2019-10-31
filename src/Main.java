import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int numberOfLEDS = Integer.parseInt(scanner.nextLine());
        LED[] LEDArray = new LED[numberOfLEDS];
        for (int i = 0; i < LEDArray.length; i++) {
            String colourName = scanner.next();
            boolean working = scanner.nextBoolean();
            LEDArray[i] = new LED(colourName, working);
        }
        LEDStrip ledStrip = new LEDStrip(numberOfLEDS);
        ledStrip.setLEDArray(LEDArray);
        System.out.println(ledStrip.numberOfDefectiveLED());
        ledStrip.showStripStatus();
        scanner.close();
    }
}