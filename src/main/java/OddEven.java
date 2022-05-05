public class OddEven {

    public String oddEven(long number){
        String odd = "Odd";
        String even = "Evan";
        String undefined = "Undefined";

        if(number <= 2147483648L && number >= -2147483647L){
            if(number % 2 == 0){
                return even;
            }else {
                return odd;
            }
        }
        return undefined;
    }
}
