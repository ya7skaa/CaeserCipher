package CaesarCipher;

public class Encrypt {
    public static StringBuilder encrypter(String story, int shift) {
        StringBuilder encResult = new StringBuilder();

        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        for (int i = 0; i < story.length(); i++) {
            if (Character.isUpperCase(story.charAt(i))) {
                char character = (char) (((int) story.charAt(i) +
                        shift - 65) % 26 + 65);
                if(character >'Z'){
                    encResult.append((char)( story.charAt(i) -(26-shift)));
                } else {
                    encResult.append(character);
                }


            } else {
                char character = (char) (((int) story.charAt(i) +
                        shift - 97) % 26 + 97);
                if(character >'z'){
                    encResult.append((char)( story.charAt(i) -(26-shift)));
                } else {
                    encResult.append(character);
                }

            }

        }
        return encResult;
    }

}