public class FizzBuzzConverter {


    public String convert(int codetoconvert) {
        if(codetoconvert%3==0){
            return "fizz";
        }
        if(codetoconvert%5==0){
            return "buzz";
        }

        return codetoconvert+"";
    }
}
