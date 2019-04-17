import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CustomCalculatorTest {
    @Test
    public void addtest(){
        CustomCalculator cal=new CustomCalculator();
        int result=cal.add(3,4);
        assertTrue(result==7);

        System.out.println("result :: " + result);
    }
    @Test
    public void subtest(){
        CustomCalculator cal=new CustomCalculator();
        int result=cal.subtract(10,2);
        assertTrue(result==8);
    }
    @Test
    public void divtest(){
        CustomCalculator cal=new CustomCalculator();
        int result=cal.divide(10,2);
        assertTrue(result==8);
    }
    @Test
    public void multest(){
        CustomCalculator cal=new CustomCalculator();
        int result=cal.multiply(3,4);
        assertTrue(result==7);
    }
}