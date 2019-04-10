import CaesarCipher.Encrypt;
import CeaserCipher.Decrypt;




import java.util.Scanner;


public class App {
    public static void main (String [] args){
        Scanner myConsole = new Scanner(System.in);
        System.out.println("What is your story?");
        String story = myConsole.nextLine();
        System.out.println("Enter your secret key");
        int shift =myConsole.nextInt();

        String encryptedString = Encrypt.encrypter(story,shift);
        String decryptedString = Decrypt.decrypter(encryptedString,shift);

//        Encrypt.encrypter("hello", 4);
        System.out.println("Here's your encrypted story");
        System.out.println(encryptedString);

        System.out.println("Here's your decrypted story");
        System.out.println(decryptedString);

    }


}
