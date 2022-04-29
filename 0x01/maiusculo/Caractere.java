public class Caractere {
    public static boolean EhMaiusculo(char c){
        int decimalChar = c;

        if (decimalChar >= 65 && decimalChar <= 90){
            return true;
        }

        return false;
    }
}
