import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxProfitTest1() {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int output = 8;
        Assert.assertEquals(output, new Solution().maxProfit(prices, fee));
    }

    @Test
    public void maxProfitTest2() {
        int[] prices = {1, 3, 7, 5, 10, 3};
        int fee = 3;
        int output = 6;
        Assert.assertEquals(output, new Solution().maxProfit(prices, fee));
    }

}
