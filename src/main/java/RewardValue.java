public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;


    //Constructor that accepts cash.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    //Constructor that accepts miles.
    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    private static int convertToMiles(double cashValue){
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    //getCashValue Method
    public double getCashValue() {

        return cashValue;
    }
    //getMilesValue Method
    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}
