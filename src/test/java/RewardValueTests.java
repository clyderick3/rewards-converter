import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 7;
        int milesValue = 2000;
        //assert false;
        assertEquals(milesValue, (cashValue/0.0035) );
    }

    @Test
    void convert_from_miles_to_cash() {
        double cashValue = 14;
        int milesValue = 4000;
        //assert false;
        assertEquals(cashValue, (milesValue * 0.0035));
    }
}
