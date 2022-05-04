import org.junit.Assert;

class PowerOf2Test {

    @org.junit.jupiter.api.Test
    void is_power_2_1() {
        boolean result = PowerOf2.is_power_2_brian(4);
        Assert.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test
    void is_power_2_2() {
        boolean result = PowerOf2.is_power_2_brian(7);
        Assert.assertEquals(false, result);
    }
}