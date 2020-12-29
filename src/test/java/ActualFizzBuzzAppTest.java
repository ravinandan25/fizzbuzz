import org.junit.Test;

public class ActualFizzBuzzAppTest {
    @Test
    public void outputOfFizzBuzzApp(){
        FizzBuzzConverter fizzbuzz= new FizzBuzzConverter();
        for(int i=1;i<=100;i++){
            System.out.println(fizzbuzz.convert(i));
        }
    }
}
