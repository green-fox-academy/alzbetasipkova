import org.junit.Test;
import testing.Main;

import static junit.framework.TestCase.assertEquals;
public class GetRatioTester {


    @Test
    public void getRatio_PositiveInput_Returns(){


        double ratio =  Main.getRatio(6, 2);

        assertEquals(3, ratio, 0.0001);
    }

    @Test
    public void getRatio_dividedByZero_ReturnsRatio_ReturnsZero(){

        double ratio = Main.getRatio(6, 0);
        assertEquals(0, ratio, 0.0001);

    }

}