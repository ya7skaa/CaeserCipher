package CeaserCipher;

public class Decrypt {
    public static String decrypter(String story, int shift) {
        String dncResult = "";

        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }


        for (int i = 0; i < story.length(); i++) {
            if (Character.isUpperCase(story.charAt(i))) {
                char character = (char) (((int) story.charAt(i) -
                        shift - 65) % 26 + 65);
                if(character <'A'){
                    dncResult+=((char)( story.charAt(i) +(26-shift)));
                } else {
                    dncResult+=(character);
                }

            } else {
                char character = (char) (((int) story.charAt(i) -
                        shift- 97) % 26 + 97);
                if(character <'a'){
                    dncResult+=((char)( story.charAt(i) +(26-shift)));
                } else {
                    dncResult+=(character);
                }

            }

        }

        return dncResult;
    }

}

