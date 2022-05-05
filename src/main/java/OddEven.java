public class OddEven {

    public java.lang.String oddEven(long number){
        java.lang.String odd = "Odd";
        java.lang.String even = "Even";
        java.lang.String undefined = "Undefined";

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
