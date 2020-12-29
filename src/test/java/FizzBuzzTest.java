import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
   @Test
   public void fizzBuzzconverterLeavesNormalNumberAlone(){
      FizzBuzzConverter fizbuzz=new FizzBuzzConverter();
      Assert.assertEquals("1",fizbuzz.convert(1));
      Assert.assertEquals("2",fizbuzz.convert(2));
   }


}
