package CaesarCipher;

public class Encrypt {
    public static String encrypter(String story, int shift) {
        String encResult = "";

//        if (shift > 26) {
//            shift = shift % 26;
//        } else if (shift < 0) {
//            shift = (shift % 26) + 26;
//        }

        for (int i = 0; i < story.length(); i++) {
            if (Character.isUpperCase(story.charAt(i))) {
                char character = (char) (((int) story.charAt(i) +
                        shift));
                if(character >'Z'){
                    encResult+=((char)( story.charAt(i) -(26-shift)));
                } else {
                    encResult+=(character);
                }


            } else {
                char character = (char) (((int) story.charAt(i) +
                        shift - 97) % 26 + 97);
                if(character >'z'){
                    encResult += ((char)( story.charAt(i) -(26-shift)));
                } else {
                    encResult+=(character);
                }

            }

        }
        return encResult;
    }

}