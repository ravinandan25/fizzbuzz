import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
   FizzBuzzConverter fizbuzz=new FizzBuzzConverter();
   @Test
   public void fizzBuzzconverterLeavesNormalNumberAlone(){

      Assert.assertEquals("1",fizbuzz.convert(1));
      Assert.assertEquals("2",fizbuzz.convert(2));
   }
   @Test
   public void fizzBuzzconverternumberisdivisibelby3(){

      Assert.assertEquals("fizz",fizbuzz.convert(3));

   }
   @Test
   public void fizzBuzzconverternumberisdivisibelby5(){

      Assert.assertEquals("buzz",fizbuzz.convert(5));

   }
   @Test
   public void fizzBuzzconverternumberisdivisibelby5and3(){

      Assert.assertEquals("fizzbuzz",fizbuzz.convert(15));

   }

}
