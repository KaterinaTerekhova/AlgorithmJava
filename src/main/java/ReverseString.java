public class ReverseString {


    public String reverseStringAlgorithm(String str) {
        char ch;
       String nstr = "";
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }
}
