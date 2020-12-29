import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
   @Test
   public void fizzBuzzconverterLeavesNormalNumberAlone(){
      FizzBuzzConverter fizbuzz=new FizzBuzzConverter();
      Assert.assertEquals("1",fizbuzz.convert(1));
      Assert.assertEquals("2",fizbuzz.convert(2));
   }
   @Test
   public void fizzBuzzconverternumberisdivisibelby3(){
      FizzBuzzConverter fizbuzz=new FizzBuzzConverter();
      Assert.assertEquals("fizz",fizbuzz.convert(3));

   }
   @Test
   public void fizzBuzzconverternumberisdivisibelby5(){
      FizzBuzzConverter fizbuzz=new FizzBuzzConverter();
      Assert.assertEquals("buzz",fizbuzz.convert(5));

   }

}
