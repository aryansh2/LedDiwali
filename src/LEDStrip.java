public class LEDStrip {
    private LED[] LEDArray;
    private int lengthOfStrip;

    public LEDStrip(int lengthOfStrip) {
        this.lengthOfStrip = lengthOfStrip;
        this.LEDArray = new LED[lengthOfStrip];
    }

    private int getLengthOfStrip() {
        return lengthOfStrip;
    }

    public LED[] getLEDArray() {
        return LEDArray;
    }

    public void setLEDArray(LED[] LEDArray) {
        this.LEDArray = LEDArray;
    }

    public int numberOfDefectiveLED() {
        int result = 0;
        for (LED led : LEDArray) {
            if (!led.isWorking()) {
                result++;
            }
        }
        return result;
    }

    private boolean isStripDefective() {
        return numberOfDefectiveLED() > (getLengthOfStrip() / 2);
    }

    public void showStripStatus() {
        System.out.println(isStripDefective() ? "This strip is defective!" : "This strip is not defective!");
    }


}
