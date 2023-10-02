public class RewardValue {
    double miles;


    //Two constructors
    //Constructor that accepts cash.
    public RewardValue(double cashValue) {
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
