public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;


    //Two constructors
    //Constructor that accepts cash.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    //Constructor that accepts miles.
    //public RewardValue(double milesValue) {}

    //getCashValue Method
    public double getCashValue() {

        return miles * 0.0035;
    }
    //getMilesValue Method
    public double getMilesValue(){
        return miles;
    }
    //Miles to cash at a rate of 0.0035.
}
