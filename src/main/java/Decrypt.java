package CeaserCipher;

public class Decrypt {
    public static String Builder decrypter(String story, int shift){
        StringBuilder dncResult = new StringBuilder();
        if (shift>26){
            shift= shift % 26;
        } else if (shift<0){
            shift=(shift % 26)+ 26;
        }

    }
}
