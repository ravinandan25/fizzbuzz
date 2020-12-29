public class FizzBuzzConverter {


    public String convert(int codetoconvert) {
        if(codetoconvert%3==0){
            return "fizz";
        }

        return codetoconvert+"";
    }
}
