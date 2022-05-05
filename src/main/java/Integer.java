public class Integer {

    public java.lang.String integerM(int m) {

        java.lang.String goodNum = "Good Number";
        java.lang.String badNum = "Bad Number";
        java.lang.String poorNum = "Poor Number";
        java.lang.String doesn = "does not satisfy";

        if (m % 3 == 0 && m % 5 == 0) {
            return goodNum;
        }
        if (m % 3 == 0 && m % 5 != 0) {
            return badNum;
        }
        if (m % 5 == 0 && m % 3 != 0) {
            return poorNum;
        }
        return doesn;
    }
}
